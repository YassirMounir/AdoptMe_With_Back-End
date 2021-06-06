/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DellE5570
 */
public class Authen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Authen</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Authen at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String option = request.getParameter("act");
        int r;
        if (option.equals("Sign Up")) {
            String nom = request.getParameter("fname");
            String prenom = request.getParameter("lname");
            String numtel = request.getParameter("phonenumber");
            String city = request.getParameter("city");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            if (nom.isEmpty() || prenom.isEmpty() || numtel.isEmpty() || city.isEmpty() || email.isEmpty() || password.isEmpty()) {
                request.setAttribute("message", "Registration Error: Please fill in empty fields.");
                request.getRequestDispatcher("JSP/SignUp.jsp").forward(request, response);
            } else {
                try {
                    String req = "insert into proprietaire values ('P' || id_pro_c.nextval,'" 
                            + nom + "','" + prenom + "','" + numtel + "','" + city + "','" + email + "','" + password + "')";
                    System.out.println(req);
                    r = Connexion.Seconnecter().createStatement().executeUpdate(req);
                    if (r != 0) {
                        response.sendRedirect("JSP/SignIn.jsp");
                    } else {
                        request.setAttribute("message", "Registration Error: Please try again later.");
                        request.getRequestDispatcher("JSP/SignUp.jsp").forward(request, response);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Authen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (option.equals("Sign In")) {
            try {
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                if (email.isEmpty() || password.isEmpty()) {
                    request.setAttribute("message", "Sign In Error: Please fill in empty fields.");
                    request.getRequestDispatcher("JSP/SignIn.jsp").forward(request, response);
                } else {
                    String req = "select * from proprietaire where email ='" + email + "' and PASS ='" + password + "'";
                    System.out.println(req);
                    ResultSet R = Connexion.Seconnecter().createStatement().executeQuery(req);
                    if (R.next()) {
                        request.getSession().setAttribute("id", R.getObject(1));
                        response.sendRedirect("JSP/Profile.jsp");
                    } else {
                        request.setAttribute("message", "Sign In Error: Login Or Password Mismatch.");
                        request.getRequestDispatcher("JSP/SignIn.jsp").forward(request, response);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Authen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (option.equals("DISCONNECT")) {
            request.getSession().invalidate();
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

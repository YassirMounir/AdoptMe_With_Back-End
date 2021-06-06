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
public class MAJAnimal extends HttpServlet {

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
            out.println("<title>Servlet MAJAnimal</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MAJAnimal at " + request.getContextPath() + "</h1>");
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
        String option = request.getParameter("confirm");
        int r;
        if (option.equals("Submit")) {
            String nom = request.getParameter("nom");
            String age = request.getParameter("age");
            String poids = request.getParameter("poids");
            String race = request.getParameter("race");
            String sexe = request.getParameter("sexe");
            String couleur = request.getParameter("couleur");
            String desc = request.getParameter("description");
            if (nom.isEmpty() || age.isEmpty() || poids.isEmpty() || race.isEmpty() || sexe.isEmpty() || couleur.isEmpty() || desc.isEmpty()) {
                request.setAttribute("message", "Add Error: Please fill in empty fields.");
                request.getRequestDispatcher("JSP/Addanimal.jsp").forward(request, response);
            } else {
                try {
                    String req = "insert into animal values ('A' || id_an_c.nextval,'" + request.getSession().getAttribute("id") + "','"
                            + nom + "'," + age + ",'" + poids + "','" + race + "','" + sexe + "','" + couleur + "','" + desc + "')";
                    System.out.println(req);
                    r = Connexion.Seconnecter().createStatement().executeUpdate(req);
                    if (r != 0) {
                        response.sendRedirect("JSP/Profile.jsp");
                    } else {
                        request.setAttribute("message", "Add Error: Please try again later.");
                        request.getRequestDispatcher("JSP/Addanimal.jsp").forward(request, response);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MAJAnimal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        if (option.equals("Cancel")) {
            response.sendRedirect("JSP/Profile.jsp");
        }
        if (option.equals("yes")) {
            String nom = request.getParameter("search");
            String Animals = request.getParameter("Animals");
            String city = request.getParameter("city");
            if (nom.isEmpty() && Animals.isEmpty() && city.isEmpty()) {
                request.setAttribute("message", "Searsh Error: Please fill in empty fields.");
                request.getRequestDispatcher("JSP/Pets.jsp").forward(request, response);
            } else {
                try {
                    String req = "select * from animal natural join proprietaire where 1=1 ";
                    if (!nom.isEmpty()) {
                        req += "and upper(nom_an) ='" + nom.toUpperCase() + "' ";
                        System.out.println(req);
                    }
                    if (!Animals.isEmpty()) {
                        req += "and upper(race) ='" + Animals.toUpperCase() + "' ";
                        System.out.println(req);
                    }
                    if (!city.isEmpty()) {
                        req += "and upper(ville) ='" + city.toUpperCase() + "' ";
                        System.out.println(req);
                    }
                    ResultSet R = Connexion.Seconnecter().createStatement().executeQuery(req);
                    System.out.println(req);
                        request.setAttribute("result",R);
                        request.getRequestDispatcher("JSP/Pets.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(MAJAnimal.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
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

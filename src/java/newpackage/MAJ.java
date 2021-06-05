/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
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
public class MAJ extends HttpServlet {

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
            out.println("<title>Servlet MAJ</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MAJ at " + request.getContextPath() + "</h1>");
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
        String option = request.getParameter("maj");
        int r;
        if (option.equals("Modify")) {
            try {
                String nom = request.getParameter("mdnom");
                String prenom = request.getParameter("mdprenom");
                String ville = request.getParameter("mdville");
                String tele = request.getParameter("mdtele");
                String mail = request.getParameter("mdemail");
                if (nom.isEmpty() || prenom.isEmpty() || ville.isEmpty() || tele.isEmpty() || mail.isEmpty()) {
                    request.setAttribute("message", "Modification Error: Please fill in empty fields.");
                    request.getRequestDispatcher("JSP/Profile.jsp").forward(request, response);
                } else {
                    String req = "update proprietaire set nom='" + nom + "',prenom='" + prenom + "',numtel='"
                            + tele + "',ville='" + ville
                            + "',email='" + mail + "' WHERE id_pro='" + request.getSession().getAttribute("id").toString() + "'";
                    System.out.println(req);
                    r = Connexion.Seconnecter().createStatement().executeUpdate(req);

                    if (r != 0) {
                        response.sendRedirect("JSP/Profile.jsp");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Authen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (option.equals("Delete My Profile")) {
            try {
                String req = "delete from proprietaire where id_pro ='" + request.getSession().getAttribute("id").toString() + "'";
                r = Connexion.Seconnecter().createStatement().executeUpdate(req);
                System.out.println(req);
                if (r != 0) {
                    request.getSession().invalidate();
                    response.sendRedirect(request.getContextPath() + "/index.jsp");
                } else {
                    request.setAttribute("message", "<p style='color:red;'>Suppression Error: Please Try Again Later.</p>");
                    request.getRequestDispatcher("JSP/Profile.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Authen.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
        if (option.equals("Post Adoption Request")) {
            response.sendRedirect("JSP/Addanimal.jsp");
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

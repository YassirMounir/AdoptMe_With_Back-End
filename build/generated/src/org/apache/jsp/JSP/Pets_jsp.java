package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import newpackage.Connexion;

public final class Pets_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/logo1111.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CSS/Home.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CSS/Header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CSS/Footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\" crossorigin=\"anonymous\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <title>PETS</title>\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            for (let index = 0; index < 6; index++) {\n");
      out.write("//        $(\".father\").append(` <div class = \"child\" >\n");
      out.write("//                <img style = \"margin-top:10px;\" src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/icons-avatar.png\" width = \"150\" height = \"150\">\n");
      out.write("//                <h2 style = \" text-shadow:none;\" > NAME : HULK </h2>\n");
      out.write("//                <h3> TYPE : DOG </h3>\n");
      out.write("//                <div class = \"separation\" > </div>\n");
      out.write("//                <p style = \"text-transform:capitalize;\"> description of the animal <br> bla bla bla bla bla bla bla bla bla </p>\n");
      out.write("//                </div>`)\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        })\n");
      out.write("        function f1() {\n");
      out.write("            var navbar = document.getElementById('nav');\n");
      out.write("            navbar.classList.toggle('show');\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("        <!-- HEADER BEGIN -->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"toggle-btn\" onclick=\"f1();\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span class=\"bottom-span\"></span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\" class=\"logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/logo1111.png\"/></a>\n");
      out.write("            </div>\n");
      out.write("            <nav id=\"nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"#\">PETS</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/About.jsp\">ABOUT</a></li>\n");
      out.write("                        ");
if (session.getAttribute("id") != null) {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/Profile.jsp\">MY PROFILE</a></li>\n");
      out.write("                    <li>  <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Authen\">\n");
      out.write("                            <input type=\"submit\" value=\"DISCONNECT\" name=\"act\" class=\"linkish\" style=\"background-color: transparent; border: 0; color: whitesmoke; cursor: pointer;\n");
      out.write("                                   display: inline;  outline: none;  font-size:  16px;  text-transform: uppercase;\"/> </form></li>\n");
      out.write("\n");
      out.write("                    ");
   } else {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/SignIn.jsp\">SIGN IN</a></li>              \n");
      out.write("                        ");
 }
      out.write("   \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- HEADER END -->\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MAJAnimal\" method=\"post\">\n");
      out.write("            <h2 style=\"margin: 30px;\">Welcome To Adopte Me</h2>\n");
      out.write("            <div class=\"main-search\">\n");
      out.write("                <div class=\"search-bar\">\n");
      out.write("                    <div class=\"search\">\n");
      out.write("                        <input type=\"text\" class=\"cls\" placeholder=\" What Are You Looking For?\" name=\"search\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"combo-box\">\n");
      out.write("                    <select class=\"lbl\" name=\"Animals\" id=\"cars\">\n");
      out.write("                        <option value=\"\"selected >All Categories</option>\n");
      out.write("                        <option value=\"dog\">Dogs</option>\n");
      out.write("                        <option value=\"cat\">Cats</option>\n");
      out.write("                        <option value=\"bird\">Birds</option>\n");
      out.write("                        <option value=\"fish\">Fish</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-city\">\n");
      out.write("                    <select class=\"lbl\" name=\"city\" id=\"city\">\n");
      out.write("                        <option value=\"\"selected>All Morocco</option>\n");
      out.write("                        <option value=\"Casablanca\">Casablanca</option>\n");
      out.write("                        <option value=\"Rabat\">Rabat</option>\n");
      out.write("                        <option value=\"Marrakech\">Marrakech</option>\n");
      out.write("                        <option value=\"Tanger\">Tanger</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-submitt\">\n");
      out.write("                    <button class=\"cl\" type=\"submit\" name=\"confirm\" value=\"yes\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");

            if (request.getAttribute("message") != null) {
                out.print("<p style='color: red '>" + request.getAttribute("message") + "</p>");
            }
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"upper-cont\">\n");
      out.write("            <div class=\"text\">\n");
      out.write("                <p class=\"title\">The Available Categories</p>\n");
      out.write("                <!--<p class=\"subtitle\">Popular categories</p>-->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cont\">\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <!-- <img style=\"margin-top:20px;\" src=\"./../PNG/icons-avatar.png\" width=\"72\" height=\"72\"> -->\n");
      out.write("                    <i style=\"margin-top:20px;\" class=\"fas fa-dog\"></i>\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Dogs</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <!-- <img style=\"margin-top:20px;\" src=\"./../PNG/icons-avatar.png\" width=\"72\" height=\"72\"> -->\n");
      out.write("                    <i style=\"margin-top:20px;\" class=\"fas fa-cat\"></i>\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Cats</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <!-- <img style=\"margin-top:20px;\" src=\"./../PNG/icons-avatar.png\" width=\"72\" height=\"72\"> -->\n");
      out.write("                    <i style=\"margin-top:20px;\" class=\"fas fa-dove\"></i>\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Birds</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <!-- <img style=\"margin-top:20px;\" src=\"./../PNG/icons-avatar.png\" width=\"72\" height=\"72\"> -->\n");
      out.write("                    <i style=\"margin-top:20px;\" class=\"fas fa-fish\"></i>\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Fish</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"upper-cont\">\n");
      out.write("            <div class=\"text\">\n");
      out.write("                <p class=\"title\" style=\"margin-right: 60px;\">The Available Cities</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cont\">\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <img style=\"margin-top:20px;border-radius: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/casa.png\" width=\"72\" height=\"72\">\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Casablanca</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <img style=\"margin-top:20px;border-radius: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/rabat.png\" width=\"72\" height=\"72\">\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Rabat</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <img style=\"margin-top:20px;border-radius: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/marakech.png\" width=\"72\" height=\"72\">\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Marrakech</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sml\">\n");
      out.write("                    <img style=\"margin-top:20px; border-radius: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/logo_tanger5.jpg\" width=\"72\" height=\"72\">\n");
      out.write("                    <div class=\"separator\"></div>\n");
      out.write("                    <div class=\"txt\">Tanger</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"father\">    \n");
      out.write("            ");
          ResultSet R;

                if (request.getAttribute("result") != null) {
                    R = (ResultSet) request.getAttribute("result");
                } else {
                    R = Connexion.Seconnecter().createStatement().executeQuery("select * from animal");
                }
                if (R.next()) {
                    do {
                        if (R.getObject(6).equals("dog")) {
                            out.print(" <div class = 'child' style='width:300px'>  "
                                    + "<img style='margin-top:10px; padding:20px 10px;' src='" + request.getContextPath() + "/PNG/dog.png' width='150' height='150'>"
                                    + "<h2 style = ' text-shadow:none;' > NAME : " + R.getObject(3) + " </h2>"
                                    + "<h3> RACE : " + R.getObject(6) + " </h3>"
                                    + "<div class = 'separation' > </div>"
                                    + "<p style = 'text-transform:capitalize;'> description of the animal <br> </p> <p style ='width:fit-content;'>" + R.getObject(9) + " </p>"
                                    + "<span style='text-decoration: none;padding:10px;color:black;margin-left:140px;'>See More<a class='fa fa-arrow-right' href='" + request.getContextPath() + "/JSP/PetProfile.jsp?id_an=" + R.getObject(1) + "' style='text-decoration: none; color:black;margin-left:10px;'></a></span>"
                                    + "</div>");
                        }
                        if (R.getObject(6).equals("cat")) {
                            out.print(" <div class = 'child' style='width:300px'>  "
                                    + " <img style ='margin-top:10px; padding:20px 10px;' src ='" + request.getContextPath() + "/PNG/cat.png' width='150' height='150'>"
                                    + "<h2 style = ' text-shadow:none;' > NAME : " + R.getObject(3) + " </h2>"
                                    + "<h3> RACE : " + R.getObject(6) + " </h3>"
                                    + "<div class = 'separation' > </div>"
                                    + "<p style = 'text-transform:capitalize;'> description of the animal <br> </p> <p style ='width:fit-content;'>" + R.getObject(9) + " </p>"
                                    + "<span style='text-decoration: none;padding:10px; color:black;margin-left:140px;'>See More<a class='fa fa-arrow-right' href='" + request.getContextPath() + "/JSP/PetProfile.jsp?id_an=" + R.getObject(1) + "' style='text-decoration: none; color:black;margin-left:10px;'></a></span>"
                                    + "</div>");
                        }
                        if (R.getObject(6).equals("bird")) {
                            out.print(" <div class = 'child' style='width:300px'>  "
                                    + " <img style ='margin-top:10px;  padding:20px 10px;' src ='" + request.getContextPath() + "/PNG/bird.png' width='150' height='150'>"
                                    + "<h2 style = ' text-shadow:none;' > NAME : " + R.getObject(3) + " </h2>"
                                    + "<h3> RACE : " + R.getObject(6) + " </h3>"
                                    + "<div class = 'separation' > </div>"
                                    + "<p style = 'text-transform:capitalize;'> description of the animal <br> </p> <p style ='width:fit-content;'>" + R.getObject(9) + " </p>"
                                    + "<span style='text-decoration: none;padding:10px; color:black;margin-left:140px;'>See More<a class='fa fa-arrow-right' href='" + request.getContextPath() + "/JSP/PetProfile.jsp?id_an=" + R.getObject(1) + "' style='text-decoration: none; color:black;margin-left:10px;'></a></span>"
                                    + "</div>");
                        }
                        if (R.getObject(6).equals("fish")) {
                            out.print(" <div class = 'child' style='width:300px'>  "
                                    + " <img style ='margin-top:10px;  padding:20px 10px;'src = '" + request.getContextPath() + "/PNG/fish.png' width='150' height='150'>"
                                    + "<h2 style = ' text-shadow:none;' > NAME : " + R.getObject(3) + " </h2>"
                                    + "<h3> RACE : " + R.getObject(6) + " </h3>"
                                    + "<div class = 'separation' > </div>"
                                    + "<p style = 'text-transform:capitalize;'> description of the animal <br> </p> <p style ='width:fit-content;'>" + R.getObject(9) + " </p>"
                                    + "<span style='text-decoration: none;padding:10px; color:black;margin-left:140px;'>See More<a class='fa fa-arrow-right' href='" + request.getContextPath() + "/JSP/PetProfile.jsp?id_an=" + R.getObject(1) + "' style='text-decoration: none; color:black;margin-left:10px;'></a></span>"
                                    + "</div>");
                        }

                    } while (R.next());

                }else out.print("<p style='color: red '>Searsh Error: No Pet Found.</p>");
 



            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-top\">\n");
      out.write("            <div class=\"footer-top-items\">\n");
      out.write("                <h2>Adopt Me</h2>\n");
      out.write("                <p>It's a platform which allows you to publish and also allows you to find animals to adopt all around Morocco.</p>\n");
      out.write("                <h2>FOLLOW US</h2>\n");
      out.write("                <br>\n");
      out.write("                <a class=\"fab fa-facebook-f social-icon\" href=\"https://www.facebook.com/\"></a>\n");
      out.write("                <a class=\"fab fa-twitter social-icon\" href=\"http://www.twitter.com/\"></a>\n");
      out.write("                <a class=\"fab fa-instagram social-icon\" href=\"http://www.instagram.com/\"></a>\n");
      out.write("                <a class=\"fab fa-youtube social-icon\" href=\"http://www.youtube.com/\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-top-items\">\n");
      out.write("                <h2>USEFUL LINKS</h2>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../index.jsp\">Home</a></li>\n");
      out.write("                    <!-- <li><a href=\"#\">Prestataires</a></li> -->\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/About.jsp\">About US</a></li>\n");
      out.write("                    <!--<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/SignUp.jsp\">Join US ?</a></li>-->\n");
      out.write("                    ");
if (session.getAttribute("id") != null) {
      out.write("\n");
      out.write("                    <li></li>\n");
      out.write("                        ");
   } else {
      out.write("\n");
      out.write("                    <li><li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/SignUp.jsp\">Join US ?</a></li></li>              \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/ContactUs.jsp\">Contact US</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-top-items\">\n");
      out.write("                <h2>FIND US</h2>\n");
      out.write("                <div class=\"tpitems\">\n");
      out.write("                    <i class=\"fa fa-map-pin icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;Rue Ibnou Nafis Résidence Ben Omar, IMM 375 Etage 4 N 21 Mâarif , Grand Casablanca,Morocco .\n");
      out.write("                    </span>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <i class=\"fa fa-phone icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 54 26 88</span>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <i class=\"fa fa-envelope icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;contact@AdoptMe.com</span>\n");
      out.write("                </div>   \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-bottom\">\n");
      out.write("            &copy;&nbsp;&nbsp;<b>Copyright 2021\n");
      out.write("                By</b>&nbsp;&nbsp;<b>ADOPT.ME</b>&nbsp;\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Addanimal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    if (session.getAttribute("id") == null) {
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/logo1111.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CSS/Header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CSS/Footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" \n");
      out.write("              integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\" \n");
      out.write("              crossorigin=\"anonymous\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@1,300&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');\n");
      out.write("\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body,\n");
      out.write("        input {\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            background-color: rgb(231, 229, 226);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            overflow: hidden;\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            flex-direction: column;\n");
      out.write("            padding: 0rem 5rem;\n");
      out.write("            padding: 10px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .forms-container{\n");
      out.write("            margin-top: 80px;\n");
      out.write("            /* margin-bottom: 80px; */\n");
      out.write("            /* margin-left: 40px; */\n");
      out.write("            margin: 60px auto;\n");
      out.write("            background-color: rgb(150, 132, 132);\n");
      out.write("            max-width: 700px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .title {\n");
      out.write("            font-size: 2.2rem;\n");
      out.write("            color: #444;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .input-field {\n");
      out.write("            max-width: 600px;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 85px;\n");
      out.write("            background-color: rgb(235, 235, 235);\n");
      out.write("            margin:  5px;\n");
      out.write("            padding: 0 0.4rem;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        .input-field input ,select{\n");
      out.write("            background: none;\n");
      out.write("            outline: none;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            line-height: 1;\n");
      out.write("            font-size: 1.1rem;\n");
      out.write("            width: 580px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .input-field input::placeholder {\n");
      out.write("            font-weight: 600;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            width: 150px;\n");
      out.write("            height: 49px;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            border-radius: 48px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background-color: rgb(88, 69, 69);\n");
      out.write("            color: #fff;\n");
      out.write("            font-weight: 800;\n");
      out.write("            margin: 10px 0;\n");
      out.write("        }\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: whitesmoke;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .input-fields{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 210px;\n");
      out.write("            width: 600px;\n");
      out.write("            background-color:rgb(235, 235, 235);\n");
      out.write("            margin: 10px 0;\n");
      out.write("            padding: 0 0.4rem;\n");
      out.write("            align-items: center;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        .input-fields textarea{\n");
      out.write("            background: none;\n");
      out.write("            overflow: hidden;\n");
      out.write("            outline: none;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            line-height: 1;\n");
      out.write("            font-size: 1.1rem;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            resize: none;\n");
      out.write("            background-color:rgb(235, 235, 235);\n");
      out.write("            width: 580px;\n");
      out.write("            height: 150px;\n");
      out.write("        }\n");
      out.write("        .input-fields input::placeholder {\n");
      out.write("            font-weight: 600;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function f1() {\n");
      out.write("            var navbar = document.getElementById('nav');\n");
      out.write("            navbar.classList.toggle('show');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"toggle-btn\" onclick=\"f1();\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span class=\"bottom-span\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"../index.jsp\" class=\"logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/logo1111.png\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <nav id=\"nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../index.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/Pets.jsp\">PETS</a></li>\n");
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
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"forms-container\">\n");
      out.write("            <div class=\"signin-signup\">\n");
      out.write("                <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MAJAnimal\" method=\"post\"class=\"sign-up-form\">\n");
      out.write("                    <h2 class=\"title\">Enter Your Pet Informations</h2>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        Name : <br>\n");
      out.write("                        <input type=\"text\" name=\"nom\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        Age : <br>\n");
      out.write("                        <input type=\"text\" name=\"age\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        Weight : <br>\n");
      out.write("                        <input type=\"text\" name=\"poids\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        Race : <br>\n");
      out.write("                        <select name=\"race\">\n");
      out.write("                            <option value=\"dog\" selected>Dog</option>\n");
      out.write("                            <option value=\"cat\">Cat</option>\n");
      out.write("                            <option value=\"bird\">Bird</option>\n");
      out.write("                            <option value=\"fish\">Fish</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        Sexe : <br>\n");
      out.write("                        <select name=\"sexe\">\n");
      out.write("                            <option value=\"male\">Male</option>\n");
      out.write("                            <option value=\"female\">Female</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        Color : <br>\n");
      out.write("                        <input type=\"text\" name=\"couleur\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-fields\">\n");
      out.write("                        Description :\n");
      out.write("                        <div class=\"txtnpt\">\n");
      out.write("                            <textarea id=\"txtarea\" cols=\"100\" rows=\"8\" name=\"description\" style=\"padding: 5px;\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        if (request.getAttribute("message") != null) {
                            out.print("<p style='color: red '>" + request.getAttribute("message") + "</p>");
                        }
                    
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"submit\" class=\"btn\" value=\"Submit\" name=\"confirm\" style=\"margin-right: 20px;\"/>\n");
      out.write("                        <input type=\"submit\" class=\"btn\" value=\"Cancel\" name=\"confirm\" style=\"margin-left: 20px;\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-top\">\n");
      out.write("                <div class=\"footer-top-items\">\n");
      out.write("                    <h2>Adopt Me</h2>\n");
      out.write("                    <p>It's a platform which allows you to publish and also allows you to find animals to adopt all\n");
      out.write("                        around Morocco.</p>\n");
      out.write("                    <h2>FOLLOW US</h2>\n");
      out.write("                    <br>\n");
      out.write("                    <a class=\"fab fa-facebook-f social-icon\" href=\"https://www.facebook.com/\"></a>\n");
      out.write("                    <a class=\"fab fa-twitter social-icon\" href=\"http://www.twitter.com/\"></a>\n");
      out.write("                    <a class=\"fab fa-instagram social-icon\" href=\"http://www.instagram.com/\"></a>\n");
      out.write("                    <a class=\"fab fa-youtube social-icon\" href=\"http://www.youtube.com/\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-top-items\">\n");
      out.write("                    <h2>USEFUL LINKS</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"../index.jsp\">Home</a></li>\n");
      out.write("                        <!-- <li><a href=\"#\">Prestataires</a></li> -->\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/About.jsp\">About US</a></li>\n");
      out.write("                        <!--<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/SignUp.jsp\">Join US ?</a></li>-->\n");
      out.write("                        ");
if (session.getAttribute("id") != null) {
      out.write("\n");
      out.write("                        <li></li>\n");
      out.write("                            ");
   } else {
      out.write("\n");
      out.write("                        <li><li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/SignUp.jsp\">Join US ?</a></li></li>              \n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/ContactUs.jsp\">Contact US</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-top-items\">\n");
      out.write("                    <h2>FIND US</h2>\n");
      out.write("                    <div class=\"tpitems\">\n");
      out.write("                        <i class=\"fa fa-map-pin icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;Rue Ibnou Nafis Résidence\n");
      out.write("                            Ben Omar, IMM 375 Etage 4 N 21 Mâarif , Grand Casablanca,Morocco .\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <i class=\"fa fa-phone icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 54 26\n");
      out.write("                            88</span>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <i class=\"fa fa-envelope icon\"\n");
      out.write("                           aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;contact@AdoptMe.com</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-bottom\">\n");
      out.write("                <!-- © 2021 M3alem All rights reserved. -->\n");
      out.write("                &copy;&nbsp;&nbsp;<b>Copyright 2021\n");
      out.write("                    By</b>&nbsp;&nbsp;<b>ADOPT.ME</b>&nbsp;\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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

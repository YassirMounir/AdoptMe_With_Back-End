package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import newpackage.Connexion;
import java.sql.ResultSet;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
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
      out.write("        <title>MY PROFILE</title>\n");
      out.write("    </head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function f1() {\n");
      out.write("            var navbar = document.getElementById('nav');\n");
      out.write("            navbar.classList.toggle('show');\n");
      out.write("        }\n");
      out.write("        var x;\n");
      out.write("        function Confirmation()\n");
      out.write("        {\n");
      out.write("            if (x.value === \"Delete My Profile\")\n");
      out.write("            {\n");
      out.write("                if (window.confirm(\"Do You Want To Delete Your Profile ?\"))\n");
      out.write("                {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else if (x.value === \"Modify\")\n");
      out.write("            {\n");
      out.write("                if (window.confirm(\"Do You Want To Change Your Information ?\"))\n");
      out.write("                {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function  recuperer_etat(b)\n");
      out.write("        {\n");
      out.write("            x = b;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@1,300&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');\n");
      out.write("\n");
      out.write("        html,\n");
      out.write("        body {\n");
      out.write("            height: fit-content;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: 'Poppins', sans-serif !important;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            /* to hide extra right space in iPhone 5/SE */\n");
      out.write("            font-size: 100%;\n");
      out.write("            vertical-align: baseline;\n");
      out.write("            background: transparent;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        * {\n");
      out.write("            -webkit-box-sizing: border-box;\n");
      out.write("            -moz-box-sizing: border-box;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main-div {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: row;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .first-child img {\n");
      out.write("            border-radius: 50%;\n");
      out.write("            width: 200px;\n");
      out.write("            height: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .first-child {\n");
      out.write("            background-color: #584545;\n");
      out.write("            border-radius: 40px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            width: 300px;\n");
      out.write("            height: 400px;\n");
      out.write("            margin: 10px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .second-child {\n");
      out.write("            background-color: #856b6b;\n");
      out.write("            border-radius: 40px;\n");
      out.write("            width: 800px;\n");
      out.write("            height: 400px;\n");
      out.write("            margin: 10px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-evenly;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .information {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("        }\n");
      out.write("        .bigger{\n");
      out.write("            margin: 60px;\n");
      out.write("            padding: 20px;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #ligne {\n");
      out.write("            background-color: gray;\n");
      out.write("            height: 1px;\n");
      out.write("            width: 650px;\n");
      out.write("        }\n");
      out.write("        .submit{\n");
      out.write("            margin-top: 30px;\n");
      out.write("            margin-left: 50%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        #inputid{\n");
      out.write("            background: none;\n");
      out.write("            border: none;\n");
      out.write("            font-size: 20px;\n");
      out.write("            color: whitesmoke;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #inputid{\n");
      out.write("            background: none;\n");
      out.write("            border: none;\n");
      out.write("            font-size: 20px;\n");
      out.write("            color: whitesmoke;\n");
      out.write("            width: 150px;\n");
      out.write("        }\n");
      out.write("        .container{\n");
      out.write("            /* background-color: whitesmoke; */\n");
      out.write("            margin: 80px 0px 80px 0px;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .father{\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            justify-content: space-around;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .child{\n");
      out.write("            /* border: 1px solid black ; */\n");
      out.write("            border-radius: 20px;\n");
      out.write("            /* margin: 20px 40px 20px 10px ; */\n");
      out.write("            margin-left: 2%;\n");
      out.write("            margin-bottom: 10%;\n");
      out.write("            margin-right: 2%;\n");
      out.write("            background-color: #856b6b;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            box-shadow: rgba(49, 49, 99, 0.315) 0px 6px 12px -2px, rgba(0, 0, 0, 0.3) 0px 3px 7px -3px;\n");
      out.write("            transition: 1s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p{\n");
      out.write("            padding: 0px 25px;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            margin-bottom: -20px;\n");
      out.write("        }\n");
      out.write("        .separation{\n");
      out.write("            height: 1px;\n");
      out.write("            width: 240px;\n");
      out.write("            background-color:rgba(22, 22, 22, 0.253);\n");
      out.write("        }\n");
      out.write("        .myanimal{\n");
      out.write("            background-color: #584545;\n");
      out.write("            border-radius: 40px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: whitesmoke;\n");
      out.write("            margin: 0 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"toggle-btn\" onclick=\"f1();\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span class=\"bottom-span\"></span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"./../index.png\" class=\"logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/logo1111.png\"/></a>\n");
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
      out.write("                    <li><a href=\"#\">MY PROFILE</a></li>\n");
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
      out.write("        ");

            ResultSet R = Connexion.Seconnecter().createStatement().executeQuery("select * from proprietaire where ID_PRO='" + request.getSession().getAttribute("id") + "'");
            R.next();
        
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MAJ\" method=\"post\" onsubmit=\"return Confirmation();\">\n");
      out.write("            <div class=\"bigger\">\n");
      out.write("                <div class=\"main-div\">\n");
      out.write("                    <div class=\"first-child\">\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PNG/DefaultProfile.jpg\">\n");
      out.write("                        <p style=\"color: whitesmoke; font-size: 20px;\">");
out.print("Hello : " + R.getObject(2) + " " + R.getObject(3));
      out.write("</p>\n");
      out.write("                        <p style=\"color: whitesmoke;\">");
      out.print(R.getObject(5));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"second-child\">\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <h4 style=\"text-transform: uppercase;\">Information</h4>\n");
      out.write("                            <div id=\"ligne\"></div>\n");
      out.write("                            <div class=\"information\">\n");
      out.write("                                <div class=\"full-name\" style=\"color: whitesmoke;\">\n");
      out.write("                                    <br> Full Name : <br>\n");
      out.write("                                    <input type=\"text\" value=\"");
      out.print(R.getObject(2));
      out.write("\"\n");
      out.write("                                           id=\"inputid\" name=\"mdnom\">\n");
      out.write("                                    <input type=\"text\" value=\"");
      out.print(R.getObject(3));
      out.write("\"\n");
      out.write("                                           id=\"inputid\" name=\"mdprenom\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"City\" style=\"color: whitesmoke;\">\n");
      out.write("                                    <br> City : <br>\n");
      out.write("                                    <input type=\"text\" value=\"");
      out.print(R.getObject(5));
      out.write("\"\n");
      out.write("                                           style=\"background: none; border: none;font-size: 20px; color: whitesmoke;\" name=\"mdville\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <h4 style=\"text-transform: uppercase;\">Contact</h4>\n");
      out.write("                            <div id=\"ligne\"></div>\n");
      out.write("                            <div class=\"information\" style=\"color: whitesmoke;\">\n");
      out.write("                                <div class=\"phone-number\">\n");
      out.write("                                    <br> Phone : <br>\n");
      out.write("                                    <input type=\"text\"  value=\"");
      out.print(R.getObject(4));
      out.write("\"\n");
      out.write("                                           style=\"background: none; border: none; font-size: 20px; color: whitesmoke;\" name=\"mdtele\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"email\">\n");
      out.write("                                    <br> E-mail : <br>\n");
      out.write("                                    <input type=\"text\" value=\"");
      out.print(R.getObject(6));
      out.write("\"\n");
      out.write("                                           style=\"background: none; border: none; font-size: 20px; width: 250px; color: whitesmoke;\" name=\"mdemail\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    if (request.getAttribute("message") != null) {
                        out.print("<p style='color: red '>" + request.getAttribute("message") + "</p>");
                    }
                
      out.write("\n");
      out.write("                <div class=\"submit\">\n");
      out.write("                    <input type=\"submit\" value=\"Modify\" name=\"maj\" onclick=\"recuperer_etat(this)\" style=\"background-color: #584545; border: none; border-radius: 5px; font-size: 18px; padding: 5px 10px; color: whitesmoke;\">\n");
      out.write("                    <input type=\"submit\" value=\"Post Adoption Request\" name=\"maj\" style=\"background-color: #584545; border: none; border-radius: 5px; font-size: 18px; padding: 5px 10px; margin-left: 10px; color: whitesmoke;\">\n");
      out.write("                    <input type=\"submit\" value=\"Delete My Profile\" name=\"maj\" onclick=\"recuperer_etat(this)\" style=\"background-color: #584545; border: none; border-radius: 5px; font-size: 18px; padding: 5px 10px; margin-left: 10px; color: whitesmoke;\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div class=\"myanimal\">\n");
      out.write("            <h2 style=\"padding: 10px\"> My Animals </h2>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"father\">  \n");
      out.write("                    ");

                        R = Connexion.Seconnecter().createStatement().executeQuery("select * from animal where ID_PRO ='" + request.getSession().getAttribute("id") + "'");
                        while (R.next()) {
                            out.print(" <div class = 'child' style='width:300px'>  "
                                    + " <img style ='margin-top:10px; 'src = '../PNG/icons-avatar.png' width='150' height='150'>"
                                    + "<h2 style = ' text-shadow:none;' > NAME : " + R.getObject(3) + " </h2>"
                                    + "<h3> TYPE : " + R.getObject(6) + " </h3>"
                                    + "<div class = 'separation' > </div>"
                                    + "<p style = 'text-transform:capitalize;'> description of the animal <br> " + R.getObject(9) + " </p>"
                                    + "</div>");
                        }

                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-top\">\n");
      out.write("                <div class=\"footer-top-items\">\n");
      out.write("                    <h2>Adopt Me</h2>\n");
      out.write("                    <p>It's a platform which allows you to publish and also allows you to find animals to adopt all around Morocco.</p>\n");
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
      out.write("                        <i class=\"fa fa-map-pin icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;Rue Ibnou Nafis Résidence Ben Omar, IMM 375 Etage 4 N 21 Mâarif , Grand Casablanca,Morocco .\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <i class=\"fa fa-phone icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 54 26 88</span>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <i class=\"fa fa-envelope icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;contact@AdoptMe.com</span>\n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-bottom\">\n");
      out.write("                &copy;&nbsp;&nbsp;<b>Copyright 2021\n");
      out.write("                    By</b>&nbsp;&nbsp;<b>ADOPT.ME</b>&nbsp;\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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

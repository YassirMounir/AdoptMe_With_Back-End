package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"icon\" href=\"./PNG/logo1111.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/index.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/Header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"././CSS/Footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" \n");
      out.write("              integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\" \n");
      out.write("              crossorigin=\"anonymous\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <title>Adopt Me</title>\n");
      out.write("    </head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function f1() {\n");
      out.write("            var navbar = document.getElementById('nav');\n");
      out.write("            navbar.classList.toggle('show');\n");
      out.write("        }\n");
      out.write("\n");
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
      out.write("                <a href=\"#\" class=\"logo\"><img src=\"./PNG/logo1111.png\"/></a>\n");
      out.write("            </div>\n");
      out.write("            <nav id=\"nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">HOME</a></li>\n");
      out.write("                    <li><a href=\"./JSP/Pets.jsp\">PETS</a></li>\n");
      out.write("                    <li><a href=\"./JSP/About.jsp\">ABOUT</a></li>\n");
      out.write("                        ");
if (session.getAttribute("id") != null) {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/Profile.jsp\">MY PROFILE</a></li>\n");
      out.write("                    <li>  <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Authen\">\n");
      out.write("                            <input type=\"submit\" value=\"DISCONNECT\" name=\"act\" class=\"linkish\" style=\"background-color: transparent;\n");
      out.write("                                   border: 0; color: whitesmoke; cursor: pointer;\n");
      out.write("                                   display: inline;  outline: none;  font-size:  16px;  \n");
      out.write("                                   text-transform: uppercase;\"/> </form></li>\n");
      out.write("                            ");
   } else {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/SignIn.jsp\">SIGN IN</a></li>              \n");
      out.write("                        ");
 }
      out.write("       \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- HEADER END -->\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <div class=\"herotext\">\n");
      out.write("                <div class=\"hero-text1\">\n");
      out.write("                    <h1 style=\"font-size:50px\">WELCOME TO ADOPTE ME</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"hero-text2\">\n");
      out.write("                    <h2>because every animal deserves a home</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"hero-text3\">\n");
      out.write("                    <!-- <div class=\"search\">\n");
      out.write("                      <input type=\"text\" class=\"cls\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("                      <button class=\"cl\" type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                    </div> -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <!-- <li><a href=\"#\">Prestataires</a></li> -->\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/About.jsp\">About US</a></li>\n");
      out.write("                            ");
if (session.getAttribute("id") != null) {
      out.write("\n");
      out.write("                        <li></li>\n");
      out.write("                            ");
   } else {
      out.write("\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/JSP/SignUp.jsp\">Join US ?</a></li>             \n");
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

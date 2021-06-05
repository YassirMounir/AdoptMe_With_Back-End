<%-- 
    Document   : ContactUs
    Created on : Jun 3, 2021, 5:22:22 PM
    Author     : DellE5570
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="${pageContext.request.contextPath}/PNG/logo1111.png">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/CU.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Header.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Footer.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
        <title>Contact Us</title>
    </head>
    <script type="text/javascript">
        function f1() {
            var navbar = document.getElementById('nav');
            navbar.classList.toggle('show');
        }

    </script>
    <body>
        <!-- HEADER BEGIN -->
        <header>
            <div class="toggle-btn" onclick="f1();">
                <span></span>
                <span></span>
                <span class="bottom-span"></span>
            </div>
            <div class="logo">
                <a href="./../index.html" class="logo"><img src="${pageContext.request.contextPath}/PNG/logo1111.png"/></a>
            </div>
            <nav id="nav">
                <ul>
                    <li><a href="./../index.jsp">HOME</a></li>
                    <li><a href="${pageContext.request.contextPath}/JSP/Pets.jsp">PETS</a></li>
                    <li><a href="${pageContext.request.contextPath}/JSP/About.jsp">ABOUT</a></li>
                        <%if (session.getAttribute("id") != null) {%>
                    <li><a href="${pageContext.request.contextPath}/JSP/Profile.jsp">MY PROFILE</a></li>
                    <li>  <form action="${pageContext.request.contextPath}/Authen" method="POST">
                            <input type="submit" value="DISCONNECT" name="act" class="linkish" style="background-color: 
                                   transparent; border: 0; color: whitesmoke; cursor: pointer;
                                   display: inline;  outline: none;  font-size:  16px;  text-transform: uppercase;"/> </form></li>

                    <%   } else {%>
                    <li><a href="${pageContext.request.contextPath}/JSP/SignIn.jsp">SIGN IN</a></li>              
                        <% }%>     
                </ul>
            </nav>
        </header>
        <!-- HEADER END -->
        <!-- <div class="container">
            <div>
                <h2>Feel Free To Contact Us</h2>
            </div>
              <div class="input-field">
                <i class="fas fa-user"></i>
                <input type="text" placeholder="ENTER YOUR NAME" />
            </div>
            <div class="input-field">
                <i class="fas fa-envelope"></i>
                <input type="email" placeholder="Email" />
            </div> -->
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">
                    <form action="#" class="sign-up-form">
                        <h2 class="title">Feel Free To Contact Us</h2>
                        <div class="input-field">
                            Enter Your Name : <br>
                            <input type="text"/>
                        </div>
                        <div class="input-field">
                            Enter Your Email : <br>
                            <input type="email" />
                        </div>
                        <div class="input-fields">
                            Enter Your Message Here :
                            <div class="txtnpt">
                                <textarea name="txt" id="txtarea" cols="100" rows="8" >
                                </textarea>
                            </div>
                        </div>
                        <input type="submit" class="btn" value="Submit" />
                    </form>
                </div>
            </div>
            <div class="flex-this">
                <div class="contact-container">
                    <div class="txth">
                        <h2>You Can Find US </h2>
                        <div class="tpitems">
                            <i class="fa fa-map-pin icon" aria-hidden="true"></i><span>&nbsp;&nbsp;Rue Ibnou Nafis Résidence Ben Omar, IMM 375 Etage 4 N 21 Mâarif ,<br> Grand Casablanca , Morocco .
                            </span>
                            <br>
                            <br>
                            <i class="fa fa-phone icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 54 26 88</span>
                            <br>
                            <br>
                            <i class="fa fa-envelope icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;contact@AdoptMe.com</span>
                        </div>   
                    </div>
                </div>
                <div class="contact-container2">
                    <div class="items">
                        <h2>FOLLOW US </h2>
                        <div class="flexag">
                            <a class="fab fa-facebook-f social-icon" href="https://www.facebook.com/"></a>
                            <a class="fab fa-twitter social-icon" href="http://www.twitter.com/"></a>
                            <a class="fab fa-instagram social-icon" href="http://www.instagram.com/"></a>
                            <a class="fab fa-youtube social-icon" href="http://www.youtube.com/"></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>




















































        <footer>
            <div class="footer-top">
                <div class="footer-top-items">
                    <h2>Adopt Me</h2>
                    <p>It's a platform which allows you to publish and also allows you to find animals to adopt all around Morocco.</p>
                    <h2>FOLLOW US</h2>
                    <br>
                    <a class="fab fa-facebook-f social-icon" href="https://www.facebook.com/"></a>
                    <a class="fab fa-twitter social-icon" href="http://www.twitter.com/"></a>
                    <a class="fab fa-instagram social-icon" href="http://www.instagram.com/"></a>
                    <a class="fab fa-youtube social-icon" href="http://www.youtube.com/"></a>
                </div>
                <div class="footer-top-items">
                    <h2>USEFUL LINKS</h2>
                    <ul>
                        <li><a href="./../index.jsp">Home</a></li>
                        <!-- <li><a href="#">Prestataires</a></li> -->
                        <li><a href="${pageContext.request.contextPath}/JSP/About.jsp">About US</a></li>
                            <%if (session.getAttribute("id") != null) {%>
                        <li></li>
                            <%   } else {%>
                        <li><a href="${pageContext.request.contextPath}/JSP/SignUp.jsp">Join US ?</a></li>             
                            <% }%>                      
                        <li><a href="${pageContext.request.contextPath}/JSP/ContactUs.jsp">Contact US</a></li>
                    </ul>
                </div>
                <div class="footer-top-items">
                    <h2>FIND US</h2>
                    <div class="tpitems">
                        <i class="fa fa-map-pin icon" aria-hidden="true"></i><span>&nbsp;&nbsp;Rue Ibnou Nafis Résidence Ben Omar, IMM 375 Etage 4 N 21 Mâarif , Grand Casablanca,Morocco .
                        </span>
                        <br>
                        <br>
                        <i class="fa fa-phone icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 54 26 88</span>
                        <br>
                        <br>

                        <i class="fa fa-envelope icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;contact@AdoptMe.com</span>


                    </div>   
                </div>
            </div>
            <div class="footer-bottom">
                <!-- © 2021 M3alem All rights reserved. -->
                &copy;&nbsp;&nbsp;<b>Copyright 2021
                    By</b>&nbsp;&nbsp;<b>ADOPT.ME</b>&nbsp;
                <!-- <div class="marq">
                  <marquee direction="right" scrollamount="10">&copy;&nbsp;<b>Copyright 2021
                      By</b>&nbsp;&nbsp;<b>ADOPT.ME</b>&nbsp;&copy;</marquee>
                </div> -->
            </div>
        </footer>
    </body>
</html>

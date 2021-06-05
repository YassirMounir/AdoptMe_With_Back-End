<%-- 
    Document   : index
    Created on : Jun 4, 2021, 7:27:27 PM
    Author     : DellE5570
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="./PNG/logo1111.png">
        <link rel="stylesheet" href="./CSS/index.css">
        <link rel="stylesheet" href="./CSS/Header.css">
        <link rel="stylesheet" href="././CSS/Footer.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" 
              integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" 
              crossorigin="anonymous" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>Adopt Me</title>
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
                <a href="#" class="logo"><img src="./PNG/logo1111.png"/></a>
            </div>
            <nav id="nav">
                <ul>
                    <li><a href="#">HOME</a></li>
                    <li><a href="./JSP/Pets.jsp">PETS</a></li>
                    <li><a href="./JSP/About.jsp">ABOUT</a></li>
                        <%if (session.getAttribute("id") != null) {%>
                    <li><a href="${pageContext.request.contextPath}/JSP/Profile.jsp">MY PROFILE</a></li>
                    <li>  <form method="POST" action="${pageContext.request.contextPath}/Authen">
                            <input type="submit" value="DISCONNECT" name="act" class="linkish" style="background-color: transparent;
                                   border: 0; color: whitesmoke; cursor: pointer;
                                   display: inline;  outline: none;  font-size:  16px;  
                                   text-transform: uppercase;"/> </form></li>
                            <%   } else {%>
                    <li><a href="${pageContext.request.contextPath}/JSP/SignIn.jsp">SIGN IN</a></li>              
                        <% }%>       
                </ul>
            </nav>
        </header>
        <!-- HEADER END -->
        <div class="hero-image">
            <div class="herotext">
                <div class="hero-text1">
                    <h1 style="font-size:50px">WELCOME TO ADOPTE ME</h1>
                </div>
                <div class="hero-text2">
                    <h2>because every animal deserves a home</h2>
                </div>
                <div class="hero-text3">
                    <!-- <div class="search">
                      <input type="text" class="cls" placeholder="Search.." name="search">
                      <button class="cl" type="submit"><i class="fa fa-search"></i></button>
                    </div> -->
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
                        <li><a href="#">Home</a></li>
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
                &copy;&nbsp;&nbsp;<b>Copyright 2021
                    By</b>&nbsp;&nbsp;<b>ADOPT.ME</b>&nbsp;
            </div>
        </footer>



    </body>
</html>

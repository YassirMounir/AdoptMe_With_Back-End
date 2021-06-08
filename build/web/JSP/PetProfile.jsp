
<%@page import="newpackage.Connexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="${pageContext.request.contextPath}/PNG/logo1111.png">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Header.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Footer.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>Pet Profile</title>
    </head>
    <script>
        function f1() {
            var navbar = document.getElementById('nav');
            navbar.classList.toggle('show');
        }
    </script>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@1,300&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');

        html,
        body {
            height: fit-content;
            padding: 0;
            margin: 0;
            font-family: 'Poppins', sans-serif !important;
            width: 100%;
            height: 100%;
            overflow-x: hidden;
            /* to hide extra right space in iPhone 5/SE */
            font-size: 100%;
            vertical-align: baseline;
            background: transparent;
        }

        * {
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;

        }

        .main-div {
            display: flex;
            flex-direction: row;
            flex-wrap: wrap;
            justify-content: center;
            margin: 40px;
        }

        .first-child img {
            border-radius: 50%;
            width: 200px;
            height: 200px;
        }

        .first-child {
            /* background-color: aqua; */
            background-color: #584545;
            border-radius: 40px;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            width: 300px;
            height: fit-content;
            margin: 10px;

        }

        .second-child {
            background-color: #856b6b;
            border-radius: 40px;
            width: fit-content;
            height: fit-content;
            margin: 10px;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: space-evenly;
        }

        .information {
            display: flex;
            justify-content: space-around;
        }

        .bigger {
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        #ligne {
            background-color: gray;
            height: 1px;
            width: 650px;
        }
        #txtarea {
            font-family: 'Poppins', sans-serif;
            background: none;
            overflow: hidden;
            outline: none;
            border: 1px solid black;
            line-height: 1;
            font-size: 1.1rem;
            border-radius: 10px;
            margin-top: 10px;
            resize: none;
            width: 580px;
            height: 150px;
            padding: 10px;
            color: whitesmoke;
        }

    </style>
    <body>
        <!-- HEADER BEGIN -->
        <header>
            <div class="toggle-btn" onclick="f1();">
                <span></span>
                <span></span>
                <span class="bottom-span"></span>
            </div>

            <div class="logo">
                <a href="${pageContext.request.contextPath}/index.jsp" class="logo"><img src="${pageContext.request.contextPath}/PNG/logo1111.png"/></a>
            </div>
            <nav id="nav">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">HOME</a></li>
                    <li><a href="${pageContext.request.contextPath}/JSP/Pets.jsp">PETS</a></li>
                    <li><a href="${pageContext.request.contextPath}/JSP/About.jsp">ABOUT</a></li>
                        <%if (session.getAttribute("id") != null) {%>
                    <li><a href="${pageContext.request.contextPath}/JSP/Profile.jsp">MY PROFILE</a></li>
                    <li>  <form method="POST" action="${pageContext.request.contextPath}/Authen">
                            <input type="submit" value="DISCONNECT" name="act" class="linkish" style="background-color: transparent; border: 0; color: whitesmoke; cursor: pointer;
                                   display: inline;  outline: none;  font-size:  16px;  text-transform: uppercase;"/> </form></li>

                    <%   } else {%>
                    <li><a href="${pageContext.request.contextPath}/JSP/SignIn.jsp">SIGN IN</a></li>              
                        <% }%>
                </ul>
            </nav>
        </header>
        <!-- HEADER END -->
        <%
            ResultSet R = Connexion.Seconnecter().createStatement().executeQuery("select * from animal natural join proprietaire where ID_an='" + request.getParameter("id_an") + "'");
            R.next();
            System.out.print("select * from animal natural join proprietaire where ID_an='" + request.getParameter("id_an") + "'");
        %>
        <div class="bigger">
            <div class="main-div">
                <div class="first-child">
                    <h4 style="text-transform: uppercase;">Owner Informations</h4>
                    <img src="${pageContext.request.contextPath}/PNG/DefaultProfile.jpg">
                    <p style="color: whitesmoke; font-size: 20px;"><%out.print(R.getObject(10) + " " + R.getObject(11));%></p>
                    <p style="color: whitesmoke;"><%out.print(R.getObject(13));%></p>
                    <p style="color: whitesmoke;"><%out.print(R.getObject(12));%></p>
                    <p style="color: whitesmoke;"><%out.print(R.getObject(14));%></p>

                </div>

                <div class="second-child">
                    <div style="padding: 20px;">
                        <div class="">
                            <h4 style="text-transform: uppercase;">Pet Informations</h4>
                            <div id="ligne"></div>
                            <div class="information">
                                <div class="full-name" style="color: whitesmoke; margin-right:90px;">
                                    <br>Name : <br>
                                    <input type="text" value="<%out.print(R.getObject(3));%>"
                                           style="background: none; border: none; font-size: 20px; color: whitesmoke;"
                                           readonly>
                                </div>
                                <div class="City" style="color: whitesmoke; margin-right: 25px; ">
                                    <br> Age : <br>
                                    <input type="text" value="<%out.print(R.getObject(4));%> Years"
                                           style="background: none; border: none; font-size: 20px; color: whitesmoke;"
                                           readonly>
                                </div>
                            </div>
                        </div>
                        <div class="">
                            <div class="information" style="color: whitesmoke;">
                                <div class="phone-number">
                                    <br> Poids : <br>
                                    <input type="text" value="<%out.print(R.getObject(5));%> KG"
                                           style="background: none; border: none; font-size: 20px; color: whitesmoke;"
                                           readonly>
                                </div>
                                <div class="email" style="margin-left: 80px;">
                                    <br> Race : <br>
                                    <input type="text" value="<%out.print(R.getObject(6));%>"
                                           style="background: none; border: none; font-size: 20px; width: 250px; color: whitesmoke;"
                                           readonly>
                                </div>
                            </div>
                        </div>
                        <div class="">
                            <div class="information" style="color: whitesmoke;">
                                <div class="phone-number">
                                    <br> Sexe : <br>
                                    <input type="text" value="<%out.print(R.getObject(7));%>"
                                           style="background: none; border: none; font-size: 20px; color: whitesmoke;"
                                           readonly>
                                </div>
                                <div class="email" style="margin-left: 80px;">
                                    <br> Couleur : <br>
                                    <input type="text" value="<%out.print(R.getObject(8));%>"
                                           style="background: none; border: none; font-size: 20px; width: 250px; color: whitesmoke;"
                                           readonly>
                                </div>
                            </div>
                        </div>
                        <div class="">
                            <div class="information" style="color: whitesmoke;">
                                <div class="phone-number">
                                    <br> Description : <br>
                                    <textarea name="txt" id="txtarea" cols="100" rows="8"
                                              readonly><%out.print(R.getObject(9));%> </textarea>
                                </div>
                            </div>
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
                        <li><a href="../index.jsp">Home</a></li>
                        <!-- <li><a href="#">Prestataires</a></li> -->
                        <li><a href="${pageContext.request.contextPath}/JSP/About.jsp">About US</a></li>
                        <!--<li><a href="${pageContext.request.contextPath}/JSP/SignUp.jsp">Join US ?</a></li>-->
                        <%if (session.getAttribute("id") != null) {%>
                        <li></li>
                            <%   } else {%>
                        <li><li><a href="${pageContext.request.contextPath}/JSP/SignUp.jsp">Join US ?</a></li></li>              
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

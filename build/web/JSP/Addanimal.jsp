<%-- 
    Document   : Addanimal
    Created on : Jun 5, 2021, 5:36:04 PM
    Author     : DellE5570
--%>
<%
    if (session.getAttribute("id") == null) {
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="${pageContext.request.contextPath}/PNG/logo1111.png">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Header.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Footer.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" 
              integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" 
              crossorigin="anonymous" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title></title>
    </head>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@1,300&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body,
        input {
            font-family: 'Poppins', sans-serif;
            background-color: rgb(231, 229, 226);

        }
        .container {
            overflow: hidden;
            display: flex;
            flex-wrap: wrap;
        }
        form {
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            padding: 0rem 5rem;
            padding: 10px;

        }
        .forms-container{
            margin-top: 80px;
            /* margin-bottom: 80px; */
            /* margin-left: 40px; */
            margin: 60px auto;
            background-color: rgb(150, 132, 132);
            max-width: 700px;
            border-radius: 20px;

        }
        .title {
            font-size: 2.2rem;
            color: #444;
            margin-bottom: 20px;
        }
        .input-field {
            max-width: 600px;
            width: 100%;
            height: 85px;
            background-color: rgb(235, 235, 235);
            margin:  5px;
            padding: 0 0.4rem;
            border-radius: 10px;
            padding: 10px;
        }
        .input-field input ,select{
            background: none;
            outline: none;
            border: 1px solid black;
            line-height: 1;
            font-size: 1.1rem;
            width: 580px;
            border-radius: 5px;
            margin-top: 10px;
        }
        .input-field input::placeholder {
            font-weight: 600;
        }
        .btn {
            width: 150px;
            height: 49px;
            border: none;
            outline: none;
            border-radius: 48px;
            cursor: pointer;
            background-color: rgb(88, 69, 69);
            color: #fff;
            font-weight: 800;
            margin: 10px 0;
        }
        .btn:hover {
            background-color: whitesmoke;
            color: black;
        }
        .input-fields{
            width: 100%;
            height: 210px;
            width: 600px;
            background-color:rgb(235, 235, 235);
            margin: 10px 0;
            padding: 0 0.4rem;
            align-items: center;
            border-radius: 10px;
            padding: 10px;
        }
        .input-fields textarea{
            background: none;
            overflow: hidden;
            outline: none;
            border: 1px solid black;
            line-height: 1;
            font-size: 1.1rem;
            border-radius: 10px;
            margin-top: 10px;
            resize: none;
            background-color:rgb(235, 235, 235);
            width: 580px;
            height: 150px;
        }
        .input-fields input::placeholder {
            font-weight: 600;
        }
    </style>
    <script type="text/javascript">
        function f1() {
            var navbar = document.getElementById('nav');
            navbar.classList.toggle('show');
        }

    </script>

    <body>
        <header>
            <div class="toggle-btn" onclick="f1();">
                <span></span>
                <span></span>
                <span class="bottom-span"></span>
            </div>
            <div class="logo">
                <a href="../index.jsp" class="logo"><img src="${pageContext.request.contextPath}/PNG/logo1111.png" /></a>
            </div>
            <nav id="nav">
                <ul>
                    <li><a href="../index.jsp">HOME</a></li>
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

        <div class="forms-container">
            <div class="signin-signup">
                <form action="${pageContext.request.contextPath}/MAJAnimal" method="post"class="sign-up-form">
                    <h2 class="title">Enter Your Pet Informations</h2>
                    <div class="input-field">
                        Name : <br>
                        <input type="text" name="nom"/>
                    </div>
                    <div class="input-field">
                        Age : <br>
                        <input type="text" name="age"/>
                    </div>
                    <div class="input-field">
                        Weight : <br>
                        <input type="text" name="poids"/>
                    </div>
                    <div class="input-field">
                        Race : <br>
                        <select name="race">
                            <option value="dog" selected>Dog</option>
                            <option value="cat">Cat</option>
                            <option value="bird">Bird</option>
                            <option value="fish">Fish</option>
                        </select>
                    </div>
                    <div class="input-field">
                        Sexe : <br>
                        <select name="sexe">
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                        </select>
                    </div>
                    <div class="input-field">
                        Color : <br>
                        <input type="text" name="couleur"/>
                    </div>
                    <div class="input-fields">
                        Description :
                        <div class="txtnpt">
                            <textarea id="txtarea" cols="100" rows="8" name="description" style="padding: 5px;"></textarea>
                        </div>
                    </div>
                    <%
                        if (request.getAttribute("message") != null) {
                            out.print("<p style='color: red '>" + request.getAttribute("message") + "</p>");
                        }
                    %>
                    <div>
                        <input type="submit" class="btn" value="Submit" name="confirm" style="margin-right: 20px;"/>
                        <input type="submit" class="btn" value="Cancel" name="confirm" style="margin-left: 20px;"/>
                    </div>
                </form>
            </div>
        </div>
        <footer>
            <div class="footer-top">
                <div class="footer-top-items">
                    <h2>Adopt Me</h2>
                    <p>It's a platform which allows you to publish and also allows you to find animals to adopt all
                        around Morocco.</p>
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
                        <i class="fa fa-map-pin icon" aria-hidden="true"></i><span>&nbsp;&nbsp;Rue Ibnou Nafis Résidence
                            Ben Omar, IMM 375 Etage 4 N 21 Mâarif , Grand Casablanca,Morocco .
                        </span>
                        <br>
                        <br>
                        <i class="fa fa-phone icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 54 26
                            88</span>
                        <br>
                        <br>

                        <i class="fa fa-envelope icon"
                           aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;contact@AdoptMe.com</span>


                    </div>
                </div>
            </div>
            <div class="footer-bottom">
                <!-- © 2021 M3alem All rights reserved. -->
                &copy;&nbsp;&nbsp;<b>Copyright 2021
                    By</b>&nbsp;&nbsp;<b>ADOPT.ME</b>&nbsp;
            </div>
        </footer>
    </body>

</html>
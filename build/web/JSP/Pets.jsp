<%-- 
    Document   : Pets
    Created on : Jun 3, 2021, 5:23:44 PM
    Author     : DellE5570
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="newpackage.Connexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="${pageContext.request.contextPath}/PNG/logo1111.png">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Home.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Header.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Footer.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>PETS</title>
    </head>
    <script>
        $(document).ready(function () {
            for (let index = 0; index < 6; index++) {
//        $(".father").append(` <div class = "child" >
//                <img style = "margin-top:10px;" src = "${pageContext.request.contextPath}/PNG/icons-avatar.png" width = "150" height = "150">
//                <h2 style = " text-shadow:none;" > NAME : HULK </h2>
//                <h3> TYPE : DOG </h3>
//                <div class = "separation" > </div>
//                <p style = "text-transform:capitalize;"> description of the animal <br> bla bla bla bla bla bla bla bla bla </p>
//                </div>`)

            }

        })
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
                <a href="${pageContext.request.contextPath}/index.jsp" class="logo"><img src="${pageContext.request.contextPath}/PNG/logo1111.png"/></a>
            </div>
            <nav id="nav">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">HOME</a></li>
                    <li><a href="#">PETS</a></li>
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

    <center>
        <form action="${pageContext.request.contextPath}/MAJAnimal" method="post">
            <h2 style="margin: 30px;">Welcome To Adopte Me</h2>
            <div class="main-search">
                <div class="search-bar">
                    <div class="search">
                        <input type="text" class="cls" placeholder=" What Are You Looking For?" name="search" >
                    </div>
                </div>
                <div class="combo-box">
                    <select class="lbl" name="Animals" id="cars">
                        <option value=""selected >All Categories</option>
                        <option value="dog">Dogs</option>
                        <option value="cat">Cats</option>
                        <option value="bird">Birds</option>
                        <option value="fish">Fish</option>
                    </select>
                </div>
                <div class="search-city">
                    <select class="lbl" name="city" id="city">
                        <option value=""selected>All Morocco</option>
                        <option value="Casablanca">Casablanca</option>
                        <option value="Rabat">Rabat</option>
                        <option value="Marrakech">Marrakech</option>
                        <option value="Tanger">Tanger</option>
                    </select>
                </div>
                <div class="search-submitt">
                    <button class="cl" type="submit" name="confirm" value="yes"><i class="fa fa-search"></i></button>
                </div>
            </div>
        </form>
        <%
            if (request.getAttribute("message") != null) {
                out.print("<p style='color: red '>" + request.getAttribute("message") + "</p>");
            }
        %>
    </center>




    <center>
        <div class="upper-cont">
            <div class="text">
                <p class="title">The Available Categories</p>
                <!--<p class="subtitle">Popular categories</p>-->
            </div>
            <div class="cont">
                <div class="sml">
                    <!-- <img style="margin-top:20px;" src="./../PNG/icons-avatar.png" width="72" height="72"> -->
                    <i style="margin-top:20px;" class="fas fa-dog"></i>
                    <div class="separator"></div>
                    <div class="txt">Dogs</div>
                </div>
                <div class="sml">
                    <!-- <img style="margin-top:20px;" src="./../PNG/icons-avatar.png" width="72" height="72"> -->
                    <i style="margin-top:20px;" class="fas fa-cat"></i>
                    <div class="separator"></div>
                    <div class="txt">Cats</div>
                </div>
                <div class="sml">
                    <!-- <img style="margin-top:20px;" src="./../PNG/icons-avatar.png" width="72" height="72"> -->
                    <i style="margin-top:20px;" class="fas fa-dove"></i>
                    <div class="separator"></div>
                    <div class="txt">Birds</div>
                </div>
                <div class="sml">
                    <!-- <img style="margin-top:20px;" src="./../PNG/icons-avatar.png" width="72" height="72"> -->
                    <i style="margin-top:20px;" class="fas fa-fish"></i>
                    <div class="separator"></div>
                    <div class="txt">Fish</div>
                </div>
            </div>
        </div>
    </center>



    <center>
        <div class="upper-cont">
            <div class="text">
                <p class="title" style="margin-right: 60px;">The Available Cities</p>
            </div>
            <div class="cont">
                <div class="sml">
                    <img style="margin-top:20px;border-radius: 20px;" src="${pageContext.request.contextPath}/PNG/casa.png" width="72" height="72">
                    <div class="separator"></div>
                    <div class="txt">Casablanca</div>
                </div>
                <div class="sml">
                    <img style="margin-top:20px;border-radius: 20px;" src="${pageContext.request.contextPath}/PNG/rabat.png" width="72" height="72">
                    <div class="separator"></div>
                    <div class="txt">Rabat</div>
                </div>
                <div class="sml">
                    <img style="margin-top:20px;border-radius: 20px;" src="${pageContext.request.contextPath}/PNG/marakech.png" width="72" height="72">
                    <div class="separator"></div>
                    <div class="txt">Marrakech</div>
                </div>
                <div class="sml">
                    <img style="margin-top:20px; border-radius: 20px;" src="${pageContext.request.contextPath}/PNG/logo_tanger5.jpg" width="72" height="72">
                    <div class="separator"></div>
                    <div class="txt">Tanger</div>
                </div>
            </div>
        </div>
    </center>







    <div class="container">
        <div class="father">    
            <%          ResultSet R;

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
 



            %>

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

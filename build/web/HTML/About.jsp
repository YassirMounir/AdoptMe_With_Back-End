<%-- 
    Document   : About
    Created on : Jun 3, 2021, 5:21:04 PM
    Author     : DellE5570
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="./../PNG/logo1111.png">
    <link rel="stylesheet" href="./../CSS/AU.css">
    <link rel="stylesheet" href="./../CSS/Header.css">
    <link rel="stylesheet" href="./../CSS/Footer.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>ABOUT US</title>
</head>
<script type="text/javascript">
  function f1(){
    var navbar = document.getElementById('nav');
    navbar.classList.toggle('show');
    
  }

  // $("Documment").ready(function() {
  //   $(".container").hide();
  //   $(".toggle-btn").css("cursor","pointer");
  //   // $("#nav").classList.toggle('show');
  //    $("#toggle").click(function() {
  //       $(".container").slideToggle("2000");
  //     });    
  //   });    
</script>
<body>
<!-- HEADER BEGIN -->
<header>
  <div class="toggle-btn"  onclick="f1();">
    <span></span>
    <span></span>
    <span class="bottom-span"></span>
  </div>

  <div class="logo">
    <a href="./../index.html" class="logo"><img src="./../PNG/logo1111.png"/></a>
  </div>
  <nav id="nav">
    <ul>
      <li><a href="./../index.html">HOME</a></li>
      <li><a href="./../HTML/HOME.HTML">MAIN</a></li>
      <li><a href="#">ABOUT</a></li>
      <li><a href="./../HTML/SignIn.html">SIGN IN</a></li>
    </ul>
  </nav>
</header>
<!-- HEADER END -->
              <!-- <a href="#"id="toggle"style="text-decoration: none;"><h2 style="text-align: center; color: black;background-color: turquoise;border-radius: 80px;max-width: 50%;margin-left: 25%;">Click To Apear/Disappear</h2></a> -->
     <div class="container" >
         <div class="child1"><img src="./../PNG/ADOPT22.png"></div>
         <div class="child2"><p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Architecto excepturi praesentium nulla molestiae omnis nisi, nesciunt eveniet delectus. Fugiat at sunt magnam dicta expedita beatae nostrum ab laborum soluta quam!
           <br>
           Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempora dolores quos provident temporibus dolorum necessitatibus esse amet, totam suscipit beatae quibusdam sequi quasi maxime, aliquid optio illo! Laboriosam, praesentium aspernatur. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem at, expedita exercitationem laborum quis facilis dicta. Tenetur nobis illum, incidunt ea quis minima maiores nulla labore tempore ex voluptate esse!
         </p></div>
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
            <li><a href="./../index.html">Home</a></li>
            <!-- <li><a href="#">Prestataires</a></li> -->
            <li><a href="#">About US</a></li>
            <li><a href="./../HTML/SignUp.html">Join US ?</a></li>
            <li><a href="./ContactUs.html">Contact US</a></li>
          </ul>
        </div>
        <div class="footer-top-items">
          <h2>FIND US</h2>
            <div class="tpitems">
              <i class="fa fa-map-pin icon" aria-hidden="true"></i><span>&nbsp;&nbsp;Rue Ibnou Nafis Résidence Ben Omar, IMM 375 Etage 4 N 21 Mâarif , Grand Casablanca,Morocco .</span>
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
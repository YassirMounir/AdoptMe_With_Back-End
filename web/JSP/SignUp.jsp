<%-- 
    Document   : SignUp
    Created on : Jun 3, 2021, 5:26:24 PM
    Author     : DellE5570
--%>
      <% 
        if(session.getAttribute("id")!=null){
        response.sendRedirect(request.getContextPath()+"/index.jsp");
        } 
        %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/SUP.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
        <link rel="icon" href="${pageContext.request.contextPath}/PNG/logo1111.png">
        <title>Sign Up</title>
    </head>

    <body>
        <!--    <script src="./../JS/App.js"></script>-->
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">
                    <form action="${pageContext.request.contextPath}/Authen" method="post" class="sign-up-form">
                        <h2 class="title">Sign up</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" name="fname" placeholder="First Name" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" name="lname" placeholder="Last Name" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-phone"></i>
                            <input type="tel" name="phonenumber" placeholder="Phone Number" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-home"></i>
                            <input type="text" name="city" placeholder="City" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-envelope"></i>
                            <input type="email" name="email" placeholder="Email" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" name="password" placeholder="Password" />
                        </div>
                     <%  
                        if(request.getAttribute("message")!=null)
                            out.print("<p style='color: red '>"+request.getAttribute("message")+"</p>");                       
                    %>
                        <input type="submit" class="btn" name="act" value="Sign Up" />
                    </form>
                </div>
            </div>

            <div class="panels-container">
                <div class="panel right-panel">
                    <div class="content">
                        <h3>One of us ?</h3>
                        <p>
                            You already have an account ? Please Sign in.
                        </p>
                        <a href="${pageContext.request.contextPath}/JSP/SignIn.jsp" class="btn transparent">Sign In</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>

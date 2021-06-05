<%-- 
    Document   : SignIn
    Created on : Jun 3, 2021, 5:25:18 PM
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/SIN.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
    <link rel="icon" href="${pageContext.request.contextPath}/PNG/logo1111.png">
    <title>Sign In</title>
</head>

<body>


    <div class="container">
        <div class="forms-container">
            <div class="signin-signup">
                <form action="${pageContext.request.contextPath}/Authen" method="post" class="sign-in-form">
                    <h2 class="title">Sign in</h2>
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
                    <input class="btn solid" type="submit" value="Sign In" name="act" />
                </form>
            </div>
        </div>

        <div class="panels-container">
            <div class="panel left-panel">
                <div class="content">
                    <h3>New here ?</h3>
                    <p>
                        Don't Hesitate To Create An Account .
                         You Are Welcome 
                    </p>
                    <a href="${pageContext.request.contextPath}/JSP/SignUp.jsp" class="btn transparent">Sign Up</a>

                </div>
            </div>
            </div>
        </div>
    </div>
















</body>

</html>

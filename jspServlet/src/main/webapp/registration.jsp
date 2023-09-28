<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
   <link href="css/style.css" rel="stylesheet" type="text/css">

<body>

        
        <div class="container">
        <img class="avatar" src="img/images3.jpg">
        <h2>Registration</h2>
        <form action="RegisterServlet" method="post">
          
            <input type="text" name="username"placeholder="username"><br>
            <input type="email" name="useremail"  placeholder="email"><br>
            <input type="password" name="password"  placeholder="password"><br>
          

            <div class="btns">
                <button type="submit">Register</button>
            </div>
             <a href="index.jsp"> Already have an account?</a>
        </form>
        
        
     
    </div>
        
    </div>


</body>
</html>
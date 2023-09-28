<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login </title>

</head>
 <style>
*{
margin:10px;
padding:0px;
}
</style>
 <link href="css/style.css" rel="stylesheet" type="text/css">


<body>
<%@ include file="header.jsp" %>

<div class="container">
        <img class="avatar" src="img/images3.jpg">
        <h2>Login</h2>
        <form action="LoginServlet" method="post">
          
            <input type="text" name="email"placeholder="username"><br>
            <input type="password" name="pass"  placeholder="password"><br>
          

            <div class="btns">
                <button type="submit">Login</button>
            </div>
            <a href="#"> Forget Password </a>
            <a href="registration.jsp"> Registration</a>
           
        </form>

 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ page import="com.jspServlet.User"%>
    
    <% User user= (User) session.getAttribute("loguser");
    
          if(user==null){
          response.sendRedirect("index.jsp");
       }
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>welcome,<%=user.getName() %></h1>
<h3>Your Account id;<%=user.getId() %></h3>
<h3>Your Account Email;<%=user.getEmail() %></h3>
<h3>Your Account ;<%=user.getPassword() %></h3>
<button><a href="LogoutServlet">Log out</a></button>


</body>
</html>
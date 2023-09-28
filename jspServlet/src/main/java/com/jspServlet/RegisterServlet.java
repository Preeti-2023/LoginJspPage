package com.jspServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String  name= request.getParameter("username");
		    String email = request.getParameter("useremail");
		    String pass= request.getParameter("password");
		    
		    User userModel= new User(name,email,pass);
		    
		    Database d= new Database(Connect.getConnection());
		    if(d.saveUser(userModel)) {
		    	response.sendRedirect("index.jsp");
		    }else {
		    	String errorMessage="User Available";
		    	HttpSession https= request.getSession();
		    	https.setAttribute(errorMessage, https);
		    	response.sendRedirect("register.jsp");
		 }
		   
	}

}

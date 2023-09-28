package com.jspServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
		String  email= request.getParameter("email");
	    String pass = request.getParameter("pass");
	    Database d= new Database(Connect.getConnection());
	    User user=d.logUser(email, pass);
	    if(user!=null) {
	    	HttpSession session= request.getSession();
	    	session.setAttribute("loguser", user);
	    	response.sendRedirect("welcome.jsp");
	    }else {
	    	out.println("user not found");
	    }
	}

}

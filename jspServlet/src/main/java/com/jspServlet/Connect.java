package com.jspServlet;


import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	private static Connection con;
	public static Connection getConnection() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","8700230896");
		
		
		} catch (Exception e) {
		
			e.printStackTrace();
		
		} 
	return con;
	}


}

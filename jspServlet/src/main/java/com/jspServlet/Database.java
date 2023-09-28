package com.jspServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {
 Connection con;
 public Database(Connection con) {
	 this.con=con;
 }
 
 public boolean saveUser(User users) {
	 boolean set= false;
	 try {
		 String s="insert into users(user_name ,user_email,password)values(?,?,?)";
			PreparedStatement p=this.con.prepareStatement(s);			
			p.setString(1, users.getName());
			p.setString(2,  users.getEmail());
			p.setString(3, users.getPassword());
		
		
			p.executeUpdate();
			set=true;
	 }
			catch (Exception e) {
				
				e.printStackTrace();
			
			} 
			return set;
		
 }
     // user login
 
 
 public User logUser(String email, String pass) {
	 User user= null;
	 try {
		 String query= "select*from users where user_email=? and password=?";
			PreparedStatement p=this.con.prepareStatement(query);
			p.setString(1, email);
			p.setString(2, pass);
			
			ResultSet rs=  p.executeQuery();
			
			if(rs.next()) {
				user= new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("user_name"));
				user.setEmail(rs.getString("user_email"));
				user.setPassword(rs.getString("password"));
			}
	 }catch(Exception e) {
		 e.printStackTrace();
		 
	 }
	 return user;
 }
}
	 
 

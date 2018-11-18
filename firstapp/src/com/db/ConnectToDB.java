package com.db;
import java.sql.*;
public class ConnectToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c= null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:info.db");
			System.out.println("Connection Successful!");
			// add users
			String SQLAdd = "insert into admins(user_name,password) values('nerdster','12345')";
			Statement stmt = c.createStatement();
			stmt.executeUpdate(SQLAdd);
			System.out.println("Added to db");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot Connect!");
			System.exit(0);
		}
		

	}

}

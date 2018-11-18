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
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connection UnSuccessful!");
			System.exit(0);
		}

	}

}

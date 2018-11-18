package com.db;
import java.sql.*;
import java.util.Scanner;
public class ConnectToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c= null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:info.db");
			System.out.println("Connection Successful!");
			// add users
			System.out.println("Use operation\n1- Add new user\n");
			Scanner reader = new Scanner(System.in);
			int processIndex = reader.nextInt();
			
			switch (processIndex) {
			case 1:// add
				Scanner username = new Scanner(System.in);
				Scanner psd = new Scanner(System.in);
				
				System.out.print("Enter user name: ");
				String user_name = username.nextLine();
				
				System.out.print("Enter password: ");
				String password = psd.nextLine();
				
			//	String SQLAdd = "insert into admins(user_name,password) values('debby','queenBee23')";
				String SQLAdd = "insert into admins(user_name,password) values('"+user_name+"','"+password+"')";
				Statement stmt = c.createStatement();
				stmt.executeUpdate(SQLAdd);
				System.out.println("Record added Successfully!");
				
				break;

			default:
				break;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot Connect!");
			System.exit(0);
		}
		

	}

}

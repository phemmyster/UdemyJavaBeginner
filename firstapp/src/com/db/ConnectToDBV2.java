package com.db;
import java.sql.*;
import java.util.Scanner;

public class ConnectToDBV2 {

	// CONTAIN SELECTION process
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c= null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:info.db");
			System.out.println("Connection Successful!");
			// add users
			System.out.println("Use operation\n1 - Add new user\n2 - Selection\n3- Delete");
			Statement stmt = c.createStatement(); // stmt for all processes
			Scanner reader = new Scanner(System.in);
			int processIndex = reader.nextInt();
			
			switch (processIndex) {
			case 1:// addition process
				Scanner username = new Scanner(System.in);
				Scanner psd = new Scanner(System.in);
				
				System.out.print("Enter user name: ");
				String user_name = username.nextLine();
				
				System.out.print("Enter password: ");
				String password = psd.nextLine();
				
			//	String SQLAdd = "insert into admins(user_name,password) values('debby','queenBee23')";
				String SQLAdd = "insert into admins(user_name,password) values('"+user_name+"','"+password+"')";
				//Statement stmt = c.createStatement();
				stmt.executeUpdate(SQLAdd);
				c.commit();
				stmt.close();
				c.close();
				System.out.println("Record added Successfully!");
				
				break;
			case 2:// selection data from table
				//Statement stmt2 = c.createStatement();
				String SQLRead = "select * from admins";
				ResultSet rs = stmt.executeQuery(SQLRead);
				System.out.println("id\tUsername\tPassword");
				while(rs.next()){
					int id = rs.getInt("id");
					String userName = rs.getString("user_name");
					String passWord = rs.getString("password");
					System.out.println(id +"\t"+userName +"\t"+passWord);
				}
				rs.close();
				stmt.close();
				c.close();
				break;
			case 3: // delete 
				
				
				Scanner idIn = new Scanner(System.in);
				
				System.out.print("Enter ID: ");
				int id = idIn.nextInt();
				
			
				String SQLDelete = "delete from admins where id="+id;
				//Statement stmt = c.createStatement();
				stmt.executeUpdate(SQLDelete);
				c.commit();
				stmt.close();
				c.close();
				System.out.println("Record is deleted");
				
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

package mainpackagedemo;

import java.util.Scanner;

public class Exception_Demo {
	static Scanner Reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			int x = Reader.nextInt();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Process!");
		}
	}

}

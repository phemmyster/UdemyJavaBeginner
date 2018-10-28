package mainpackagedemo;

import java.util.Scanner;

public class SimpleSwitchStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter index: ");
		
		int index = reader.nextInt();
		
		switch (index) {
		case 1: 
			System.out.println("You are a male");
		break;
		case 2:
			System.out.println("You are a female");	
		break;

		default:
			System.out.println("Please select 1 or 2");
		break;
		}

	}

}

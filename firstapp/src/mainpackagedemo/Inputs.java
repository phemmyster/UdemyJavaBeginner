package mainpackagedemo;

import java.util.Scanner;

public class Inputs {
	static Scanner reader1 = new Scanner(System.in);
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Enter your full name:");
		String name = reader.nextLine();
		// int age = 34;
		System.out.println("Enter your age:");
		int age = reader.nextInt();
		// double Salary = 1200000.50;
		System.out.println("Enter your salary:");
		double Salary = reader.nextDouble();
		System.out.println("Enter your Gender:");
		String input = reader1.nextLine();
		char Gender = input.charAt(0);
		
		
		System.out.println("My name is "+name +" , I am "+ age +" years old");
		System.out.println("My gender is "+ Gender);
		System.out.println("My salary is "+ Salary);

	}

}

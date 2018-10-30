package mainpackagedemo;

import java.util.Scanner;

public class SimpleIF {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter grade: ");
		int grade = reader.nextInt();
		
		// use more than one condition
		// (grade>= 50) && (grade <= 60)
		if (grade >= 90) {
			System.out.println("Grade is A!");
			
		}else {
			System.out.println("you dont have grade A!");
		}
		System.out.println("Grading has ended");

	}

}

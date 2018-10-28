package mainpackagedemo;

import java.util.Scanner;

public class SimpleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your grade:");
		
		int grade = reader.nextInt();
		System.out.println("Your grade is:");
		
		if ((grade>= 91 ) || (grade == 100)) {
			System.out.println("A - equivalent to Excelllent!");
		} else if((grade> 80 ) && (grade == 90)){
			System.out.println("B* - equivalent to Very Good!");
		}
		else if((grade>= 70 ) || (grade == 80)){
			System.out.println("B - equivalent to Good!");
		}
		else if((grade>= 60 ) || (grade == 69)){
			System.out.println("C - equivalent to Credit!");
		}else{
			System.out.println("P - equivalent to Pass!");
		}
		
		

	}

}

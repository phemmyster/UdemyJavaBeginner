package mainpackagedemo;

import java.util.Calendar;
import java.util.Scanner;

public class MyAgeApp {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter DOB:");
		int DOB = reader.nextInt();
		int year = Calendar.getInstance().get(Calendar.YEAR);
int age = year- DOB;
System.out.println("You are "+age+ " years old!");
	}

}

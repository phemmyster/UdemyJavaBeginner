package mainpackagedemo;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] jobs = new String[5];
		
		//String[] jobs = {"Admin", "Manager", "Tester","QA","Developer"} ;
		// want the person to enter their jobs
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the jobs: ");
		for (int i = 0; i < 5; i++) 
			jobs[i] = reader.nextLine();
			
		System.out.println("print job");
		
		//System.out.println("The various jobs available are:");
		for(int i = 0; i < 5; i++) {
			System.out.println(jobs[i]);
		}
		
	}

}


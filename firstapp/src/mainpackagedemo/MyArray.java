package mainpackagedemo;

<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> master
public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] jobs = new String[5];
<<<<<<< HEAD
		jobs[0] = "Tester";
		jobs[1] = "QA";
		jobs[2] = "Coder";
		jobs[3] = "Manager";
		jobs[4] = "Admin";
		//String[] jobs = {};
		
		//for (int i= 0; i<jobs.length; i++) {
		for (int i= 0; i<5; i++) {
			System.out.println("Jobs available are: "+jobs[i]);
		}

	}

}
=======
		
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

>>>>>>> master

package mainpackagedemo;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] jobs = new String[5];
		jobs[0] = "Tester";
		jobs[1] = "QA";
		jobs[2] = "Programmer";
		jobs[3] = "Manager";
		jobs[4] = "Admin";
		//String[] jobs = {};
		
		for (int i= 0; i<jobs.length; i++) {
			System.out.println("Jobs available are: "+jobs[i]);
		}

	}

}

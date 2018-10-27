package mainpackagedemo;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 27;
		double salary = 3.54;
		boolean isTrue = true;
		String rate = "3";
		String rate2 ="7.34";
		
		// to convert double to string
		String NewSalary = String.valueOf(salary);
		System.out.println(NewSalary);
		
		// to convert into to string
		String NewAge = String.valueOf(age);
		System.out.println(NewAge);

		// to convert boolean to string
		String NewIsTrue = String.valueOf(isTrue);
		System.out.println(NewIsTrue);
				
		// convert string to integer
		int NewRate = Integer.parseInt(rate);
		int NewRate2 = Integer.valueOf(rate);
		int NewRate3= (int) salary;
		System.out.println("New rate 1 is "+NewRate);
		System.out.println("New rate 2 is "+NewRate2);
		System.out.println("New salary is "+NewRate3);
		
		//convert to double
		
		double Newrate = Double.parseDouble(rate2);
		
		System.out.println("New rate 1 is "+Newrate);
		double Newrate2 = Double.valueOf(rate2);
		System.out.println("New rate 2 is "+Newrate2);
		
		
	}

}

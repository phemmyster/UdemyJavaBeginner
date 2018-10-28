package mainpackagedemo;

public class SimpleLoop {

	public static void main(String[] args) {
		// to repeat a simple msg
		/*
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		*/
		/*for (int i = 0; i < 5; i++) {
			System.out.println("Count: "+i);
			System.out.println("Hello");
		}*/
		System.out.println("Number between 1 and 100 divisible by 4 are: ");
		for (int i = 0; i < 100; i=i+2) {
			//System.out.println("Count: "+i);
			if (i % 4 == 0) {
				System.out.println(i);
			}
			
		}

	}

}

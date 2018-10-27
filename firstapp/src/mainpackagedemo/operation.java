package mainpackagedemo;

public class operation {

	public static void main(String[] args) {
		/**
		 * 
		 * order of operation
		 * (bracket)
		 * (-- or ++ before)
		 * power ^
		 * multiplication * and division /
		 * addition and subtraction
		 * equal =
		 * (-- or ++ after)
		 * */
		
		int n1 = 5, n2 = 10, n3 = 2;
		
		int sum = n1 * n2 / n3;
		int sum1 = n1 + n2 * n3;
		int sum2 = n1 * n2 + n3;
		int sum3 = n1 - n2 * n3+4;
		System.out.println("Sum: " + sum);
		System.out.println("Sum 1: " + sum1);
		System.out.println("Sum 2: " + sum2);
		System.out.println("Sum 3: " + sum3);
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		// ++n = n++ ->n+1
		// --n = n-- ->n-1
		int sum4 =(++n1 + n2) * n3;
		System.out.println("Sum 4: " + sum4);
		System.out.println("n1 is "+n1);
		int sum5 =(n1++ + n2) * n3;
		System.out.println("Sum 5: " + sum5);
		System.out.println("n1 is "+n1);
		
	}

}

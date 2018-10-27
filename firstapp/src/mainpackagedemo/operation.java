package mainpackagedemo;

public class operation {

	public static void main(String[] args) {
		/**
		 * order of operation
		 * power ^
		 * multiplication * and division /
		 * addition and subtraction
		 * equal =
		 * 
		 * */
		
		int n1 = 5, n2 = 10, n3 = 2;
		
		int sum = n1 * n2 / n3;
		int sum1 = n1 + n2 * n3;
		int sum2 = n1 * n2 + n3;
		System.out.println("Sum: " + sum);
		System.out.println("Sum 1: " + sum1);
		System.out.println("Sum 2: " + sum2);

	}

}

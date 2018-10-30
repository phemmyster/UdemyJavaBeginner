package mainpackagedemo;

public class SimpleBreakAndContinue {

	/*
	 * continue - will move on with the block break - will stop the block of
	 * code from continuing
	 */
	public static void main(String[] args) {

		//System.out.println("Numbers between 1 to 100 divisible by 4 are:");
		for (int i = 1; i <= 100; i++) {
				if (i % 4 == 0){
					//continue;
					  break;
				}
		System.out.println("count: " + i);
		System.out.println("count is printed");
		}

	}

}

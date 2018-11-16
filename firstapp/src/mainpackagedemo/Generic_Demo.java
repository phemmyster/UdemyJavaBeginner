package mainpackagedemo;

public class Generic_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a1 = { "Den", "Alex", "Nerdster" };
		int[] a2 = { 121, 4, 3, 7, 45, 90 };
		double[] a3 = { 2.1, 3.4, 7.8, 9.5, 5.9 };

		print(a1);
		System.out.println("-----------");
		print(a2);
		System.out.println("-----------");
		print(a3);

	}

	static void print(String[] ar){
		for(String s: ar){
			System.out.println(s);
		}
		}

		static void print(int[] ar){
			for(int s: ar){
				System.out.println(s);
			}
			}

			static void print(double[] ar) {
				for (double s : ar) {
					System.out.println(s);
				}

	}

}

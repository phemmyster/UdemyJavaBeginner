package mainpackagedemo;

public class GenericClass_Demo<M,N> {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a1 = { "Den", "Alex", "Nerdster" };
		Integer[] a2 = { 121, 4, 3, 7, 45, 90 };
		Double[] a3 = { 2.1, 3.4, 7.8, 9.5, 5.9 };
	//	M[] a3 = { 2.1, 3.4, 7.8, 9.5, 5.9 };

		print(a1);
		System.out.println("-----------");
		print(a2);
		System.out.println("-----------");
		print(a3);

	}

	static <T> void print(T[] ar){
		for(T s: ar){
			System.out.println(s);
		}
	}

}

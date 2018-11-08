package mainpackagedemo;

public class SimplePolymorphism {
	/* Polymorphism - means 
	 * you have more than one mthd, 
	 * with same name and 
	 * same return data type
	 * with same no of input
	 * but input is of different datatype
	 */
	
	// first mthd! - double
	double div(double n1, double n2){
		double r = n1/n2;
		return r;
	}
	
	// 2nd mthd!- int
		double div(int n1, int n2){
			double r = n1/n2;
			return r;
		}
		
		// 3rd mthd!- int
				double div(int n1, double n2){
					double r = n1/n2;
					return r;
				}

	public static void main(String[] args) {
		// 1st mthd!- double both
		double ans1 = new SimplePolymorphism().div(23.4, 12.8);
		System.out.println("Ans from 1st mth: "+ans1);
		// 2nd mthd!- int both
		double ans2 = new SimplePolymorphism().div(23, 12);
		System.out.println("Ans from 2nd mth: "+ans2);
		
		// 3rd mthd!- int and double
		double ans3 = new SimplePolymorphism().div(23, 8.45);
		System.out.println("Ans from 3rd mth: "+ans3);

	}

}

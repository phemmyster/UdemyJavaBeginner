package mainpackagedemo;

public class SimpleFunctionOverload {
	
	float Sub(float n1, float n2){
	float r = n1 - n2;
		return r;
	}
	// overload: same mthd but different parameter
	float Sub(float n1, float n2, float n3){
		float r = n1 - n2 + n3;
			return r;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float ans1 = new SimpleFunctionOverload().Sub(23, 12.9f);
		System.out.println("Ans is: "+ ans1);
		
		float ans2 = new SimpleFunctionOverload().Sub(23, 12.9f, 43);
		System.out.println("Ans is: "+ ans2);
	}

}

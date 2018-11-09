package mainpackagedemo;

public class LocalGlobal {
	static double pi = 3.14; // global variable
	
	float sum(float n1, float n2){
		double newPi = 3* pi;
		float ans = n1 + n2; // local variable
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	float newSum = sum // cant access sum
		double newPI = pi * 4;  // can only acess via static method
		
		

	}

}

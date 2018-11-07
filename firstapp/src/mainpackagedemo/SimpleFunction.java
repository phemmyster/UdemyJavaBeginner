package mainpackagedemo;

import javafx.scene.shape.DrawMode;

public class SimpleFunction {
	float sum(float n1, float n2){
		float sum = n1+n2;
		return sum;
	}
	
	public void Draw(){  // to skip new keyword
	//public static void Draw(){
		//Draw function
				for (int i = 0; i < 10; i++) 
				{
				 System.out.println("*");
				  for (int j = i; j >=0; j--) 
				   System.out.print("-");
				
				}
	}

	public static void main(String[] args) {
	//SimpleFunction.
		new SimpleFunction().Draw();
		//new SimpleFunction().Draw();
		//Draw();
		//Draw();
		
		// for sum funxtion
		float r = new SimpleFunction().sum(98.546f, 347.989f);
		

	}

}

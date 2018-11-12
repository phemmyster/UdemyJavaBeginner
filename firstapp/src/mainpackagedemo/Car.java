package mainpackagedemo;

public class Car {
// CarMain is the tester for this class
	String Type;
	int Model;
	double Price;
	double MilesDrive;
	String Owner;
	
	public Car(){   // constructor
		System.out.println("class created in constructor!");
	}
	
	double GetPrice(){
		double NewPrice = Price - (MilesDrive* 100);
		return NewPrice;
	} 
	

}

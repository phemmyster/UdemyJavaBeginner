package mainpackagedemo;

public class Car {
// CarMain is the tester for this class
	String Type;
	int Model;
	double Price;
	double MilesDrive;
	String Owner;
	
	//default constructor
	public Car(){
		System.out.println("Default constructor!");
	}
	
	public Car(String Type,int Model,double Price,double MilesDrive,String Owner){
		this.Type= Type;
		this.Model = Model;
		this.Price= Price;
		this.MilesDrive = MilesDrive;
		this.Owner = Owner;
		System.out.println("constructor 2 is created!");
	}

	
	double GetPrice(){
		double NewPrice = Price - (MilesDrive* 100);
		return NewPrice;
	} 
	

}

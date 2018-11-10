package mainpackagedemo;

public class Car {
// CarMain is the tester for this class
	//private String Type;
	public String Type;
	//private int Model;
	public int Model;
	//private double Price;
	public double Price;
	//private double MilesDrive;
	public double MilesDrive;
	
	
	static String Owner; // is common to all
	
	//default constructor
	public Car(){
		System.out.println("Default constructor 4 Car!");
	}
	
	public Car(String Type,int Model,double Price,double MilesDrive){
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

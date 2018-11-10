package mainpackagedemo;

public class CarTruck extends Car{
	// it has same variable and mtg from car, it can inherit 
	// using the keyword extends
	
	
	private boolean HasTruck;
	public void setHasTruck(boolean HasTruck){
		this.HasTruck = HasTruck;
	}
	
	public CarTruck(){
		System.out.println("Default constructor 4 carTruck!");
	}
	void GetOwner(){
		System.out.println("Owner is:"+Owner);
	}
	
	// overriding the mthd in the parent class- Car class
	double GetPrice(){
		System.out.println("Child mthd used!");
		double NewPrice = Price - (MilesDrive* 45);
		return NewPrice;
	} 

}

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

}

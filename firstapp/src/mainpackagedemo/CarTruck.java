package mainpackagedemo;

public class CarTruck extends Car{
	// it has same variable and mtg from car, it can inherit 
	// using the keyword extends
	
	
	private boolean HasTruck;
	public void setHasTruck(boolean HasTruck){
		this.HasTruck = HasTruck;
	}
	
	public CarTruck(){
		
		super("Honda",2019,100000,10); //constructor from car class
		System.out.println("constructor 4m parent class!");
		System.out.println("Default constructor 4 carTruck!");
	}
	void GetOwner(){
		System.out.println("Owner is:"+Owner);
		System.out.println("Price: "+super.GetPrice());
	}
	
	// overriding the mthd in the parent class- Car class
	// to avoid any error add
	@Override
	double GetPrice(){
		System.out.println("Child mthd used!");
		double NewPrice = Price - (MilesDrive* 45);
		return NewPrice;
	} 

}

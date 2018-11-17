package mainpackagedemo;

<<<<<<< HEAD
//abstract public class Car {
    public class Car {
=======
//abstract public class Car {  // if u use abstract it wnt be acesseible
	public class Car {
>>>>>>> 6b0c21b9c2a60557eb29815bf62345f0ef558076
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
	Owners owners;
	
	
	public Car(String Type,int Model,double Price,double MilesDrive){
		this.Type= Type;
		this.Model = Model;
		this.Price= Price;
		this.MilesDrive = MilesDrive;
		this.Owner = Owner;
		 owners = new Owners();
		 owners.FirstName = "Phemmy";
		 owners.LastName="Akinz";
		 
		System.out.println("constructor 2 is created!");
	}

	
	public Car(){   // constructor
		System.out.println("class created in constructor!");
	}
	
	double GetPrice(){
		double NewPrice = Price - (MilesDrive* 100);
		return NewPrice;
	} 
	

}

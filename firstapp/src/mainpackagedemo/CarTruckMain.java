package mainpackagedemo;

public class CarTruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTruck.Owner = "Phemmy";
		CarTruck carTruck1 = new CarTruck();
		carTruck1.Model = 2015;
		carTruck1.setHasTruck(true);
		carTruck1.Price = 26000;
		carTruck1.MilesDrive = 12;
		carTruck1.Type = "GSM";
		
		//System.out.println("carTruck1 owner is: "+carTruck1.GetOwner());
		System.out.println("carTruck1 price is: "+carTruck1.GetPrice());
		carTruck1.GetOwner();
		
		

	}

}

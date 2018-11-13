package mainpackagedemo;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.5;
		int y = (int)x;
		
		// can cast from cartruck to car
		CarTruck.Owner = "Phemmy";
		CarTruck carTruck1 = new CarTruck();
		carTruck1.Model = 2015;
		carTruck1.setHasTruck(true);
		carTruck1.Price = 26000;
		carTruck1.MilesDrive = 12;
		carTruck1.Type = "GSM";
		
		Car myCar =(Car) carTruck1;
		System.out.println(myCar.MilesDrive);
	}

}

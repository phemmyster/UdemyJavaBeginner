package mainpackagedemo;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		Car.Owner ="Phemmy";
		//cant create an instance bcuz of the ABSTRACT in car class
		Car car1 = new Car(); // this wnt work again cuz of default constructor
		car1.Type ="BWM";
=======
		
		Car car1 = new Car();
>>>>>>> 6b0c21b9c2a60557eb29815bf62345f0ef558076
		car1.MilesDrive = 5;
		car1.Model = 2016;
		car1.Owner = "Phemmy";
		car1.Price = 10000;
		
		System.out.println("Car price is given as:"+car1.GetPrice());
		
		Car car2 = new Car();
		double price = car2.GetPrice();
		System.out.println("Car price is given as:"+price);
		

	}

}

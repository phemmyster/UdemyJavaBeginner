package mainpackagedemo;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.Owner ="Phemmy";
		//cant create an instance bcuz of the abstract in car class
		Car car1 = new Car(); // this wnt work again cuz of default constructor
		car1.Type ="BWM";
		car1.MilesDrive = 5;
		car1.Model = 2016;
		//car1.Owner = "Phemmy";
		car1.Price = 10000;
		System.out.println("Owner of car1 is: "+ car1.Owner);
		System.out.println("Car1 price is given as:"+car1.GetPrice());
		
		//Car car2 = new Car();
		//System.out.println("Car2 price is given as:"+car2.GetPrice());
		
		//Car car3 = new Car("Honda",2019,100000,10,"Niffy");
		Car car3 = new Car("Honda",2019,100000,10);
		System.out.println("Owner of car3 is: "+ car3.Owner);
		System.out.println("Car3 price is given as:"+car3.GetPrice());

	}

}

package mainpackagedemo;

public class innerClass {
	
	public static class Animal{
		String Name;
		String Voice;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.Name = "Monkey";
		animal.Voice="heheh";
		System.out.println("Animal name is: "+animal.Name);
	}
	
	 void call(){
		
	}

}

package mainpackagedemo;

public class StringFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Phemmy";
		System.out.println("Length of character in name: "+name.length());
		System.out.println("First character of my name: "+name.charAt(0));
		System.out.println("Last character of my name: "+name.charAt(name.length()-1));
		
		System.out.println("To print out the char of my name:");
		for (int i = 0; i < name.length(); i++) {
			//System.out.println(name.charAt(i));
			//("To print out the char of my name in one line:");
			System.out.print(name.charAt(i));
		}
		System.out.println("To prevent name in reverse");
		for (int i = name.length()-1; i>=0 ; i--) {
				//System.out.println(name.charAt(i));
				//("To print out the char of my name in one line:");
				System.out.print(name.charAt(i));
		}
		// splitting of a sentence
		System.out.println("Print word:");
		String message = "Nerdster is the best coder";
		String[] splitMsg = message.split(" ");
		
		for (int i = 0; i < splitMsg.length; i++) {
			System.out.println(splitMsg[i]);
			
		}
		
		
	

}
}
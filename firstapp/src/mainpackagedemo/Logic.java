package mainpackagedemo;

public class Logic {
	/*
	 * logic operation
	 * <,<=,>,>=, ==, !=
	 * logic gate (and &&, or || not !)
	 */

	public static void main(String[] args) {
		 System.out.println( 3>4);
		 System.out.println(3>=4);
		 System.out.println(3<4);
		 System.out.println(3<=4);
		 System.out.println(3==4);
		 System.out.println(3==3);
		 System.out.println(3!=3);
		 
		 // and ->&& or -> || not-> !
		 /*
		  * && will be true only work when both conditions are true
		  * || will be false when false or false [other will be true true]
		  * Not (FOR true is false and vice versa)
		  */
		 System.out.println("Combining two operators");
		 System.out.println( (3>4) && (2== 4));
		 System.out.println( (3>1) && (4<1));
		 System.out.println( (3<4) && (2!= 4));
		 System.out.println( (3>1) || (4>1));
		 System.out.println( (3<4) || (2== 4));
		 System.out.println( (3<1) || (4<1));
	}

}

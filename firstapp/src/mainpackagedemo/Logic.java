package mainpackagedemo;

public class Logic {

	public static void main(String[] args) {
		 System.out.println( 3>4);
		 System.out.println(3>=4);
		 System.out.println(3<4);
		 System.out.println(3<=4);
		 System.out.println(3==4);
		 System.out.println(3==3);
		 System.out.println(3!=3);
		 
		 // and && or ||
		 /*
		  * && will be true only work when both conditions are true
		  * || will be true if only one of the conditions is true
		  */
		 System.out.println("Combining two operators");
		 System.out.println( (3>4) && (2== 4));
		 System.out.println( (3>1) && (4<1));
	}

}

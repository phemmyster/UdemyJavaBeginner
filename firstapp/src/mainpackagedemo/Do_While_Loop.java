package mainpackagedemo;

public class Do_While_Loop {

	public static void main(String[] args) {
		int i = 100;
		System.out.println("Numbers btw 1 to 100 divisible by 4:");
		do{
		
		
			if (i % 4 == 0) {
				System.out.println(i);
		}
			
			i++;
			}while(i <=100);
		System.out.println("App done!");
		}

	}



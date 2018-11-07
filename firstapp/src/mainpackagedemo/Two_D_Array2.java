package mainpackagedemo;

public class Two_D_Array2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[][] data = new int[3][3];
		
		data[0][0]= 1;
		data[0][1]= 2;
		data[0][2]= 3;
		
		data[1][0]= 6;
		data[1][1]= 5;
		data[1][2]= 4;
		
		data[2][0]= 10;
		data[2][1]= 12;
		data[2][2]= 14;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// to print the diagonal 
				if(i == j)
				System.out.print(data[i][j] +"\t");
			}

			System.out.println("\n");
			
		}
	

	}

}

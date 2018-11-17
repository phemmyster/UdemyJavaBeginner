package mainpackagedemo;

import java.io.FileWriter;
import java.io.IOException;

public class Myfile {

	public static void main(String[] args) {
		FileWriter fo;
		try {
			fo = new FileWriter("text.txt");
			fo.write("Welcome to java test file");
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

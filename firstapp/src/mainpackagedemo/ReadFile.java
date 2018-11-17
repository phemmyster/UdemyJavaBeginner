package mainpackagedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileWriterOn("This is nerdster coding on the wheel of java!");
		FileReaderOn();
		
	}

	static void FileReaderOn(){
		try {
			FileReader fd = new FileReader("text2.txt");
			int c;
			while ((c = fd.read()) != -1) {
				System.out.print((char) c);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void FileWriterOn(String str) {
		try {
			FileWriter fo = new FileWriter("text2.txt");
			fo.write(str);
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package mainpackagedemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRder_WithInput {
static Scanner reader = new Scanner(System.in);
static Scanner reader1 = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1 - To write to file\n2- Read from file");
		int op = reader1.nextInt();
		
		switch (op) {
		case 1: // write
			System.out.println("Enter to save to file");
			String msg = reader.nextLine();
			FileWriterOn(msg);
			break;
		case 2:// read
			FileReaderOn();
			break;

//		default:
//			break;
		}
		// TODO Auto-generated method stub

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




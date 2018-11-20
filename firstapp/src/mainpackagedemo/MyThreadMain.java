package mainpackagedemo;

public class MyThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread(); 
		mt.start();
		System.out.println("Thread is working!");

	}

}

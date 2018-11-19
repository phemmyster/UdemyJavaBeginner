package mainpackagedemo;

public class MyThread extends Thread
{

	@Override
	public void run(){
		// code here
		int count = 0;
		while(true){
			System.out.println(count);
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

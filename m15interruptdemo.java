package multithreading;

public class m15interruptdemo extends Thread {
	
	public void run()
	{
		
		
		try {
			
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread : " + " " + i );
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted : " + e);
		}
		
		
	}

	public static void main(String[] args) {
		
		m15interruptdemo m1 = new m15interruptdemo();
		m1.start();
		m1.interrupt();
		

	}

}

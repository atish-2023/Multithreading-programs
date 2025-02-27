package multithreading;

public class m10Sleepmethod extends Thread {
	
	
	public void run()
	{
		
		System.out.println("child thread ");
		for(int i=1;i<=5;i++)
		{
			try {
				
				
				System.out.println(i);
//				Thread.sleep(1000,-1);
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println("main thread");
		
		
		for(int i=1;i<=5;i++)
		{
			try {
				
				
				System.out.println(i);
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		m10Sleepmethod m1 = new m10Sleepmethod();
		m1.start();

	}

}

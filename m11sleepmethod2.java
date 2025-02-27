package multithreading;

public class m11sleepmethod2 extends Thread {
	
	
	public void run()
	{
		
		System.out.println("child thread ");
		for(int i=1;i<=5;i++)
		{
			try {
				
				
				System.out.println(i + " : " + Thread.currentThread().getName());

				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println("main thread");
		
		
		
		
		m11sleepmethod2 m1 = new m11sleepmethod2();
		m1.run();
		
		m11sleepmethod2 m2 = new m11sleepmethod2();
		m2.start();

	}

}

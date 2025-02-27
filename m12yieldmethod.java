package multithreading;

public class m12yieldmethod extends Thread {
	public void run()
	{
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		
		m12yieldmethod m1 = new m12yieldmethod();
		m1.start();
		
		
//		Thread.yield();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		

	}

}

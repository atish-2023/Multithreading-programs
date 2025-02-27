package multithreading;

public class m13joindemo extends Thread{
	
	public void run()
	{
		
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread : " + currentThread().getName() + " " + i );
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException{
		
		m13joindemo m1 = new m13joindemo();
		m1.start();
		m1.join();
		
		
			try {
				for(int i=1;i<=5;i++)
				{
					System.out.println("main thread : " + currentThread().getName() + " " + i );
					Thread.sleep(1000);
//					m1.join();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		
		

	}

}

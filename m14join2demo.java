package multithreading;

public class m14join2demo extends Thread{
	
	
	static Thread mainThread;
	public void run()
	{
		
		
		try {
			mainThread.join();
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
		
		 mainThread = Thread.currentThread();
		
		m14join2demo m1 = new m14join2demo();
		m1.start();
		
		
		
			try {
				for(int i=1;i<=5;i++)
				{
					System.out.println("main thread : " + currentThread().getName() + " " + i );
					Thread.sleep(1000);

				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		
		

	}

}

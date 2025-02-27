package multithreading;

public class m8daemonThread extends Thread{
	
	public void run()
	{
		
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println("daemon thread");
	}

	public static void main(String[] args) {
		
		System.out.println("main thread");
		
		m8daemonThread m1 = new m8daemonThread();
		m1.setDaemon(true);
		m1.start();
		

	}

}

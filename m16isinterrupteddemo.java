package multithreading;

public class m16isinterrupteddemo extends Thread{
	
	public void run()
	{
		System.out.println("A1 " + Thread.interrupted());
		System.out.println("A2 " + Thread.interrupted());// true -> false
//		System.out.println(Thread.currentThread().isInterrupted());   // true -> true
		
		try {
			
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread : " + " " + i );
				Thread.sleep(1000);
//				System.out.println("B " +Thread.interrupted());
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted : " + e);
		}
		
		
	}

	public static void main(String[] args) {
		
		m16isinterrupteddemo m1 = new m16isinterrupteddemo();
		m1.start();
		m1.interrupt();
	}

}

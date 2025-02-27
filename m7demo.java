package multithreading;



public class m7demo extends Thread {
	
	public void run()
	{
//		Thread.currentThread().setName("akash");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		
		System.out.println("hello executed by : " + Thread.currentThread().getName());
		
		m7demo t = new m7demo();
		
		t.setName("manoj");
		t.start();
		
		
		m7demo t2 = new m7demo();
		t2.setName("smart programming");
		
		t2.start();
		
		System.out.println( "execute : " + Thread.currentThread().getName());
		
		System.out.println( "alive or not : " + Thread.currentThread().isAlive());
		
		System.out.println( "aliv.. : " + t2.isAlive());
		
		
		
		
		
		
	}

}

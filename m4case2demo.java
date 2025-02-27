package multithreading;


// perform single task from multiple thread 

public class m4case2demo extends Thread {
	
	public void run()
	{
		System.out.println("thread task...");
	}

	public static void main(String[] args) {
		
		m4case2demo m1  = new m4case2demo();
		m1.start();
		
		m4case2demo m2  = new m4case2demo();
		m2.start();
		

	}

}

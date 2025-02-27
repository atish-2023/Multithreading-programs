package multithreading;


// perform single task from single thread 

public class m3case1demo extends Thread {
	
	public void run()
	{
		System.out.println("thread task");
	}

	public static void main(String[] args) {
		
		m3case1demo m  = new m3case1demo();
		m.start();
		m.start();

	}

}

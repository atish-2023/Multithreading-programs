package multithreading;

public class m2createThreadUsingRunnable implements Runnable{
	
	private String name;
	m2createThreadUsingRunnable(String name)
	{
		this.name = name;
	}
	
	public void run() {
		System.out.println("run1 method called...");
		run(name);
		
	}
	
	public void run(String n) {
		System.out.println("run2 method called..." + name);
		
	}
	
	public static void main(String[] args) {
		
		m2createThreadUsingRunnable m1 = new m2createThreadUsingRunnable("kiran");
		
		Thread th = new Thread(m1);
		th.start();
		

	}

}



package multithreading;

public class m1createThreadUsingExtend extends Thread {
	
	private String name;
	m1createThreadUsingExtend(String name)
	{
		this.name = name;
	}
	
	public void run() {
		System.out.println("run1 method called...");
//		run(name);
		
	}
	
	public void run(String n) {
		System.out.println("run2 method called..." + name);
		
	}

	public static void main(String[] args) {
		
		
		
		m1createThreadUsingExtend m1= new m1createThreadUsingExtend("atish");
		m1.start();
		
		

	}

}

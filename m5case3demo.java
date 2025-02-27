package multithreading;


// peform multiple task from single thread - not possible

// perform multiple task from multiple thread


class mythread1 extends Thread 
{
	public void run()
	{
		System.out.println("thread task  1...");
	}
}

class mythread2 extends Thread 
{
	public void run()
	{
		System.out.println("thread task 2 ...");
	}
}
public class m5case3demo {
	
	
	public static void main(String[] args) 
	{
		
		mythread1 m1 = new mythread1();
		m1.start();
		
		mythread2 m2 = new mythread2();
		m2.start();
		
		
		

	}

}

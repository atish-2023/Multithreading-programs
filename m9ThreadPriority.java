package multithreading;

public class m9ThreadPriority extends Thread {
	public void run() {
		System.out.println("child thread");
		System.out.println("child Thread Priority : " + Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		System.out.println("main Thread Priority before : " + Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(16);  // it give exception
		Thread.currentThread().setPriority(7); 
//		Thread.currentThread().setPriority(MAX_PRIORITY);
//		Thread.currentThread().setPriority(NORM_PRIORITY);
//		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("main Thread Priority after : " + Thread.currentThread().getPriority());
		m9ThreadPriority m1 = new m9ThreadPriority();
		m1.start();

	}

}

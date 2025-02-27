package multithreading;

public class m6demo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("atish");
		System.out.println("current thread after set a name : " + Thread.currentThread().getName());
		
		System.out.println(10/0);

	}

}

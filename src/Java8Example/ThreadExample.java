package Java8Example;

public class ThreadExample  extends Thread{
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		
		System.out.println("Main Thread");
 	}

}

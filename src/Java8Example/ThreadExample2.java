package Java8Example;

public class ThreadExample2 implements Runnable{
	public void run() {
		synchronized (ThreadExample2.class) {
			
	
			try {
				System.out.println("Thread is waiting");
				ThreadExample2.class.wait(2000);
				System.out.println("Thread is started");
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	

	public static void main(String[] args) {
		ThreadExample2 te=new ThreadExample2();
		Thread t=new Thread(te);
		t.start();
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		//synchronized(t) {
			//t.notify();
		//}
		System.out.println("Hello");
	}

}

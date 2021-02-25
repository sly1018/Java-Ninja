package thread;

public class Multithreading implements Runnable {
	
	public void run() {
		System.out.println("My thread is in running state");
	}
	// main
	public static void main(String[] args) {
		// creating object
		Multithreading obj = new Multithreading();
		Thread obj1 = new Thread(obj);
		obj1.start();
	}

}

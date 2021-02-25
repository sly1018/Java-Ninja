package multithreading;

public class Multithreading extends Thread {
	public void run() {
		System.out.println("My thread is in running state");
	}
	// main
	public static void main(String[] args) {
		// creating object
		Multithreading obj = new Multithreading();
		// calling start method of Thread
		obj.start();
	}
}

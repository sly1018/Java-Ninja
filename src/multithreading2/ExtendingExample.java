package multithreading2;

public class ExtendingExample {
	
	// main
	public static void main(String[] args) {
		// creating object
		Count cnt = new Count();
		try {
			while(cnt.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
		} catch(InterruptedException e) {
			System.out.println("Main thread is interrupted.");
		}
		System.out.println("Main thread run is over");
	}

}

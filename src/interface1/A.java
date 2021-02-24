package interface1;

public class A implements Printer {
	
	// implemented method
	public void print() {
		System.out.println("Hello");
	}
	
	// main
	public static void main(String[] args) {
		A obj = new A();
		obj.print();
	}

}

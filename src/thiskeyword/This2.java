package thiskeyword;

public class This2 {
	// constructors
	This2() {
		this("This2"); // invoke overloaded constructor in the same class
		System.out.println("Inside constructor without parameters");
	}

	This2(String str) {
		System.out.println("Inside constructor with string parameter: " + str);
	}

	// main
	public static void main(String[] args) {
		This2 obj = new This2(); // creating object
	}
}

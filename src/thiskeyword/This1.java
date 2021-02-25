package thiskeyword;

public class This1 {
	
	// field
	int variable = 5;
	
	// main
	public static void main(String[] args) {
		This1 obj = new This1(); // creating object
		// calling methods, static polymorphism
		obj.method(20);
		obj.method();
	}
	
	// methods
	void method(int variable) {
		variable = 10;
		System.out.println("Value of variable: " + variable);
	}
	
	void method() {
		int variable = 40;
		System.out.println("Value of variable: " + variable);
	}

}

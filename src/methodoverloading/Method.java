package methodoverloading;

public class Method {

	// methods, overloading
	void display() {
		System.out.println("Method overloading....");
	}

	void display(int x) {
		System.out.println("Int value...");
	}

	void display(float x) {
		System.out.println("Float value...");
	}

	void display(char x) {
		System.out.println("Char value...");
	}

	void display(int x, int y) {
		System.out.println("int, int: " + x + " " + y);
	}
	
	void display(int x, float y) {
		System.out.println("int , float: " + x + " " + y);
	}
	
	void display(float x, int y) {
		System.out.println("Float, int: " + x + " " + y);
	}

}

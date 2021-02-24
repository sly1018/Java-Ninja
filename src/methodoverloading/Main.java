package methodoverloading;

public class Main {

	// main
	public static void main(String[] args) {
		// creating object
		Method obj = new Method();
		
		// calling methods, compiler overload, static polymorphism
		obj.display();
		obj.display(525);
		obj.display((float) 23.45);
		obj.display('z');
		obj.display(45, 63);
		obj.display(95, (float) 232.59);
		obj.display((float) 534.89, 20);
	}

}

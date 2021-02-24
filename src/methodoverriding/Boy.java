package methodoverriding;

public class Boy extends Human {

	// method, overriding
	public void eat() {
		System.out.println("The boy is eating here.");
	}

	// main
	public static void main(String[] args) {

		// creating object
		Boy obj = new Boy();

		// calling overridden method
		obj.eat();

	}
}

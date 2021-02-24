package abstraction;

public class Dog extends Animal {
	
	// method
	public void sound() {
		System.out.println("Woof!");
	}
	
	// main
	public static void main(String[] args) {
		
		Animal obj = new Dog();
		obj.sound();
		
	}

}

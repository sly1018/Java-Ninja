package multiLevelInheritance;

public class BMW15 extends BMW {

	// methods
	public BMW15() {
		System.out.println("BMW-Model: 2015");
	}

	public void speed() {
		System.out.println("Max: 180 KMPH");
	}

	// main
	public static void main(String[] args) {
		// creating objects
		BMW15 obj = new BMW15();
		obj.vehicleType();
		obj.brand();
		obj.speed();
	}

}

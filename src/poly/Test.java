package poly;

public class Test {
	
	// main
	public static void main(String[] args) {
		
		// creating object, parent object vehicle
		Vehicle vh = new Vehicle();
		vh.move();
		
		// changing vehicle into subclass a car
		vh = new Car();
		vh.move();
	}

}

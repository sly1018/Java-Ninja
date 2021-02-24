package poly;

public class Test {
	
	// main
	public static void main(String[] args) {
		
		// creating object, parent object vehicle
		Vehicle vh = new Vehicle();
		vh.move();
		
		// assigning vehicle object to child object car
		vh = new Car();
		vh.move();
	}

}

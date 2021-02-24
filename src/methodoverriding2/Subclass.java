package methodoverriding2;

public class Subclass extends Method {
	
	//method of parent to override
	void display() {
		
		// calling parent method
		super.display();
		
		System.out.println("Class: Subclass");
	}

}

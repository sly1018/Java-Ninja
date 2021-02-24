package superkeyword2;

public class Student extends Person {

	// methods
	void sendMessage() {
		// console output
		System.out.println("This is student class.");
	}

	void display() {
		// calling methods
		sendMessage();
		super.sendMessage();
	}

}

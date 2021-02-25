package thiskeyword;

public class ThisMethod {
	
	// main
	public static void main(String[] args) {
		ThisMethod obj = new ThisMethod();
		obj.methodTwo();
	}
	
	// method
	void methodOne() {
		System.out.println("Inside method one");
	}
	
	void methodTwo() {
		System.out.println("Inside method two");
		this.methodOne();
	}

}

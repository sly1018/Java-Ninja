package singleInheritance;

public class B extends A {

	public void methodB() {
		System.out.println("Child Class Method");
	}

	public static void main(String[] args) {
		B obj = new B();

		// calling super class
		obj.methodA();

		// local method
		obj.methodB();
	}

}

package inheritance;

// child
public class B extends A {
	// fields
	int bonus = 10000;

	// main
	public static void main(String[] args) {
		B s = new B();
		System.out.println("Salary: " + s.salary);
		System.out.println("Salary bonus: " + s.bonus);
	}
}

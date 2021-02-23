
public class JavaClass {

	private String name;

	// getter and setter
	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	// main
	public static void main(String[] args) {
		JavaClass javaClass1 = new JavaClass();
		javaClass1.setName("Visitor");

		System.out.println("Hello " + javaClass1.getName());
	}

}

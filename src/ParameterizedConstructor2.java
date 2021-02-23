
public class ParameterizedConstructor2 {

	ParameterizedConstructor2(int i, int j) {
		System.out.println("Parameterized constructor");
	}

	ParameterizedConstructor2(int i, int j, int k) {
		System.out.println("Parameterized constructor 2");
	}

	// main
	public static void main(String[] args) {
		ParameterizedConstructor2 obj = new ParameterizedConstructor2(12, 18);
	}

}


public class ParameterizedConstructor {

	ParameterizedConstructor() {
		System.out.println("Default Constructor");
	}
	
	ParameterizedConstructor(int i, int j) {
		System.out.println("Constructor with 2 parameters");
	}
	
	ParameterizedConstructor(int i, int j, int k) {
		System.out.println("Constructor with 3 parameters");
	}
	
	ParameterizedConstructor(int i, String name) {
		System.out.println("Constructor with int and String parameters");
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor();
		ParameterizedConstructor obj2 = new ParameterizedConstructor(23, 23);
		ParameterizedConstructor obj3 = new ParameterizedConstructor(13, 14, 15);
		ParameterizedConstructor obj4 = new ParameterizedConstructor(1, "Java");
	}

}

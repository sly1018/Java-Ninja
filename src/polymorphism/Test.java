package polymorphism;

public class Test {

	// main
	public static void main(String[] args) {
		// object
		StaticPolymorphism staticPoly = new StaticPolymorphism();

		// test
		System.out.println(staticPoly.add(2, 3));
		System.out.println(staticPoly.add(2, 3, 5));
		System.out.println(staticPoly.add(2, 3.4));
		System.out.println(staticPoly.add(2.6, 3));

	}

}

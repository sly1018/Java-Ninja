package interface2;

public class TestInterface2 {
	
	// main
	public static void main(String[] args) {
		Bank b = new Anz();
		System.out.println("The rate of interest is: " + b.displayRateOfInterest());
	}

}

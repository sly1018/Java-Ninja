package enumerationinheritance;

public class Test {
	
	// main
	public static void main(String[] args) {
		// call value
		Color arr[] = Color.values(); //get values
		
		// loop
		for(Color col:arr) {
			System.out.println(col + " at Index " + col.ordinal());
		}
		
		//
		System.out.println(Color.valueOf("RED"));
	}

}

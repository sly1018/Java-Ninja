package enumeration;

public class Enum {
	
	// main
	public static void main(String[] args) {
		EnumerationTester2 lang;
		System.out.println("Here is a list of constans");
		EnumerationTester2 allTypes[] = EnumerationTester2.values();
		
		for(EnumerationTester2 a:allTypes) {
			System.out.println(a);
			
			System.out.println();
			lang = EnumerationTester2.valueOf("ASSEMBLY");
			System.out.println("Value is " + lang);
		}
	}

}

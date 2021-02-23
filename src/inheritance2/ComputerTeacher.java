package inheritance2;

public class ComputerTeacher extends Teacher {

	// fields
	String mainSubject = "Computer Science";

	// main
	public static void main(String[] args) {

		// creating instances
		ComputerTeacher obj = new ComputerTeacher();

		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		
		// calling up the method from parent
		obj.does();
	}

}

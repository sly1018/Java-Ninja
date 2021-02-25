package encapsulation;

public class EncapsTest {
	
	// main
	public static void main(String[] args) {
		
		// creating object
		Encapsulation obj = new Encapsulation();
		obj.setEmpName("Slay");
		obj.setEmpAge(33);
		obj.setEmpSSN(9517);
		
		// console output
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
		
	}

}

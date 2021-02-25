package encapsulation;

public class Encapsulation {

	// fields. private cannot be changed from outside, only with getters and setters
	private int empSSN;
	private String empName;
	private int empAge;

	// getter & setter
	public int getEmpSSN() {
		return empSSN;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int newValue) {
		empAge = newValue;
	}

	public void setEmpName(String newValue) {
		empName = newValue;
	}

	public void setEmpSSN(int newValue) {
		empSSN = newValue;
	}

}

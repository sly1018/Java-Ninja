
public class ConstructorOverloading2 {

	// fields
	private int rollNum;

	// constructors
	ConstructorOverloading2() {
		rollNum = 100;
	}

	ConstructorOverloading2(int rNum) {
		this(); // invoking default constructor, constructor chaining
		rollNum = rollNum + rNum;
	}

	// getter & setter
	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	// main
	public static void main(String[] args) {
		ConstructorOverloading2 obj = new ConstructorOverloading2(12);
		System.out.println(obj.getRollNum());
	}

}

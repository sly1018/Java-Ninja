
public class variableAndDatatypes4 {
	public String myVar = "Instance Variable";
	public void myMethod() {
		String myVar = "Inside Method";
		System.out.println(myVar);
	}
	
	public static void main(String[] args) {
		variableAndDatatypes4 obj = new variableAndDatatypes4();
		System.out.println("calling Method");
		obj.myMethod();
		System.out.println(obj.myVar);
	}

}

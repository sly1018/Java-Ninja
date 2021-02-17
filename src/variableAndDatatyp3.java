
public class variableAndDatatyp3 {
	String myInstanceVar = "instance Variable";

	public static void main(String[] args) {
		variableAndDatatyp3 obj = new variableAndDatatyp3();
		variableAndDatatyp3 obj2 = new variableAndDatatyp3();
		variableAndDatatyp3 obj3 = new variableAndDatatyp3();

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

		obj2.myInstanceVar = "Changed Text";
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	}
}

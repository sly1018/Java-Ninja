
public class assignmentOperator {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;

		num2 = num1;
		System.out.println("= output: " + num2);
		
		num2 += num1;
		System.out.println("+= output: " + num2);
		
		num2 -= num1;
		System.out.println("-= output: " + num2);
		
		num2 *= num1;
		System.out.println("*= output: " + num2);
		
		num2 /= num1;
		System.out.println("/= output: " + num2);
		
		num2 %= num1;
		System.out.println("%= output: " + num2);
	}
}

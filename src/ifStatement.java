import java.util.Scanner;


public class ifStatement {
	
	public static void main(String[] args) {
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Please enter age: ");
		age = inputDevice.nextInt();
		
		if(age>18) {
			System.out.println("Above 18");
		}
	}

}

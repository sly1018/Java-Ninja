import java.util.*;

public class hello2 {
	public static void main(String[] args) {
		Scanner userInputScanner=new Scanner(System.in);
		System.out.println("What is your name?");
		String userInputName=userInputScanner.nextLine();
		System.out.println("Hello "+userInputName+"!");
	}
}
package ch12inclass;
import java.util.Scanner;
public class TryToParseString {

	public static void main(String[] args) {
		Scanner keys  = new Scanner(System.in);
		int intInput = 0;
		
		try {
			
			System.out.println("Enter input: ");
			String input = keys.nextLine();
			
			intInput = Integer.parseInt(input);
		}
		catch(NumberFormatException e) {
			
			System.out.println("Error, not integer");
			System.exit(0);
		}
		System.out.println("Input: " + intInput);
	}
	
}

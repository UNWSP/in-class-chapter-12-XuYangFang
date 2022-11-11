package ch12inclass;
import java.util.Scanner;
public class TwoSeparateExceptions {

	public static void main(String[] args) {
		Scanner keys  = new Scanner(System.in);
		int intInput = 0;
		int intInput2 = 0;
		
		try {
			
			System.out.println("Enter input: ");
			String input = keys.nextLine();
			intInput = Integer.parseInt(input);
			
			System.out.println("Enter another input: ");
			String input2 = keys.nextLine();
			intInput2 = Integer.parseInt(input2);
			
			System.out.println(intInput / intInput2 );
			
		}
		catch(NumberFormatException e) {
			
			System.out.println("Error, not integer");
		}
		
		
		catch(ArithmeticException  e) {
			
			System.out.println("Divided by zero operation cannot possible");
		}
		
		
		finally {
			
			System.out.println("finally: Run ");
		}
	
		
		
	
	}
	

}
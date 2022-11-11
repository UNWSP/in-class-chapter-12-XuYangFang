package ch12inclass;

public class GoTooFar {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		
		try
		{
			for(int i=0; i<=5; i++)
			{
				System.out.print(number[i] + " ");
				
			}
			
			
		}
		catch(ArrayIndexOutOfBoundsException Exception)
		{
			System.out.println("Now you've gone too far");
		}
	}

}

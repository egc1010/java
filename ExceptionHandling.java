package module1programs;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int array[]= new int[s1.nextInt()];
	}
		catch(NegativeArraySizeException m1)
		{
			try
			{
				System.out.println("make sure values is not negative ");
				System.out.println("Enter size as positive only ");
				Scanner s2 = new Scanner(System.in);
				int array1[]= new int[s2.nextInt()];
			}
			catch(NegativeArraySizeException c1)
			{
				System.out.println("enter positive array value");
			}
			
		}
		catch(InputMismatchException m2)
		{
			System.out.println("handled exception 2");
		}
	}

}

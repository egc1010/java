package module1programs;

public class ExceptionHandling2 {

	public static void main(String[] args) 
	{
		
		try 
		{	
			int c=1/1;
			System.out.println(c);
		}
		
		catch(ArithmeticException a1)
		{
		System.err.print("handled exception");
		
		}
		finally
		{
			System.out.println("finally block will always execute");
		}
	
	}
}

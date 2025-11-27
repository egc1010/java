package module1programs;

import java.util.InputMismatchException;

public class ThrowKeyWord {

	public static void main(String[] args) {
		
		
		if(2>1)
		
		{
			throw new NullPointerException("exception 2");
	}
		else
		{
			throw new InputMismatchException("exception 1");
		}
	}
}

package module1programs;

import java.util.Arrays;

public class CountTypeArray {

	
	
	
	static int countofAlpha=0;
	static int countofDigit=0;
	static int countofSpace=0;
	static int countofSpecialChar=0;
	
	public static void main(String[] args) {
		
			String input="dsd$ 343 ";
			char c1[]=input.toCharArray();
			System.out.println(Arrays.toString(c1));
			
			for (int i=0;i<c1.length;i++)
			{
				
				boolean b1=Character.isAlphabetic(c1[i]);
				boolean b2=Character.isDigit(c1[i]);
				boolean b3=Character.isWhitespace(c1[i]);
				if(b1)
				{
					countofAlpha++;
					
				}
				if(b2)
				{
					countofDigit++;
					
				}
				if(b3)
				{
					countofSpace++;
				
				}
								
			}
			int countofSpecialChar=input.length()-(countofAlpha+countofDigit+countofSpace);
			System.out.println("count of alpha "+countofAlpha);
			System.out.println("count of digit "+countofDigit);
			System.out.println("count of space "+countofSpace);
			System.out.println("count of special char "+countofSpecialChar);
	}

}

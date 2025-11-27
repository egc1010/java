package module1programs;

import java.util.Arrays;

public class assigntment37 {

	public static void main(String[] args) {
		
		int [] input=new int[4];
		input[0]=10;
		input[1]=78;		
		input[2]=51;
		input[3]=100;
		
		
		for (int i=0;i<input.length;i++)
		{
			
			for (int j=i+1;j<input.length;j++)
			{
				if ( input[i]>input[j])
				{
					
					
					int dummy=input[i];
					input[i]=input[j];
					input[j]=dummy;
				}
			}
		}
		
		System.out.println(Arrays.toString(input));
	}

}

package module1programs;

public class assigntment38 {


		public static void main(String[] args) {
			
			int [] input=new int[4];
			input[0]=13;
			input[1]=21;		
			input[2]=21;
			input[3]=100;
			int max=input[0];
			int min=input[0];

			
			for (int i=0;i<input.length;i++)
			{
				
				if(input[i]>max)
				{
					
						max=input[i];
				}
				if(input[i]<min)
				{
					
						min=input[i];
				}
			}
			
			
			System.out.println("max value is "+max);
			System.out.println("min value is "+min);
		}

}



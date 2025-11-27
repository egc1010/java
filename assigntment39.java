package module1programs;

public class assigntment39 {


		public static void main(String[] args) {
			
			int [] input=new int[4];
			input[0]=13;
			input[1]=21;		
			input[2]=21;
			input[3]=100;
			int checkNumber=21;
			
			for (int i=0;i<input.length;i++)
			{
				
				if(checkNumber==input[i])
				{
					
					System.out.println("number given "+checkNumber+" exist in position "+i);
				}
				
			}
			
		}

}



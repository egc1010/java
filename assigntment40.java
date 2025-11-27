package module1programs;

public class assigntment40 {


		public static void main(String[] args) {
			
			int [] input=new int[4];
			input[0]=14;
			input[1]=51;		
			input[2]=50;
			input[3]=100;
			int checkNumber=50;
			int countNumber=0;
			
			for (int i=0;i<input.length;i++)
			{
				
				if(checkNumber==input[i])
				{
					
					System.out.println("number exist in position "+i);
					countNumber=countNumber+1;
				}
				
			
			}
			if (countNumber==0)
			{	System.out.println("not in array");
			
			}
			System.out.println("number exist times "+countNumber);
		}

}



package module1programs;

public class NumberInArray {


		public static void main(String[] args) {
			
			int [] input=new int[4];
			input[0]=51;
			input[1]=51;		
			input[2]=51;
			input[3]=100;
			int checkNumber=51;
			int countNumber=0;
			
			for (int i=0;i<input.length;i++)
			{
				
				if(checkNumber==input[i])
				{
					
					System.out.println("number exist in position "+i);
					countNumber=countNumber+1;
				}
			}
			

			System.out.println("number exist times "+countNumber);
		}

	}



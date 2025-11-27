package module1programs;
import java.util.Scanner;
public class assignment33 {
	
    public static void main(String[] args) 
    {
            //String input="racecar";
            Scanner sc= new Scanner(System.in);
            System.out.println("write a word");
            String output="";
            String input = sc.nextLine();
            //for(int i=2;i>=0;i--)
            for (int i = input.length() - 1; i >=0; --i) 
            {
                    char c1=        input.charAt(i);
                   output=output+c1;
                    
            }
           
           if (input.equals(output)) {
                System.out.println(input + " es palindromo");
              }
              else {
                System.out.println(input + " no es palindromo");
              }
           
   
    }
}


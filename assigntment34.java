package module1programs;



import java.util.Arrays;
import java.util.Scanner;

public class assigntment34 {

        public static void main(String[] args) 
        {
                
        
                Scanner s1=new Scanner(System.in);
                System.out.println("Please eneter the size of your array:-");
                int []rollno=new int[s1.nextInt()];
                for(int i=0;i<rollno.length;i++)
                {
                        System.out.println("Please eeter the value of array at index position-> "+i);
                        rollno[i]=s1.nextInt();
                }        
                System.out.println(Arrays.toString(rollno));
                s1.close();

                
                
                
        }
}



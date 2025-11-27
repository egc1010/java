package module1programs;
import java.util.Arrays;

public class assigntment36 {

        public static void main(String[] args) 
        {
                int rollnoA[]=new int[5];
                rollnoA[0]=19;
                rollnoA[1]=100;
                rollnoA[2]=15;
                rollnoA[3]=28;
                rollnoA[4]=10;

        		double sum=0;
         
                
        for(int i=0;i<rollnoA.length;i++)
        {
                
        	
        		 sum=sum+rollnoA[i];

                
        }
        System.out.println("total "+sum);       
        System.out.println("average "+sum/rollnoA.length);
        }
}



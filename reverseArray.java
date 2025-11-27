package module1programs;
import java.util.Arrays;

public class reverseArray {

        public static void main(String[] args) 
        {
                int rollnoA[]=new int[5];
                rollnoA[0]=19;
                rollnoA[1]=100;
                rollnoA[2]=15;
                rollnoA[3]=28;
                rollnoA[4]=10;

            int rollnoB[]=new int[5];
                
        for(int i=0,j=rollnoB.length-1;i<rollnoB.length;i++,j--)
        {
                rollnoB[j]=rollnoA[i];
        }
                
                System.out.print("Input Array is:-> ");
                System.out.println(Arrays.toString(rollnoA));
                System.out.print("Output Array is:-> ");
                System.out.println(Arrays.toString(rollnoB));
        }
}



package module1programs;

public class StringProgram2 
{
        public static void main(String[] args) 
        {
                String a=new String("Automation");//Constructr-Para
                String b=a.concat(" Testing");
                System.out.println(a);
                
                StringBuffer a1=new StringBuffer("Automation");//Constructr-Para
                       a1.append(" Testing");
                        System.out.println(a1);
                
                StringBuilder a2=new StringBuilder("Manual");
                        a2.append(" Testing");
                        System.out.println(a2);
                        
        //mutable->something that can be chnaged
        //immutable->something that cannot be chnage         
        }
}
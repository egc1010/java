package module1programs;

public class StringBuilder1
{
        public static void main(String[] args) 
        {
        	StringBuilder s1=new StringBuilder("automation");
        	s1.append(" testing");
               System.out.println(s1);
               
               StringBuilder s2=new StringBuilder("manual");
           	s2.insert(6, " api" );
                  System.out.println(s2);
                  
                  StringBuilder s3=new StringBuilder("manual testing");
                 	s3.replace(0,6, " api" );
                        System.out.println(s3);
                
                
        }
}
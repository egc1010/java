package module1programs;

public class StringBufferProgram
{
        public static void main(String[] args) 
        {
                StringBuffer s1=new StringBuffer("monday wednesday");
                	s1.insert(6, " tuesday ");
                        System.out.println(s1);
                        
                        StringBuffer s2=new StringBuffer("monday wednesday");
                      System.out.println(s2.replace(0, 6, "juan"));
                      
                      StringBuffer s3=new StringBuffer("monday wednesday");
                      System.out.println(s3.delete(0, 6));
                      

                      StringBuffer s4=new StringBuffer("monday wednesday");
                      System.out.println(s4.reverse());
                      
                      StringBuffer s5=new StringBuffer("monday");
                      System.out.println(s5.substring(0,5));
                
                
        }
}
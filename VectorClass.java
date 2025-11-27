package module1programs;
import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		v1.add("anuj");
		v1.add("shobha");
		v1.add("vivek");
		v1.add("pradhan");
		v1.add("sai");
	
		System.out.println("v1");
		Enumeration<String> e1=v1.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}
}

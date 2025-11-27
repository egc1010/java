package module1programs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty3 {

	public static void main(String[] args) {
		
		Set <String>s1 = new HashSet<String>();
		s1.add("ram");
		s1.add("kaveri");
		s1.add("bhavya");
		s1.add("arun");
		s1.add("lali");
	
		System.out.println(s1);

		Iterator<String> il= s1.iterator();
		System.out.println("forword iteration");
		
		while(il.hasNext())
		{
		System.out.println(il.next());
		}
		
	}

}

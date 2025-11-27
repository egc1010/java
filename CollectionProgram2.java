package module1programs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
		a1.add(785);
		a1.add("Ram");
		a1.add('m');
		a1.add(true);
		a1.add(89.9);
		a1.add(1, "sita");
		System.out.println(a1);
		//a1.clear();
		boolean b1=a1.isEmpty();
				System.out.println(b1);
		
				
				ArrayList a2 = new ArrayList();
				a2.add("Chetna");
				a2.add("Bhavya");
				a2.add(true);
				System.out.println(a2);
				a2.addAll(a1);
				
				boolean b2=a2.containsAll(a1);
				System.out.println(b2);
				System.out.println(a2);
				
				Iterator i1 = a1.iterator();
				System.out.println("   Forward iteration  ");

				while(i1.hasNext())
				{
					System.out.println(i1.next());
				}
				

				ListIterator i2 = a1.listIterator();
				
				System.out.println("   Forward iteration  ");
				while(i2.hasNext())
				{
					System.out.println(i2.next());
				}
				System.out.println("   BACKward iteration  ");
				while(i2.hasPrevious())
				{
					System.out.println(i2.previous());
				}
	}

}

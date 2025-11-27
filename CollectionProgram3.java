package module1programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionProgram3 {

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
		
		
				
				ArrayList a2 = new ArrayList();
				a2.add(785);
				a2.add(700);
				a2.add(900);
				a2.addAll(a2);
				
				//Collections.sort(a2);

				
				System.out.println(a2);
				System.out.println("max"+Collections.max(a2));
				System.out.println("max"+Collections.min(a2));
				System.out.println("freq"+Collections.frequency(a2,700));
				
				
	}

}

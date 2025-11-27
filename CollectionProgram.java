package module1programs;
import java.util.ArrayList;

public class CollectionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList a1 = new ArrayList();
		a1.add(785);
		a1.add("Ram");
		a1.add('m');
		a1.add(true);
		a1.add(89.9);
		System.out.println(a1);
		a1.add(1, "sita");
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add("Chetna");
		a2.add("Bhavya");
		a2.add(true);
		System.out.println(a2);
	//	a2.addAll(a1);
		System.out.println(a2);
		
		a2.addAll(2,a1);
		System.out.println(a2);
		
		
		boolean answer= a1.equals(a2);
				System.out.println(answer);
		
	}

}

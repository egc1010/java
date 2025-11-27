package module1programs;

public class assignment8 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int age = 20;
		boolean license = true;
		boolean car= false;

		if (age >= 18 && license && car)
		{
		    System.out.println("he is driving");
		}
		else if (age < 18 || !license) {
		    System.out.println("he is under age he cant drive");
		}
		else if (age >= 18 && license && !car) {
		    System.out.println("he can drive");
		}

	}

}

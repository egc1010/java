package module1programs;
import java.util.Scanner;
import java.text.DecimalFormat;
public class assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s1=new Scanner(System.in);

		System.out.println("amount to calculate interest");
		double amount=     s1.nextDouble();
		double interest=1.16;
		int years=1;
		System.out.println("interest to be paid by 5 years");
		 double yearInterest = Math.pow(interest, years);

		 DecimalFormat df = new DecimalFormat("#,##0.000");
			System.out.println(df.format(amount*yearInterest));
		
	}

}



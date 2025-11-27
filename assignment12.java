package module1programs;

import java.util.Scanner;
import java.text.DecimalFormat;

public class assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("salary by month");
        double monthly=     s1.nextDouble();
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println("salary yearly is ");
        System.out.println(df.format(monthly*12));
        s1.close();
	}

}

/*
 Take monthly salary of the person and calculate his yearly salary using scanner class                                        
 */
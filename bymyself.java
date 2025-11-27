package module1programs;

import java.util.Scanner;
public class bymyself {


		    public static void main(String[] args) {

				// TODO Auto-generated method stub
		    	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("type your age ");
		        int age = scanner.nextInt();

		        if (age >= 18) {
		            System.out.println("adult ");
		        } else {
		            System.out.println("under age");
		        }

		        scanner.close();
		    }
		}





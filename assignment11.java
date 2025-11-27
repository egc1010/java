package module1programs;

import java.util.Scanner;
public class assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       
                Scanner s5=new Scanner(System.in);
                System.out.println("select an option \n 1--circle \n 2--triangle \n 3--rectangle  \n 4--square \n 5--exit");
        		int option=s5.nextInt();
                
		switch(option) {
		
		case 1:
		
	
		                Scanner s1=new Scanner(System.in);
		                System.out.println("The radius of circle is->");
		                double radius=     s1.nextDouble();
		                double area=Math.PI* radius*radius;
		                System.out.println("The area of circle is->");
		                System.out.println(area);
		                s1.close();
		                break;   
		                
		case 2:
						
						
		                System.out.println("Sides of triangle ");
		       		 	Scanner s2=new Scanner(System.in);
		                System.out.println("Sides 1->");
		                double side1= s2.nextDouble();
		                System.out.println("Sides 2->");
		                double side2= s2.nextDouble();
		                System.out.println("Sides 3->");
		                double side3= s2.nextDouble();
		                System.out.println("The perimeter of triangle is->");
		                System.out.println(side1+side2+side3);

		                
		                System.out.println("The area of triangle ");
		                System.out.println("base");
		                double base= s2.nextDouble();
		                System.out.println("height");
		                double height= s2.nextDouble();
		                System.out.println("The area of triangle is");
		                System.out.println(base*height/2);
		                s2.close();
		                break;   
		              
		case 3:               
		                System.out.println("Sides of rectangle ");
		       		 	Scanner s3=new Scanner(System.in);
		                System.out.println("Sides 1->");
		                double side1rec= s3.nextDouble();
		                System.out.println("Sides 2->");
		                double side2rec= s3.nextDouble();
		                System.out.println("Sides 3->");
		                double side3rec= s3.nextDouble();
		                System.out.println("Sides 4->");
		                double side4rec= s3.nextDouble();
		                System.out.println("The perimeter of rectangle is->");
		                System.out.println(side1rec+side2rec+side3rec+side4rec);
		                
		                System.out.println("The area of rectangle ");
		                System.out.println("base");
		                double rec1= s3.nextDouble();
		                System.out.println("height");
		                double rec2= s3.nextDouble();
		                System.out.println("The area of rectangle is");
		                System.out.println(rec1*rec2);
		                s3.close();
		                break;  

		               
		case 4:                 
		                System.out.println("Sides of square ");
		       		 	Scanner s4=new Scanner(System.in);
		                System.out.println("Sides 1->");
		                double side1sq= s4.nextDouble();
		                System.out.println("Sides 2->");
		                double side2sq= s4.nextDouble();
		                System.out.println("Sides 3->");
		                double side3sq= s4.nextDouble();
		                System.out.println("Sides 4->");
		                double side4sq= s4.nextDouble();
		                System.out.println("The perimeter of square is->");
		                System.out.println(side1sq+side2sq+side3sq+side4sq);
		                
		            
		                System.out.println("The area of square is");
		                System.out.println(side1sq*side1sq);
		                s4.close();
		                break;
		                
		                
		case 5:				
						System.out.println("bye");
		                System.exit(option);
		                	
		default:	    System.out.println("choose from 1 to 5");
						}
		        }
		}
		

/*
WAP to find area and circumference of a circle, triangle , rectangle , square using scanner class
*/
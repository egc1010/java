package module1programs;
import java.util.Scanner;

public class assignment14 {
    

         static Scanner scannerGlobal = new Scanner(System.in);

        public static void methodstatic() {
        	
            System.out.println("type text (static):");
            String method = scannerGlobal.nextLine();
            System.out.println("text: " + method);
        }

         void methodnostatic() {
        	 
            System.out.println("type number ( no static):");
            int number = scannerGlobal.nextInt();
            System.out.println("number is: " + number);
        }

        public static void main(String[] args) {
        	assignment14 instancia = new assignment14(); 
        	methodstatic();
            instancia.methodnostatic(); 
            scannerGlobal.close(); 
        }
    }


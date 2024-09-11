package JDK7.Exception.com;

import java.util.Scanner;

public class tryWithBunddleResource {
	
	public static void main(String args[]) {
		
		// know we want to write logic for division and pass the scanner class object with try block.
		
		try(Scanner sc=new Scanner(System.in)){   // here we pass the object of scanner class
			System.out.println("Enter two numbers");
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			double c=a/b;
			System.out.println("division is  "+c);
		}catch(ArithmeticException e) {
			System.out.println("Error is  "+e);
		}
	}

}

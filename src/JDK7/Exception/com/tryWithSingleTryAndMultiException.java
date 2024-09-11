package JDK7.Exception.com;

import java.util.Scanner;

public class tryWithSingleTryAndMultiException {
	public static void main(String args[])  {
		
		
		
		try(Scanner sc=new Scanner (System.in)){
			System.out.println("Enter two numbers ");
			
		       int a=sc.nextInt();
		       int b=sc.nextInt();
		       double c=a/b;
		       
		       System.out.println("Division of two numbers is "+c);
		       // '|' pipe operator
		       
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			System.out.println("Exception is "+e);
		}
	}

}

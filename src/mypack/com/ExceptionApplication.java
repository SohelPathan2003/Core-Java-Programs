package mypack.com;

import java.io.IOException;
import java.util.Scanner;

//class exp{
//	void operation() {
//		try {
//		int a=12,b=0;
//		int c=a/b;
//		System.out.println(c);
//		}catch(Exception e) {
//			System.out.println("Error is  "+e);
//		}
//	}
//}
//public class ExceptionApplication {
//	public static void main(String args[]) {
//		exp obj=new exp();
//		obj.operation();
//	}
//
//}



      // user define exception 


//class exceptionApp extends ArithmeticException{
//	String getexc() {
//		return "invalid devisor";	}
//	
//}
//class myexp{
//	void perform(int a,int b) {
//		
//			if(b==0) {
//				exceptionApp obj=new exceptionApp();
//				throw obj;
//			}else {
//				System.out.println("Divisor is  "+a/b);
//			}
//		
//	}
//}
//
//public class ExceptionApplication{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter two values\n");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		myexp obj=new myexp();
//		try {
//			obj.perform(a,b);	
//		}catch(exceptionApp e) {
//			System.out.println(e.getexc());
//			
//		}
//	}
//}



         // using throws keyword.


class exp{
	void perform(int a,int b)throws IOException
	{
		float c=a/b;
		System.out.println(c);
	}
}




 public class ExceptionApplication{
	 public static void main(String args[]) {
		 exp obj=new exp();
		 
		 try {
			 obj.perform(12,0);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		 
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
package mypack.com;

import java.util.Scanner;

abstract class a1{
	abstract void show();    // we can declared non abstract method and abstract method within abstract class 
	
	abstract void display();   // we cannot declared abstract method within non abstract class..
}
class b extends a1{
	
	b(){
		super();
	}
	
	void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println(a);
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
}
public class ReferenceAbstractApp {
	public static void main(String args[]) {
		
	}
	

}

package collection;

import static java.lang.System.*;
class cons {
	
	private int a;
	private int b;
	cons(){
		
	}
	
	cons(int a){
		
	}
	
	cons(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	
	void seta(int a)
	{
		this.a=a;
	}
	void setb(int b) {
		this.b=b;
	}
	void math(int a,int b) {
		
		int c=a+b;
		
	   System.out.println(c);	
	}
}
public class constructorExample {
	
	public static void main(String ...args) {
		
		cons obj=new cons(10,10);
	}

}

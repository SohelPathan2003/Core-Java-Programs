package collection;

import java.util.*;

class square implements Cloneable{
	
	square getClone() throws CloneNotSupportedException {
		return (square)this.clone();
	}
	
	void setvalue(int a) {
		this.a=a;
	}
	private int a;
	
	void show() {
		System.out.println(a*a);
	}
}
public class CloneApplication {
	
	public static void main(String args[]) {
		
		/*square obj=new square();
		obj.setvalue(5);
		
		square s=obj;     here we lose our data 5 because it override on 5 we only change reference not object
		s.setvalue(10);
		
		obj.show();
		
		*/
		
		
		square obj=new square();
		
		obj.setvalue(5);
		square s=null;
		
		try {
			s=obj.getClone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		s.setvalue(10);
		obj.show();   // here we save our previous data means 5 .
		
		System.out.println(System.identityHashCode(s));    // both has different hash code.....
		System.out.println(System.identityHashCode(obj));
		
		
	}

}

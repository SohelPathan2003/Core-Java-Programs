package mypack.com;
import java.util.ArrayList;
public class ListMethods {
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		System.out.println("before using set method\n"+obj);
		obj.set(1,100);   // if we use set method it help us to override value means if we want to add element at specific 
		                // index then it will override the value.
		System.out.println("After using set method\n"+obj);
		
		
		
		
		ArrayList obj2=new ArrayList();
		
		obj2.add(1);
		obj2.add(2);
		obj2.add(3);
		obj2.add(4);
		obj2.add(5);
		
		System.out.println("Before using add method\n"+obj2);
		obj2.add(1,100);    // if we use add method to store value at particular index then it will add the value and move
		                   // the other elements on next index. it cannot override the value as set but it will change the index no.
		System.out.println("After using add method \n"+obj2);
		
	}

}

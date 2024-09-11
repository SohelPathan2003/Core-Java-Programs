package mypack.com;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		ArrayList obj2=new ArrayList();
		
//		obj2.add(1);
//		obj2.add(7);       if we check containsAll() then it will return false because obj contain only 1 but not 7 that's why
		                 // we get false. Note if we use containsAll() then all elements of second object must be present in 
		                // first object if present then it will return true otherwise false.
		
		boolean bo=obj.containsAll(obj2);
		
		System.out.println(bo);
	}

}

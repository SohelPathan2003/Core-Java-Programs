
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class listduplicate {
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		
		obj.add(10);		obj.add(10);
		obj.add(10);
		obj.add(10);
		obj.add(12);
		Iterator i=obj.iterator();
		
		while(i.hasNext()) {
			Object a=i.next();
			System.out.println(a+" hash code is "+System.identityHashCode(a));
		}
		
		
//		HashSet obj1=new HashSet();
//		obj1.add(10);
//		obj1.add(10);
//		obj1.add(10);
//		obj1.add(10);
//		obj1.add(10);
//		System.out.println(obj1);		    
		
	}

}


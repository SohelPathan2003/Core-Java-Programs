package mypack.com;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveMethod {
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		
		obj.add(12);
		obj.add(13);
		obj.add(16);
		obj.add(15);
		obj.add(14);
		
		
		int ind=obj.indexOf(12); // we can find the index of element with the help of indexOf() method.
		
	      obj.remove(ind);     // remove method work with index of element 
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

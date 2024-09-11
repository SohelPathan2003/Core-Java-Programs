package mypack.com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class CursorApp {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
//		Vector v=new Vector();
//		v.add(10);
//		v.add(12);
//		v.add(14);
//		v.add(78);
//		v.add(59);
		
		
		al.add(14);
		al.add(13);
		al.add(19);
		al.add(10);
		al.add(17);
		
		//Enumeration em=al.elements(); // here note: Enumeration interface work with only legecy class and we know that
		// arraylist is none legecy class. so here i try to use or convert arraylist so we got error at compile time.
		
		
//		Enumeration em=v.elements();
//		
//		while(em.hasMoreElements()) {
//			System.out.println(em.nextElement());
//		}
//		
		ListIterator lts=al.listIterator(al.size());   // if we want to traverse the collection in backward direction
		// then we have to pass their size as parameter to the listIterrator(metioned the size);
		System.out.println();
		while(lts.hasPrevious()) {
			System.out.println(lts.previous());
		}
		

	}

}

package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class getMethod {
	public static void main(String args[]) {
		
		ArrayList al=new ArrayList();
		
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		
		
		int d=(int) al.get(4);
		System.out.println(d);
		
		List a= al.subList(0,5);
		System.out.println(a);
		
		ListIterator alt=al.listIterator();
		while(alt.hasPrevious()) {
			System.out.println(alt.hasPrevious());
		}
		
		for(Object o:al) {
			System.out.printf("%d  ",(int)o);
			
		}
		
		Vector v=new Vector(al);
		Enumeration em= v.elements();
		
		
		
		
		
		
		
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		al1.add(70);
		al1.add(80);
		al1.add(90);
		al1.add(100);
		
		List l=Collections.unmodifiableList(al1);     // here we decide the collection is not modify further .
		
		l.set(8,1);   
		l.add(7,2);  // this cause error because we try to modify the List l like and add run time error.
		System.out.println(l);


		
		
	}

}

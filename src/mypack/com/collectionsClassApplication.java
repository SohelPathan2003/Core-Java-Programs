package mypack.com;


import java.util.*;

public class collectionsClassApplication {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		HashSet hs=new HashSet();
		
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(10);
		
		hs.add(60);
		hs.add(70);
		hs.add(80);
		hs.add(90);
		hs.add(100);
		
		// lets we see can we pass vector or linkedList or stack as paramter to collections.sort.
		LinkedList ll=new LinkedList();
		Stack s=new Stack();
		Vector v=new Vector();
		
		ll.add(90);
		ll.add(80);
		ll.add(70);
		ll.add(30);
		ll.add(40);
		
		s.add(550);
		s.add(50);
		s.add(500);
		s.add(10);
		s.add(1000);
		
		
		v.add(100);
		v.add(90);
		v.add(360);
		v.add(58);
		v.add(520);
		
		Collections.sort(v);
		Collections.sort(s);
		Collections.sort(ll);
		Collections.sort(al);
		System.out.println("sorted vector is        "+v);
		System.out.println("sorted stack  is        "+s);
		System.out.println("sorted linkedlist is    "+ll);  // means we can say Collectins.sort() only work with List Interface. 
		System.out.println("\n\nafter sorting a list    "+al);
		
		
		
		Collections.reverse(al);
		System.out.println("After reverse the array list    "+al);
		
		
		
		
		
		
		System.out.println("\n\nmax element from list");
		Object max=Collections.max(al);
		System.out.println(max);
		
		
		
//		System.out.println("Afet sorting set");
//		Collections.sort(hs);        // here we got a compile time error because Collection.sort() work with only List Interface.
		// we can pass vector LinkedList and stack.

		
		
		
		max=Collections.max(hs); // here we are working with set interface means we can say Collections.max(any type of collection) it takes.
		Object min=Collections.min(hs);
		System.out.println("Max value from set collection "+max);
		System.out.println("Min value from set collection "+min);
		
		
		//Collections.reverse(hs);       // here are we get error because Collection.reverse() only work with list interface.
	}

}

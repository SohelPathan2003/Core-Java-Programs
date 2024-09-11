package JDK7.Exception.com;

import java.util.*;

public class PrimitiveWithCollection {
	public static void main(String args[]) {
		
		 ArrayList al=new ArrayList();

	        int a=10;
	        int b=10;

	        HashSet <Integer>hs=new HashSet<Integer>();

	        al.add(a);
	        al.add(b);

	        hs.add(a);
	        hs.add(b);
	      System.out.println(System.identityHashCode(a)+"\t\t\t"+System.identityHashCode(b));
	        System.out.println(al);
	        System.out.println(hs);
	    
	}

}

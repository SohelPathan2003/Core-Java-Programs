package mypack.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class ArrayList1 {
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		
		obj.add(1);
		obj.add("sohel");
		obj.add(12.123);
//		System.out.println(obj);
		
		Iterator i=obj.iterator();
	    while(i.hasNext()) {       // hasNext() method check element are present or not if present then it will return true other
	    	                        //wise it will return false.
	    	
	    	
	    	
	    	System.out.println(i.next());     // next() method print the current value or do operation on current value and move
	    	                                 // to the next Index.
	    }
	    
	    ArrayList<Integer> obj2=new ArrayList<Integer>();    // here we declare obj2 as Integer.
	    
	    //obj2.add("sohe");     // here we try to store String value so compiler generate the compile time error to us.
	    
	    
	    	    obj2.add(2);
	    	    obj2.addAll(obj);      // here we add the all values of object 1 in object2

	   
	    System.out.println(obj2);
	    boolean t=obj.contains(2);
	    System.out.println(t);
	    boolean bo=obj2.remove("sohel");
	    System.out.println("Successfully deleted  "+bo);
	    System.out.println("After perform remove operation on obj2");
	    System.out.println(obj2);
	    

	    ArrayList obj3=new ArrayList();
	   obj3.add(1);	   
	   obj3.add(2);	
	   obj3.add(3);
	   obj3.add(4);	
	   obj3.add(5);	
	   obj3.add(6);	
	   obj3.add(7);	
	   obj3.add(8);
	   Object[] Arr=obj3.toArray();
	   for(int i1=0;i1<Arr.length;i1++) {
		   System.out.println(Arr[i1]);
	   }
	    }
}

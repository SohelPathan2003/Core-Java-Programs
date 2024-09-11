package org;

import java.util.HashMap;

public class removeElementUsingKey {
	
public static void main(String args[]) {
	
	     HashMap<Integer,String>hm=new HashMap<Integer,String>();
	     
	     hm.put(1,"one");
	     hm.put(2,"two");
	     hm.put(3,"three");
	     hm.put(4,"four");
	     hm.put(5,"five");
	     hm.put(6,"six");
	     hm.put(7,"seven");
	     
	     String s=hm.remove(5);
	     
	     System.out.println("Removed element is  "+s);
	     
}
}

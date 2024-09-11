package org;
     import java.util.LinkedHashMap;
public class containsValues {
public static void main(String args[]) {
	LinkedHashMap lhm=new LinkedHashMap();
	
	lhm.put(3,"three");
	lhm.put(2,"two");
	lhm.put(5,"five");
	lhm.put(1,"one");
	lhm.put(8,"eight");
	
	boolean b=lhm.containsValue("two");
	
	if(b)
		System.out.println("value is present ");
	else
		System.out.println("value is not present ");
}
}

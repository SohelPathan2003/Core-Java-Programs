package org;

import java.util.LinkedHashMap;
import java.util.Set;


public class keyset {
	public static void main(String args[]) {
		
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put(1,"one");
		lhm.put(2,"two");
		lhm.put(4,"four");
		lhm.put(3,"three");
		lhm.put(8,"eight");
		lhm.put(6,"six");
		
		System.out.println(lhm);
		
		Set s=lhm.keySet();
		
		System.out.println(s);
	}

}

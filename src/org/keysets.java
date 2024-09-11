package org;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
public class keysets {

	public static void main(String[] args) {
		
		LinkedHashMap lh=new LinkedHashMap();
		
		lh.put(1,"one");
		lh.put(2,"two");
		lh.put(3,"three");
		lh.put(4,"four");
		lh.put(5,"five");
		
		
		Set s=lh.keySet();
		
		System.out.println(s);

		Iterator i=s.iterator();
		
		while(i.hasNext()) {
			int key=(int)i.next();
			System.out.println("key is  "+key+"   value is "+lh.get(key));
		}
	}

}

package org;

import java.util.*;

public class getAllValues {
	
	public static void main(String args[]) {
		LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>();
		
		lh.put(1,"one");
		lh.put(2,"two");
		lh.put(3,"three");
		lh.put(4,"four");
		lh.put(5,"five");
		
		Collection value= lh.values();
		
		System.out.println(value);
		
		Iterator i=value.iterator();
		
		while(i.hasNext()) {
			String s=(String)i.next();
		//	System.out.println("value is "+ s+"  and key is "+ lh.get(s));
		}
	}		
			
}

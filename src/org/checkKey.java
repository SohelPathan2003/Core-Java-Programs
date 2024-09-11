package org;

import java.util.HashMap;

public class checkKey {
	public static void main(String args[]) {
	HashMap hm=new HashMap();
	
	hm.put(1,"one");
	hm.put(2,"two");
	hm.put(3,"three");
	hm.put(4,"four");
	hm.put(5,"five");
	
	
	System.out.println(hm);
	
	boolean ans=hm.containsKey(6);      // containsKey() method check the key is present or not is collection.
	
	if(ans) {
		System.out.println("key is present in collection");
	}else {
		System.out.println("key is not present in collection");
	}
}
}

package org;

import java.util.*;



public class mapex1 {
	public static void main(String args[]) {
		
		HashMap<Integer,String>hs=new HashMap<Integer,String>();
		hs.put(1,"One");
		hs.put(2,"Two");
		hs.put(3,"three");
		
		for(int i=1;i<=hs.size();i++) {
		//	System.out.println(hs.get(0)); here we try to get 0 key and we don't have 0 key in map.so it
			//print null.
			System.out.println(hs.get(i));
		}
	}

}

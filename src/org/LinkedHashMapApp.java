package org;

import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapApp {
	
	public static void main(String args[]) {
		LinkedHashMap <Integer,String>lhm=new LinkedHashMap<Integer,String>();
		
		lhm.put(1,"one");
		lhm.put(2,"two");
		lhm.put(10,"ten");
		lhm.put(9,"nine");
		lhm.put(6,"six");
		lhm.put(5,"five");
		lhm.put(4,"four");
		
		
		Set<Map.Entry<Integer,String>>smap=lhm.entrySet();
		
		for(Map.Entry obj:smap) {
			
			System.out.println(obj.getKey()+" ------------>  "+obj.getValue());
		}
		
	//   TreeMapApplication <Integer,String>tm=new TreeMapApplication<Integer,String>();
	   
//	   System.out.println("After Sorting elements in Ascending order");
//	   
//	   Set<Map.Entry<Integer,String>>maps=tm.entrySet();
//	   
//	   for(Map.Entry obj:maps) {
//		System.out.println(obj.getKey()+"-----------> "+obj.getValue());   
//	   }
//		
//		
		
	}

}

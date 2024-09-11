package org;
import java.util.*;

public class TreeMapApplication {
	public static void main(String args[]) {
		
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		
		
		tm.put("oe",1);
		tm.put("a",23);
		tm.put("b",24);
		
//		tm.put(null,6);
		
		System.out.println(tm);
		
	}

}

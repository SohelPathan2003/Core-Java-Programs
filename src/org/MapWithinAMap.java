package org;

import java.util.*;
import java.util.Map.Entry;

public class MapWithinAMap {
	
	public static void main(String args[]) {
		
LinkedHashMap<String,LinkedHashMap<String,Integer>> map=new LinkedHashMap<String,LinkedHashMap<String,Integer>>();

         LinkedHashMap<String, Integer> m=new LinkedHashMap<String,Integer>();
         LinkedHashMap<String,Integer> m2=new LinkedHashMap<String,Integer>();
         m2.put("Math",1000);
         m2.put("electricity",150);
    m.put("science",400);
    m.put("Math",400);
    m.put("physics",5000);
    m.put("History",6000);
    map.put("Computer Science",m);
    map.put("electrical ",m2);
    
    Set<Map.Entry<String,LinkedHashMap<String,Integer>>> maps=map.entrySet();
    
    for(Map.Entry<String,LinkedHashMap<String,Integer>> obj:maps) {
    	
    	String s=obj.getKey();
    	System.out.println(s+" : \n");
    	System.out.println("--------------------------------------------------------");
    	System.out.println("cource\tfees\n");
    	
    	
    	Set<Map.Entry<String, Integer>> data=obj.getValue().entrySet();
    	for(Map.Entry<String,Integer> d:data) {
    		
    		System.out.println(d.getKey()+"\t"+d.getValue());
    	}
    	System.out.println("-----------------------------------------------------------");
    }
    
	}

}

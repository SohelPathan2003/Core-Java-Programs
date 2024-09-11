package org;

import java.util.*;
public class OccuranceApp {

	  public static void main(String args[]) {
		  
		  int arr[]=new int[]{10,10,20,30,43,43,30,30,30,56,10,60};
		  
		  LinkedHashMap<Integer,Integer>lm=new LinkedHashMap<Integer,Integer>(16,0.75f);
		  
		  for(int a:arr) {
			  
			  Integer key=lm.get(a);
			  if(key!=null) {
				 key++;
				 lm.put(a,key);
			  }else {
				  key=0;
				  lm.put(a,++key);
			  }
		  }
		Set<Map.Entry<Integer,Integer>>maps=lm.entrySet();
		
		for(Map.Entry obj:maps) {
			System.out.println(obj.getKey()+"="+obj.getValue());
		}
		  
	  }
}

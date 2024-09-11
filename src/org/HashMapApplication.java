package org;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.*;
public class HashMapApplication {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>(16,0.75f);
		
		hm.put(1,"one");
		hm.put(4,"four");
		hm.put(2,"two");
		hm.put(5,"five");
		hm.put(3,"three");
		
		Set s=hm.keySet();
		Collection l=hm.values();
		
		System.out.println("keys are : "+s);
		System.out.println("Values are : "+l);
		
		Set<Map.Entry<Integer,String>>mset=hm.entrySet();
		
		for(Map.Entry<Integer,String> obj:mset) {
			System.out.println(obj.getKey()+" -------------> "+obj.getValue());
		}
		
		}

}

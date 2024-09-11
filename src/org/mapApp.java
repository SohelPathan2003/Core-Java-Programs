package org;
import java.util.*;
public class mapApp {
public static void main(String args[]) {
	
	HashMap<Integer,String>hsm=new HashMap<Integer,String>();
	
	 hsm.put(1,"sohel");
	 hsm.put(2,"sahil");
	 hsm.put(3,"tejas");
	 hsm.put(null,"sohel");    // we can declare add multiple values but only one null key in map.
	 hsm.put(null,null);
	 
	 HashMap <String,Integer>hm=new HashMap<String,Integer>();

	hm.put("sohel",2);
	hm.put("tejas",3);
	hm.put("sahil",4);
	hm.put("rushi",2);
	System.out.println(hsm);
	System.out.println(hm);
}
}

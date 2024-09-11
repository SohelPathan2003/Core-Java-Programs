package org;
import java.util.*;

public class mapApplication {
      public static void main(String args[]) 
      {
    	  LinkedHashMap <String,ArrayList<String>>lm=new LinkedHashMap<String,ArrayList<String>>();
    	  ArrayList<String> al=new ArrayList<String>();
    	  
    	  al.add("Virat Kohli");
    	  al.add("Rohit Sharma");
    	  al.add("Kuldeep Yadav");
    	  al.add("yash dayal");
    	  
    	  ArrayList <String>al2=new ArrayList<String>();
    	  
    	  al2.add("Usman khawaja");
    	  al2.add("Devid Warner");
    	  al2.add("Maxwell");
    	  al2.add("Stev Smith");
    	  
    	  lm.put("India",al);
    	  lm.put("Australia",al2);
    	  
    	  Set<Map.Entry<String,ArrayList<String>>>maps=lm.entrySet();
    	  
    	  for(Map.Entry<String,ArrayList<String>> obj:maps) {
    		  
    		  String s=obj.getKey();
    		  ArrayList<String> a=obj.getValue();
    		  System.out.println("Team :"+s+"\n");
    		  for(String str:a) {
    			  System.out.println(str);
    			  
    		  }
    		  System.out.println("--------------------------------------------------");
    		  
    	  }
      }
}

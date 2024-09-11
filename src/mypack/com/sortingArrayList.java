package mypack.com;

import java.util.*;

public class sortingArrayList {
     public static void main(String args[]) {
    	 
    	 ArrayList al=new ArrayList();
    	 
    	 al.add(10);
    	 al.add(20);
    	 al.add(30);
    	 al.add(40);
    	 al.add(50);
    	 al.add(60);
    	 al.add(70);
    	 
    	 for(int i=0;i<al.size();i++) {
    		 for(int j=(i+1);j<al.size();j++) {
    			int prev=(int)al.get(i);
    			int next=(int)al.get(j);
    			if(prev<next) {
    				al.set(i,next);
    				al.set(j,prev);
    			}
    		 }
    	 }
    	 System.out.println(al);
   
    	 Iterator lt=al.iterator();
    	 
    	 while(lt.hasNext()) {
    		Object o=lt.next();
    		System.out.println(o);
    	 }
   }

}

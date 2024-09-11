package collection;

import java.util.*;

public class FindCommonElementsFromTwoListApplication {

	
	public static void main(String args[]) {
		
		
		FindCommonElementsFromTwoListApplication ref=new FindCommonElementsFromTwoListApplication();
		
		ArrayList <Integer>list1=new ArrayList<Integer>();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		ArrayList<Integer> list2=new ArrayList<Integer>(list1);
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(9);
		list2.add(5);
		
		int l1=list1.size();
		int l2=list2.size();
		
		
		ArrayList<Integer> commanElement=new ArrayList<Integer>();
		
		
	    ArrayList<Integer> al=new ArrayList<Integer>(list2);
	
	   ArrayList<Integer> remElementFirst=new ArrayList<Integer>();
	   ArrayList<Integer> remElementSecond=new ArrayList<Integer>();
	   
	   boolean flag=true;
	    for(int i=0,j=l1;i<l1;i++) {
	    	
	    	System.out.println(al.get(i)+"\t=="+al.get(j));
	    	if(al.get(i)==al.get(j)) {
	    		commanElement.add(al.get(j));
	    		flag=false;
	    	}
	    	
	    	
	    	
	    	if(i==l1-1 && j<l2-1) {// repeat the same loop and only increase the j value by one
	    		if(flag) {
		    		 remElementSecond.add(al.get(j));
		    		 remElementFirst.add(al.get(i));
		    	 }
	    		
	    		
	    		
	    		i=0;
	    		j++;
	    		flag=true;
	    	}else  if(i==l1-1){    // print all the element at the end of the loop
	    		System.out.println("commanElements are "+commanElement);
	    		System.out.println("Unique Elements From First List "+remElementFirst);
	    		System.out.println("Unique Elements From Second List "+remElementSecond);
	    		
	    	}
	    }
	    
	    
	}
}
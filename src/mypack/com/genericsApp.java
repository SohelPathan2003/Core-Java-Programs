package mypack.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class genericsApp {
	
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(12);
		al.add(13);
		al.add(17);
		al.add(4775);
		al.add(32);
		//al.add("sohel");       // here we get error because we declare ArrayList as Integer means we applied restriction on 
		                     // ArrayList means we cannot add String type of value in the ArrayList and here i tried to store 
		                   // String type of value in to so we got error.
		
		// sort the given ArrayList..
		
		
		Collections.sort(al);
		
		for(Integer i:al) {       // here if we observe here we did not perform the type casting because at the time of
			                    // array Declaration we declare ArrayList as Integer means their generics type is Integer
			                    // so that's why we no need to convert at the time of data fetching.
			System.out.println(i);
		}
		
	}

}

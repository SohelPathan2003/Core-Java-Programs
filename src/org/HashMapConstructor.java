package org;

import java.util.*;

public class HashMapConstructor {
	public static void main(String args[]) {
		HashMap<Integer,String> obj2=new HashMap<Integer,String>(); //  this is default constructor 
		// with the initial capacity of 16 and load factor is 0.75%.
		
		HashMap <Integer,String>obj=new HashMap<Integer,String>(17);// this object is created with initial 
		// capacity is 17 and laod factor is 0.75%.
		
		HashMap<Integer,String> obj3=new HashMap<Integer,String>(20,0.85f); // this is third Constructor
		 // which is help us to create hashmap with 20 initial capacity or 85% load factor of hasmap.
		// so we can say this constructor is use full for use define size or capacity of HashMap object.
		
		
		HashMap <Integer,String> obj5=new HashMap<Integer,String>(obj3);// this create a new hashmap with 
		 // previous hash map.
		
		obj.put(1,"one");
		obj.put(2,"two");
		obj.put(3,"three");
		
	}

}

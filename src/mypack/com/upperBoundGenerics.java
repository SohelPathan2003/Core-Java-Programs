package mypack.com;

import java.util.ArrayList;
import java.util.List;

class test1{
	void add(List<?>list) {      // ? means we can pass any type of data into it. 
		for(Object o:list) {
			System.out.println(o);
		}
		
		System.out.println("\n\n");
		
	}
}

public class upperBoundGenerics {
	public static void main(String args[]) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("sohel");
		al.add("sahil");
		al.add("santosh");
		al.add("tejas");
		al.add("sabir");
		al.add("shoheb");
		al.add("yash");
		
		
		ArrayList <Integer>a=new ArrayList<Integer>();
		a.add(10);
		a.add(10);
		a.add(10);
		a.add(10);
		a.add(10);
		a.add(10);
		
		test1 obj=new test1();
		
		obj.add(al);     // here we pass any type of data into the test1 class add method.
		obj.add(a);
		
		
	}

}

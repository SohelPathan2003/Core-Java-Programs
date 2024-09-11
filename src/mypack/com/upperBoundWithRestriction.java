package mypack.com;

import java.util.ArrayList;
import java.util.List;

class test2{
	void add(List<? extends Number> list) {
		
	}
}

public class upperBoundWithRestriction {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(1993);
		al.add(24);
		al.add(32);
		
		
		ArrayList <Float> a=new ArrayList<Float>();
		
		a.add(10.23f);
		a.add(23432f);
		a.add(22.23f);
		a.add(242.24f);
		a.add(2.2f);
		
		
		ArrayList <Character> c=new ArrayList<Character>();
		
		c.add('a');
		c.add('b');
		c.add('c');
		c.add('d');
		c.add('e');
		
		
		ArrayList <String> s=new ArrayList<String>();
		
		s.add("Sohel");
		s.add("sahil");
		s.add("tejas");
		s.add("sabir");
		s.add("santosh");
		s.add("yash");
		s.add("shoheb");
		
		test2 obj=new test2();
		
		obj.add(al);
		obj.add(a); // here we have no error because both are numeric type and we declare add() method with extends keyword and 
		// extends the numeric class means number class. we can pass whichever classes are present under the number class.
		
		
		
//		obj.add(c); // here we get error
//		obj.add(s);
		
		
	}

}

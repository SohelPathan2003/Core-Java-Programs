package mypack.com;

import java.util.ArrayList;
import java.util.List;

class test{
	
	void add(List<? extends String> i) {     // here we extends the String class means we can store ot take object as argumenet
		           // only String type of classes of String class.
		System.out.println("i am in");
		
	}
}
public class wildcardUnbounded {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		
		al.add(12);
		al.add(13);
		al.add(40);
		al.add(564);
		al.add(284);
		
		test t1=new test();
		
//		t1.add(al);     here we get error because we try to pass object of ArrayList with Integer generics.
		
		
		
	}

}

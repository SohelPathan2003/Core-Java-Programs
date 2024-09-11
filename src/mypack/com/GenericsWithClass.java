package mypack.com;

import java.util.ArrayList;


class myclassa <E>{
	
		void add(E e) {
		System.out.println(e);
		
		
	}
	
	
}

public class GenericsWithClass {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		myclassa obj=new myclassa();
		
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(16);
		al.add(89);
		
		obj.add(al);
		
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("sohel");
		s.add("sohel");
		s.add("sohel");
		s.add("sohel");
		s.add("sohel");
		
		obj.add(s);
		
	}

}

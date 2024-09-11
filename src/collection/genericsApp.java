package collection;

import java.util.*;

public class genericsApp {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();   // here i decide the type of collection or apply the ristriction on
		// collection.
		
		al.add(19);
		//al.add(283.3);    // here we get the compile time error because or arraylist is Integer type so we cannot add
		                 // another type in it.
		al.add(18);
		al.add(283);
		al.add(57);
		al.add(23);
		
		
	}

}

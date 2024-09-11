package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CopyCollection {
	
	public static void main(String args[]) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		HashSet hs=new HashSet();
		
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		
		ArrayList a11=new ArrayList(hs);
		System.out.println(a11);
	}

}

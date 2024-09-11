package collection;
import java.util.ArrayList;
import java.util.HashSet;


public class hashSetApp {
	public static void main(String args[]) {
		
		HashSet hs=new HashSet();
		
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(76);
		hs.add(121);
		hs.add(132);
		hs.add(143);
		hs.add(764);
		hs.add(125);
		hs.add(136);
		hs.add(146);
		hs.add(767);
		hs.add(128);
		hs.add(139);
		hs.add(141);
		hs.add(762);
		hs.add(123);
		hs.add(134);
		hs.add(145);
		hs.add(766);
		
		
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(17);
		al.add(11);
		
		hs.addAll(al);
		
		System.out.println(hs);
		System.out.println( "size is  "+hs.size());
		
		
//		HashSet hs1=new HashSet(1,0);     here we will get the error because i set load factor 0 means it will not 
//		hs1.add(10);       increase the capacity and we add the more than 1 elements in HashSet.
//		hs1.add(20);
//		hs1.addAll(al);
		
		
		
		
		
		HashSet hs2=new HashSet(12);
//	
	}

}

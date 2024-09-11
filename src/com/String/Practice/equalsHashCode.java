package com.String.Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

class Add {

	String ss;
	int id;

	public Add(int id, String n) {
		ss = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Add [ss=" + ss + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Add a = (Add) obj;
		// TODO Auto-generated method stub
		if (this.ss == a.ss) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {

		return id * 2;
	}

}

public class equalsHashCode {
	public static void main(String args[]) {

		Add a1 = new Add(102, "ajay");
		Add a2 = new Add(101, "ajay");
		if (a1.equals(a2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are Not same");
		}
		System.out.println("First Object: " + a1.hashCode());
		System.out.println("Second Object: " + a2.hashCode());

		HashSet ls = new HashSet();

		ls.add(a1);//15522
		ls.add(a2);//15522

		for (Object o : ls) {
			System.out.println(o);
		}

//			System.out.println("both are same"+s.hashCode());
//		
//		else
//			System.out.println();
//			System.out.println("both are different"+s1.hashCode());
//			
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s1));

	}

}

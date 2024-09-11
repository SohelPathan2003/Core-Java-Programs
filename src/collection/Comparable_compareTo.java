package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class a12 implements Comparable<a12>{
	
	a12(int d,String n){
		id=d;
		name=n;
	}
	private int id;
	private String name;
	
	public void setd(int d,String n) {
		id=d;
		name=n;
	}
	
	void show() {
		System.out.println("id "+id+"name\t"+name+"\n");
	}
	
	public int compareTo(a12 o) {
		if(this.id>o.id) {
			return 1;
		}else if(this.id<o.id){
			return -1;
			
		}else {
			return 0;
		}
	}
	
}

public class Comparable_compareTo {
	public static void main(String args[]) {
		
		
		ArrayList <a12>al=new ArrayList<a12>();
		
		
	     
	     al.add(new a12(1,"sohel"));
	     al.add(new a12(3,"shoeib"));
	     al.add(new a12(4,"yash"));
	     al.add(new a12(2,"tejas"));
	     al.add(new a12(6,"sir"));
	     
	     Collections.sort(al);
	     
	     
	    for(a12 o:al) {
	    	o.show();
	    }
	    
	}

}

package collection;

import java.util.ArrayList;
public class sizeMethod {
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(16);
		int size=obj.size();
				
				/* it will return the size of elements
		        means how many elements present in collection
		        it will return the number of elements in collection.*/
		
		System.out.println("number of elements in collection "+size);   
	}

}

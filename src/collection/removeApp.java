package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class removeApp {
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		Scanner sc=new Scanner(System.in);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		
	
			
			int index = obj.indexOf(40);
		
			
		Object o=obj.remove(index);
		if(o!=null) {
				System.out.println();
		}else {
			
		}
		System.out.println(o);
		}
		
		
		
	}











//Iterator i=obj.iterator(); // here i create reference of iterator interface  
////and reference points to object of ArrayList collection or class.
//
//System.out.println("Enter number for search");
//int num=sc.nextInt();  // input value for search 
//
//
//int ind=obj.indexOf(num); // get the index of number if found it will return
//   // index of that number otherwise -1
//
//if(ind!=-1) {// here i check if not equals to -1 then print found otherwise not.
//	System.out.println("number found");
//}else {
//	System.out.println("Number not found");
//	
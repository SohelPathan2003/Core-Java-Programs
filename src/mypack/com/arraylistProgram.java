package mypack.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
public class arraylistProgram {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
Scanner sc=new Scanner(System.in);
		
		int num=0,choice=0;;
		do {
		System.out.println("\n\n1 for add 10 values");
		System.out.println("2 for display values");
		System.out.println("3 for add new values");
		System.out.println("4 for search value in arraylist");
		System.out.println("5 for Sort values in ascending order");
		System.out.println("6 for sort all  values descending order");
		System.out.println("7 for Find max value from arraylist");
		System.out.println("8 for Find min values  from Arraylist");
		System.out.println("9 for update value in arraylist");
		System.out.println("10 for  delete value in values");

		
		System.out.println("Enter your choice");
		 choice=sc.nextInt();
		switch(choice) {
		case 1:
//		obj.add(10);
//		obj.add(12);
//		obj.add(13);
//		obj.add(14);
//		obj.add(15);
//		obj.add(16);
//		obj.add(17);
//		obj.add(18);
//		obj.add(19);
//		obj.add(20);
			System.out.println("enter 10 elements in collection\n");
			for(int i=0;i<5;i++) {
				 num=sc.nextInt();
				obj.add(num);
			}
		break;
		
		case 2:
			Iterator i=obj.iterator();
			System.out.println("Elements are \n");
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
			break;
		case 3:
			// add new value in collection
			System.out.println("Enter value which you want to add\n");
			num=sc.nextInt();
			obj.add(num);
			break;
		case 4:
			System.out.println("Enter element which you want to search\n");
			num=sc.nextInt();
			boolean b=obj.contains(num);
			if(b) {
				System.out.println("Element found \n");
			}else {
				System.out.println("Element is not found\n");
			}
			break;
			
		case 5:
			System.out.println("After sorting elements in collection\n");
			Collections.sort(obj);
			System.out.println(obj);
			
		
		case 6:
			Collections.sort(obj,Collections.reverseOrder());
			System.out.println(obj);
			break;
		case 7:
		     Object o=  Collections.max(obj);		
		       System.out.println("Max elemet is "+o);
		}
		}while(choice!=0);
	}
}

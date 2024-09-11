package mypack.com;
import java.util.*;
public class sublistApp {
	
	public static void main(String args[]) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);
		obj.add(10);
		obj.add(11);
		
		System.out.println(obj);
		List obj2=obj.subList(1,5);
		System.out.println(obj2);
	}
	}

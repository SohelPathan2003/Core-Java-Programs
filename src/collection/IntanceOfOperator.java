package collection;

import java.util.ArrayList;

public class IntanceOfOperator {
	public static void main(String args[]) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(10.0);
		al.add(883.324);
		al.add("sohel");
		al.add(1232232133);
		
		int sum=0;
		for(Object obj:al) {
//			if(obj instanceof Integer) { //  if we not use instance of operator then we will get java.lang.ClassCastException:
				sum+=(int)obj;     // because here al have verious type of object like as float string and here we try 
				        // to type cast all the member of al so at the time of float and string jvm will generate the error.
//			}
		}
		System.out.println("sum is "+sum);
		
		
	}

}


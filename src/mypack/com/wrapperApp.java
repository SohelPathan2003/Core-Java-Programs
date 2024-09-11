package mypack.com;

public class wrapperApp {

	
	public static void main(String args[]) {
//		int a=10;
//		float b=a;
//		System.out.println(b);
		
		
		
		
//		Long a=1000l;
//		int b=a;      this get failed because we try to perform conversion between reference to primitive 
		
		
		
		
//		Long a=1000l;
//		int b=a.intValue();
//		System.out.println("here we perform conversion between reference to primitive  "+b);
//		
		
		
		
		// note: but this get failed when we try to convert primitive to reference.
//		int a=11000;
//		Long b=a;            // this get failed when we try to perform conversion between reference to primitive.
		
		
		
		
		
//		int a=12;         
//		Integer b=a;  // here perform auto boxing
//		
//		Integer c=120;
//		int d=a;        // here perform auto unboxing 
		
		// but auto boxing and unboxing get failed when we try to perform coversion between
		//another type of reference to different type of primitive 
		
		
		
		// then just suggest us one numeric method which is known as valueOf();
		
	    //Syntax:-
		     // reference variable=classname.valueOf(primitive Variable); if we want to perform any primitive data type value to any reference value
		
//	   int a=10;
//	   
//		Float b=Float.valueOf(a);
//		System.out.println(b);
		
//		int n=12345;
//		String name=String.valueOf(n);    this method help us to convert any numeric type value to string type value
//		System.out.println(name);  
		
		// if we want to convert any string type of value to other primitive value then we will use parseXXX();
		
		String a="12345";
		int b=Integer.parseInt(a);
		System.out.println(b);
		}
}

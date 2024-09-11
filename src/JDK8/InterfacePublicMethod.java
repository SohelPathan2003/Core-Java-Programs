package JDK8;

 interface myinterface2{
//	 private void show() {      as we now by default every function of interface is public 
//	                       but we can change it at the time of declaration not override it in 
//                        implementor class.
//		 
//	 }
	 
	 
	 
//	 default void show() {
//		 System.out.println("Hi i am default method of interface");
//		 // if we see here we cannot call it because we cannot create it's object if 
//		 // we want to access it or use it then we have to declare it as static then we can
//		 // call it by using it's interface name.
//	 }
	 
	 
	 
	 
	 
	 
//	   static void show() {
//		 System.out.println("Hi i am static method of interface");    // note we cannot declare
//		 // default and static together because as we now interface methods are by default abstract
//		 // then it will be either static or default. if we want to declare it as default and you
//		 // want to use then we have to implement interface in another class with the help of that class
//		 // we can call it.
//	 }
	 
	 
	 default void show() {
		 System.out.println("Hi i am defaul method of interface ");
		 
	 }
 }
 
 class b implements myinterface2{
	 
 }
public class InterfacePublicMethod {
	public static void main(String args[]) {
		
		b obj=new b();
		obj.show();
	}

}

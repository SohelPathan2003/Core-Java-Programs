package JDK8;

		/*
		 
		 @FunctionalInterface
		   
		note: this will generate compile time error to us because we use annotation here which
		declare interface as functional Interface and we know functional interface can contain only
		one abstract method we cannot add more than one abstract method and if try to add then it will
		generate error.
		
		      But we can add non abstract method within a functional interface like static and 
		      default.
		               
		interface myinterface3{
			void show();
			void display();
			
		}*/



/*
 
  
  @FunctionalInterface
interface myinterface3{
	
	void show();   
	               if we declare any interface as functional interface then it will be mandatory 
                   for that interface have one abstract method and  we can define
                   methods within a interface.
                   
	static void display() {
		System.out.println("i am a display method of myinterface3");
	}
}



*/


@FunctionalInterface
interface myinterface3{
	 void show();    // by default every method known as abstract and public
}



public class functionalInterface1 {

	public static void main(String[] args) {
		
		 
		((myinterface3)()-> System.out.println("i am show method of interface")).show();
		
	}

}

package JDK8;


interface myinterface{
	
	
//	myinterface(){
//		               note: we cannot create constructor within a interface.
//	}
	

	//void show();     by default every method of interface are abstract and as we 
   //know abstract method does not have definition.
  // but in JDK 1.8 version of java we can define the static method within a interface
	 
	static void show() {   // before jdk 1.8 we cannot define any function within interface
		System.out.println("Hi i am static method of interface");
	}
	
	
	
	
	
	
}
public class InterfaceWithMethodDefinition {
public static void main(String args[]) {
	
	myinterface.show();
	
}
}

package WaysToCreateObject;

  class myclass{
	  
	  void show() {
		  System.out.println("i am show method");
	  }
	  
	  public static myclass createInstance() {
		  return (myclass)new myclass();
	  }
  }
public class usingInstance {
	public static void main(String args[]) throws Exception{
		
		
	       myclass obj=myclass.createInstance();
	}

}

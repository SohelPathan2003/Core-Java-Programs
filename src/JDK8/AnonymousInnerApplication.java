package JDK8;


interface myinterface1{
	void show();
}
public class AnonymousInnerApplication {
	public static void main(String args[]) {
		
		
		myinterface1 obj=()-> System.out.println("i am show method of myinterface ");
			
			
			obj.show();
		
	}

}

package JDK8;

interface myinter{
	static void show() {
		System.out.println("i am show method of myintern class");
	}
}

public class StaticMethodWithinInterface {
	
	public static void main(String args[]) {
		myinter.show();
		
	}
//794
}

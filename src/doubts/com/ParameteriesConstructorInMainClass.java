package doubts.com;

public class ParameteriesConstructorInMainClass {

	ParameteriesConstructorInMainClass(int a,int b){
		System.out.println("hello");
		
	}
	
	static {
		
		System.out.println("india");
	}
	
	public static void main(String args[]) {
		ParameteriesConstructorInMainClass obj=new ParameteriesConstructorInMainClass(12,13);
		
		
		
	}
}

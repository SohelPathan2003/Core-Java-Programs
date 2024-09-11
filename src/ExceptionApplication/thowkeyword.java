package ExceptionApplication;

class myexception extends ArithmeticException{
String getException() {
	
	return "invalid age";
}
}

class checkAge{
	
	void check(int age) {
		if(age<18) {
			myexception obj=new myexception();
			throw (obj);
		}else {
			
			System.out.println("you are a valid ");
			
		}
	}
}

public class thowkeyword {
	public static void main(String args[]) {
		
		checkAge a=new checkAge();
		try {
			a.check(19);
			
		}catch(myexception obj) {
			System.out.println(obj.getException());
		}
		
		
		
	}

}

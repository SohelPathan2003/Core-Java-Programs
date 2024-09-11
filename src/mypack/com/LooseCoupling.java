package mypack.com;

abstract class myclass{
      
	 protected int a,b;
	
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	abstract void getAns();
}


class mychild extends myclass{
	void getAns() {
		int c=a+b;
		System.out.println("addition is "+c);
	}
}
class mychild2 extends myclass{
	void getAns() {
		int c=a*b;
		System.out.println("multiplication is "+c);
	}
}

class mychild3 extends myclass{
	void getAns() {
		float c=a/b;
		System.out.println("Division is  "+c);
	}
}

class operation{
	void PerformOperations(myclass ref){
		ref.getAns();
	}
}

public class LooseCoupling {
	public static void main(String args[]) {
		myclass obj=new mychild();
		myclass obj2=new mychild2();
		myclass obj3=new mychild3();
		
		obj2.setValue(12,12);
		operation op=new operation();
		op.PerformOperations(obj2);
		
		
		
	}

}

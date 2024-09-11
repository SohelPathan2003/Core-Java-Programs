package mypack.com;

class A11 extends Thread{
	public  void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i);
			
		}
	}
}
class B11 extends Thread{
	public  void run() {
		for(int i=0;i<100;i++) {
			System.out.println("thread"+i);
		}
		
	}
}
public class threadSysnchronised {
	public static void main(String args[]) {
		 A11 obj=new A11();
		 B11 obj2=new B11();
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj.setPriority(Thread.MIN_PRIORITY);
		 
		 obj.start();
		 obj2.start();
		 
	}
	
	

}

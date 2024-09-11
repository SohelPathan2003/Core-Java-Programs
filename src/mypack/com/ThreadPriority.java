package mypack.com;

class th1 extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("first thread");
			}
		}catch(Exception e) {
			System.out.println("error is "+ e);
		}
	}

}
class th2 extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Second thread");
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
	}
}

public class ThreadPriority {
	public static void main(String args[]) {
		Thread t=new Thread();
		String name=t.getName();
		System.out.println(" by default thread name is or main thread name "+name);   // 
		
		
		
		th2 obj2=new th2();
		th1 obj=new th1();
		System.out.println("default priority of thread is "+obj.NORM_PRIORITY); // NORM_PRIORITY means middle priority or we can say by default priority is 5 of every thread.
		 System.out.println(" the minimum priority of thread is "+obj.MIN_PRIORITY);//MIN_PRIORITY means lowest priority for that thread.means 1.
		 System.out.println("maximum priority of thread "+obj2.MAX_PRIORITY);      // MAX_PRIORITY MEANS 10 PRIORITY FOR THAT THREAD
	}

}

package thread;


 class table {
	 synchronized   void  showTable(int t) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(i*t);
			Thread.sleep(1000);
		}
	}
}


class two extends Thread{
	     table t;
	void set(table t) {
		this.t=t;
	}
	
	
		public void run() {
			try {
				t.showTable(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
}


class three extends Thread{
	table t;
	void set(table t) {
		this.t=t;
	}
	
	public void run() {
		try{
			t.showTable(3);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class TableThreadApplication {
	public static void main(String args[]) throws InterruptedException {
		
		two t1=new two();
		table t=new table();
		t1.set(t);
		
		t1.start();
//		t1.join();
		
		
		three th=new three();
		
		th.set(t);
		
		th.start();
		
		
	}

}

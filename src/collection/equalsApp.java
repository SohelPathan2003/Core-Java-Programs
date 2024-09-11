package collection;

import java.util.LinkedHashSet;

class myapp{
	
	private int a;
	
	
	myapp(int a){
		 this.a=a;
	 }
	
	int getno() {
		return a;
	}
	
	
}
public class equalsApp {

	public static void main(String[] args) {
		
		LinkedHashSet ls=new LinkedHashSet();
		
		
		
		myapp m=new myapp(12);
		myapp m1=new myapp(12);
		
		ls.add(m);
		ls.add(m1);
		
		for(Object o:ls) {
			myapp a=(myapp)o;
			System.out.println("no = "+a.getno());
			
		}
	}
}

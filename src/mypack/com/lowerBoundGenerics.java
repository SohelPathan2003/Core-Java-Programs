package mypack.com;

import java.util.List;

class ajj{
	void Show() {
		System.out.println("i am show method of a class");
	}
}

class b1 extends ajj{
	 
	void display() {
		System.out.println("i am display method of a class");
		
	}
}

class test3{
	
	void add(List <? super b1> list)
	{
		ajj A=(ajj)list.get(0);
	}
}


public class lowerBoundGenerics {

	  public static void main(String args[]) {
		  
	  }
}

package JDK8;
import java.util.*;
import java.util.function.Consumer;



        // if we want to work with any functional interface we have three ways.
          
        // 1)  by using implements keyword.................

/*class myconsumer implements Consumer<Integer>{
	public void accept(Integer obj) {
		System.out.println(obj);
	}
}
public class consumerInterface1 {
	public static void main(String args[]) {
		
		ArrayList <Integer>al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		
		myconsumer consumer =new myconsumer();
		
		al.forEach(consumer);
	    
	}

}
*/

   /*  // 2)   by using inner anonymous inner class..........
public class consumerInterface1 {
 public static void main(String args[]) {
	 
	 ArrayList <Integer>al=new ArrayList<Integer>();
	 
	 al.add(10);
	 al.add(30);
	 al.add(40);
	 al.add(50);
	 al.add(70);
	 
//Consumer cons=new Consumer();   note: we cannot create consumer object because it is interface .
	 Consumer cons=new Consumer(){
		public void accept(Object o) {
			System.out.println(o);
		}
	 }; 
	 al.forEach(cons); 
 }
}
*/





  // 3)   by using lambda expression ..........
public class consumerInterface1 {
public static void main(String args[]) {
	 
	 ArrayList <Integer>al=new ArrayList<Integer>();
	 
	 al.add(10);
	 al.add(30);
	 al.add(40);
	 al.add(50);
	 al.add(70);
	 
	 al.forEach(((Consumer)(Object o)->System.out.println(o)));
}
}













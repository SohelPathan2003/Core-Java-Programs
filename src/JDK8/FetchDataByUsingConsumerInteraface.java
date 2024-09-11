package JDK8;
import java.util.ArrayList;
import java.util.function.*;

//class fetchdata implements Consumer<Integer>{
//	
//	public void accept(Integer object) {
//		System.out.print(object);
//	}
//	
//}        first way to use consumer interface..........

public class FetchDataByUsingConsumerInteraface {
	
	public static void main(String args[]) {
		
//		fetchdata obj=new fetchdata();
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(10);
//		al.add(12);
//		al.add(13);
//		al.add(14);
//		
//		al.forEach(obj);   first way to use consumer interface.
		
		
		
		
		
		
		
		
//		Consumer<Integer> obj=new Consumer<Integer>() {
//			
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};
//		
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(10);
//		al.add(12);
//		al.add(13);
//		al.add(14);
//		al.forEach(obj);       second way to use consumer interface ............
		
		
		
		  
		     //         1
		
//		Consumer<Integer> consumer=new Consumer<Integer>() {
//			public void accept(Integer a) {
//				System.out.println(a);
//			}
//		};
		
		
		
		
		
		//          2 remove the function name and new keyword from syntax.......
		//and write arrow in between brackets and parameters
	
//		Consumer<Integer> consumer=(Integer a)-> {
//				System.out.println(a);
//		};
		
		
		
		
		// 3 remove the opening closing curly brackets  
		
//		Consumer<Integer> consumer=(Integer a)->System.out.println(a);
	
		
		
		//     4 instead of creating object of consumer interface we can direct put the statement in 
		// forEachLop.........
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(13);
		al.add(14);
		al.forEach((Integer a)->System.out.println(a)); 
		
		
		
		
	
		
	}

}

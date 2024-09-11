package JDK8;
import java.util.function.Predicate;
public class predicateExample {

	
	public static void main(String args[]) {
		
		
//		Predicate pred=new Predicate<Integer>(){
//			
//			public boolean test(Integer obj) {
//				return obj%2==0;
//				
//			}
//		};
//		
//		
//		boolean b=pred.test(10);
//		if(b)
//			System.out.println("number is even");
//		else 
//			System.out.println("number is odd ");
		
		
		
		
		
		      // we have to use lambda expression
		
		
System.out.println(((((Predicate<Integer>)(Integer obj)->obj%2==0).test(10)))?"number is even":"number is odd ");
	}
}

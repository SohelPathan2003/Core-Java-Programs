//package JDK8;
//
//import java.util.function.Predicate;
//public class ChainingMultiplePredication {
//	
//	public static void main(String args[]) {
//		
//		
//		Predicate prd=new Predicate<Integer>(){
//			public boolean test(Integer t) {
//				return t<=10;
//			}
//		};
//		
//		
//		Predicate prd1=new Predicate<Integer>() {
//			public boolean test(Integer t) {
//				return t>=0;
//			}
//		};
//		
//		Predicate prd2=new Predicate<Integer>() {
//			public boolean test(Integer t) {
//				
//				return prd1.test(t) &&prd.test(t);
//			}
//		};
//		
//		
//		boolean b=prd2.test(11);
//		if(b)
//			System.out.println("number between 0 to 10");
//		else
//			System.out.println("number not between 0 to 10");
//	}
//
//}











package JDK8;

import java.util.function.Predicate;
public class ChainingMultiplePredication {
	
	public static void main(String args[]) {
		
		
		Predicate prd=((Predicate<Integer>)(Integer t)->t<=10);
		
		Predicate prd1=((Predicate<Integer>)(Integer t)-> t>=0);
		
		
		Predicate prd2=(Predicate <Integer>)(Integer t)-> prd1.test(t)&& prd.test(t);
			
		
		boolean b=prd2.test(11);
		if(b)
			System.out.println("number between 0 to 10");
		else
			System.out.println("number not between 0 to 10");
	}

}

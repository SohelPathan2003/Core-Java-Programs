package JDK8;

import java.util.function.*;




//            1 way to use predicate interface and override its boolean text method().
//class predicateCondition implements Predicate<Integer>{

//	@Override
//	public boolean test(Integer t) {
//		// TODO Auto-generated method stub
//		return t%2==0;
//	}
//}

public class TestCondition {
	
	
	public static void main(String args[]) {
		
//		predicateCondition t=new predicateCondition();
//		boolean b=t.test(12);
//		if(b) {
//			System.out.println("even number");
//		}else {
//			System.out.println("odd number");
//		}
		
		
		
		
		//       2nd step in lambda expression.......
//		Predicate <Integer>p=(Integer t)-> {
//				return t%2==0;
//		};
//		
//		boolean b=p.test(12);
//		if(b)
//			System.out.println("even number");
//		else
//			System.out.println("odd number");
//		
		
		
		//          3rd step in lambda expression...........
		if(((Predicate<Integer>)(Integer t)->t%2==0).test(12))
		System.out.println("even number");
		else
			System.out.println("odd number");
		
	}

}

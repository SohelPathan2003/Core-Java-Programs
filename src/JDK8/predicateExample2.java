package JDK8;

import java.util.function.Predicate;
import java.util.*;

//Example: WAP to compare the value between 1 to 10 if value between 1 to 10 returns
//true otherwise return false.

public class predicateExample2 {
	public static void main(String args[]) {
		
		Predicate<Integer> pred=new Predicate<Integer>(){
			public boolean test(Integer obj) {
				return obj<10;
			}
		};
		
		
		Predicate <Integer> pred2=new Predicate<Integer>() {
			public boolean test(Integer obj) {
				return obj>1;
			}
		};
		
		Predicate<Integer> pred3=pred.and(pred2);
		pred3.test(10);
	}

}

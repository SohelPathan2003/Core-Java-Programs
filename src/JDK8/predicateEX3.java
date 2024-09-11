package JDK8;
import java.util.function.*;

public class predicateEX3 {
	public static void main(String args[]) {			
		
	System.out.println((((Predicate<Integer>)(Integer t)->t%2==0).test(10))? "true":"false");
	}

}

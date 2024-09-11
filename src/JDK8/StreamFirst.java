package JDK8;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;
public class StreamFirst {
	public static void main(String args[]) {
		
		Arrays.asList("sohel","tejas");
		Stream stm1=new ArrayList<String>().stream();
		
		
		Predicate p=new Predicate<String>() {
			public boolean test(String s) {
				return s.endsWith("l");
				
			}
		};
		
		Stream<String> stm2=stm1.filter(p);
		
		
		Consumer cons=new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			}
			
		};
		
		
		stm2.forEach(cons);
	}

}

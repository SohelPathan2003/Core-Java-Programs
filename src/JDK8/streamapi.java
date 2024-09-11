package JDK8;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class streamapi {
	public static void main(String args[]) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(19);
		al.add(20);
		
		Stream st=al.stream();
		
		Predicate pr=new Predicate<Integer>() {
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		Stream st2=st.filter(pr);
		
		Consumer cm=new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		List<Integer> l= (List<Integer>) st2.collect(Collectors.toList());
		
		l.forEach(cm);
		
	}

}

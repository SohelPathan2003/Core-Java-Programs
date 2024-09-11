package JDK8;

import java.util.ArrayList;
import java.util.function.Consumer;


class mycons implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}
public class ConsumerInterface {
	public static void main(String args[]) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(13);
		al.add(323);
		al.add(48);
		
		al.forEach(new mycons());
		
		
		
		
	}

}

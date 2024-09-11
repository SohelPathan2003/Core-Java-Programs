package JDK8;
import java.util.function.Supplier;
public class supplierInterface {
	public static void main(String args[]) {
		
		Supplier sp=new Supplier<Integer>() {

			@Override
			public Integer get() {
				int a=10,b=10;
				return a*b;
			}
			
		};
		

		int ab=(int) sp.get();
		System.out.println(ab);
		
	}

}

package JDK8;

import static java.lang.System.*;
public class UnderscoreInNumericLiterals {
	
	
	public static void main(String ...args) {
		
		int a;
		a=1_2;
		int b=0;
		b=1_2;
		int c=0;
		c=a+b;
		out.println(c);
		
	}

}

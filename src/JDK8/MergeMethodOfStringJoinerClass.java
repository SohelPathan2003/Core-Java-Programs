package JDK8;

import java.util.StringJoiner;

public class MergeMethodOfStringJoinerClass {
	
	public static void main(String... args) {
		
		StringJoiner stringjoiner=new StringJoiner(",");     // , is delimiter 
		
		stringjoiner.add("sohel");
		stringjoiner.add("pathan");
		
		StringJoiner stringjoiner2=new StringJoiner(" ");
		
		stringjoiner2.add("yash");
		stringjoiner2.add("raj");
		
		stringjoiner.merge(stringjoiner2);
		System.out.println(stringjoiner);
		
	}

}

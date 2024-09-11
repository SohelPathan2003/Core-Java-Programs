package JDK8;

import java.util.StringJoiner;

public class StringJoinerClassApplication {
	
	public static void main(String ... args) throws Exception{
		
		
		try {
//		StringJoiner stringjoiner=new StringJoiner(null);    
// 		if we pass null as parameter to StringJoiner class then it will show a error
//		'the delimiter must not be a null'.
			
			
			StringJoiner stringjoiner=new StringJoiner(",");
//      instead of null it will take anythingl like "" and " " and , anything.
			stringjoiner.add("sohel");
			stringjoiner.add("pathan");
			System.out.println(stringjoiner);
		
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}

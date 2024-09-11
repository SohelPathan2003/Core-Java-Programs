package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SearchOccurancesOfAllCharaterInStringByUsingHashMap {
	
	
	public static void main(String ...args) {
		
		String str="ssohell";
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<str.length();i++) {
			Integer val=hm.get(str.charAt(i));
			if(val!=null) {
				hm.put(str.charAt(i),++val);
			}else {
				val=1;
				hm.put(str.charAt(i),val);  //  s   1
			}
		}
		
		Set<Map.Entry<Character,Integer>> obj=hm.entrySet();
		for(Map.Entry<Character,Integer> data:obj) {
			
			System.out.println(data.getKey()+"\t"+data.getValue());
		}
		
	}
}

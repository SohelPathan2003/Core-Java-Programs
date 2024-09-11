package all.string.programs;

import java.util.*;
public class AnotherWayToConvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			ch[i]+=32;
		}
		
		String str2=new String(ch);
		
	
		System.out.println(str2);
		
		
		

	}

}

package all.string.programs;

import java.util.*;
//Q2. WAP to input string and reverse the string without using any inbuilt function
public class ReverseString {
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		
//		char ch[]=str.toCharArray();
//		StringBuilder strb=new StringBuilder();
//		
//		for(int i=ch.length-1;i>=0;i--) {
//			strb.append(ch[i]);
//			
//		}
//		System.out.println(strb);
		
		
		
		// without converting string to chararray
		
		
		StringBuffer strb=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			strb.append(str.charAt(i));
			
		}
		System.out.println(strb);
		
		
		
		
		
	}

}

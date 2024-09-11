package com.String.Practice;
import static java.lang.System.*;
public class CheckStringPalindrome {
	
	public static void main(String ...args) {
		
		String s="ala";
		
		// first we have to reverse the string.....
		char ch[]=s.toCharArray();
		
		for(int i=0,j=s.length()-1;i<ch.length/2;i++,j--) {
			
			char t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
		}
		
		String s1=new String(ch);
		
		
		if(s1.equals(s))
			out.println("palindrome strings");
		else
			out.println("not palindrome strings");
		
		
	}

}

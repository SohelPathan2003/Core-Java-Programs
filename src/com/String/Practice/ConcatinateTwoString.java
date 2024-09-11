package com.String.Practice;

import static java.lang.System.*;
public class ConcatinateTwoString {
	
	public static void main(String ...x) {
		
//		String str="sohel";
//		String str1="pathan";	
//		String s=	str.concat(str1);
//		out.println(s);
	
	
	// know we want to perform manual logic for concatenate two string;
		
	String str="sohel";
	String str1="pathan";
	
	char ch[]=new char[str.length()+str1.length()];
	int m=0;
	for(int i=0;i<ch.length;i++) {
		if(i<str.length()) {
			ch[i]=str.charAt(i);
		}else {
			ch[i]=str1.charAt(m++);
		}
	}
	
	
	String s=new String(ch);
	out.println(s);
	
	}

}

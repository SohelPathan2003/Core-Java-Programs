package com.String.Practice;

public class concatTwoString {
	public static void main(String args[]) {
		
		String s="java is very";
		String str=" good programming language";
		
		char ch[]=new char[s.length()+str.length()];
		int m=0;
		
		for(int i=0;i<ch.length;i++) {
			if(i<s.length())
				ch[i]=s.charAt(i);
			else
				ch[i]=str.charAt(m++);
		}
		
		String s1=new String(ch);
		
		System.out.println(s1);
	}

}

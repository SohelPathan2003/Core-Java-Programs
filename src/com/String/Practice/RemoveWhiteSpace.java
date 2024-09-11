package com.String.Practice;

public class RemoveWhiteSpace {
	public static void main(String args[]) {
		
		String str="java is very good programming language and it platform independent language also";
		
		char ch[]=str.toCharArray();
		
		
		
		
//		int k=0;
//		for(int i=0;i<ch.length;i++) {
//			if(str.charAt(i)!=' ') {
//				ch[k++]=str.charAt(i);
//			}
//		}
		
	
		int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ')
			count++;
	}
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				for(int j=i;j<ch.length-1;j++) {
				ch[j]=ch[j+1];
				}
			}
		}
		char c[]=new char[ch.length-count];
		for(int i=0;i<ch.length-count;i++) {
			c[i]=ch[i];
		}
		String s=new String(c);
		System.out.println(s);
		
	}

}

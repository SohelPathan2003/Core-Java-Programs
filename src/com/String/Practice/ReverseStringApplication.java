package com.String.Practice;

public class ReverseStringApplication {
	public static void main(String args[]) {
		
		
		String str="java is good programming language and priti is very cute girl";
		
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++) {
		System.out.println(word[i]);
		}
		
		for(int i=0;i<word.length;i++) {
			char ch[]=new char[word[i].length()];
			
			for(int j=0;j<ch.length;j++) {
				ch[j]=word[i].charAt(j);
				
			}
			
			for(int k=0,m=ch.length-1;k<ch.length/2;k++,m--) {
				char t=ch[k];
				ch[k]=ch[m];
				ch[m]=t;
			}
			System.out.println(ch);
			
		}
	}

}

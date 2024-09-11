package com.String.Practice;

public class lowerCaseToUpperCase {
	public static void main(String args[]) {
		
		String s="lower case to upper case";
		char ch[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
			if(s.charAt(i)<=122 && s.charAt(i)>=97) {
				
				ch[i]=(char) (s.charAt(i)-32);
				System.out.printf("%c",ch[i]);
			}
			}else {
				System.out.printf(" ");
			}
		}
		
	}

}

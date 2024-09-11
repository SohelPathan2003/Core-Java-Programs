package com.String.Practice;

public class fisrLetterUpper {
	public static void main(String args[]) {
		
		String str="java is very good programming language in all languages";
		String words[]=str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			char ch[]=words[i].toCharArray();
			ch[0]=(char) (ch[0]-32);
			words[i]=new String(ch);
			
			System.out.println(words[i]);
		}
	}

}

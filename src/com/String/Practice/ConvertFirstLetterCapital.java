package com.String.Practice;

public class ConvertFirstLetterCapital {
	public static void main(String args[]) {
		String str="java is very good programming in all language ";
		
//		String words[]=str.split(" ");
//		
//		for(int i=0;i<words.length;i++) {
//			System.out.print(words[i]+" ");
//		}
//		System.out.println();
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
			count++;
		}
		
		int c=0,k=0,m=0;
		String words[]=new String[count];
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
			{
				c++;
			}else {
				char ch[]=new char[c];
				k=0;
				for(int j=i-ch.length;k<ch.length;k++) {
					ch[k]=str.charAt(j++);
				}
				String s=new String(ch);
				System.out.println(s);
				c=0;
				words[m++]=s;
				
			}
			
			
		}
	}

}

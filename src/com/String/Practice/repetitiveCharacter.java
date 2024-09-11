package com.String.Practice;

public class repetitiveCharacter {
	public static void main(String args[]) {
		
//		Example: WAP to count repetitive character from string.
//		abcmnopqrabc
		
		
		String str="abcmnopqrabc";
		
		char ch[]=str.toCharArray();
	
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		int count=1;
		
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1]) {
				count++;
			}
			else {
				if(count>1)
				System.out.printf("%c = %d\n",ch[i],count);
				count=1;
			}
		}
	}

}

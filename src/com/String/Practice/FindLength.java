package com.String.Practice;

public class FindLength {
	public static void main(String args[]){
		
		String str="java is very good programming language";
		
		int count=0;
		try {
		char ch[]=str.toCharArray();
		for(int i=0;ch[i]!='\0';i++) {
			count++;
		}
		}catch(Exception e) {
			System.out.println("length of string is "+count);
		}
	}

}

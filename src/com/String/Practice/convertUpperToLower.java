package com.String.Practice;


import java.util.*;


public class convertUpperToLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string in upper case");
		String str=sc.nextLine();
		
		System.out.println("upper case string  "+str);
		
		char ch;
		StringBuilder strb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch>=65 && ch<=92) {
				ch+=32;
				strb.append(ch);
			}
		}
//		str=strb.toString();
		
		System.out.println("Lower case string "+strb);
		
	   
	}

}

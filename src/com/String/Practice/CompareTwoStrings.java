package com.String.Practice;

import static java.lang.System.*;
public class CompareTwoStrings {

	public static void main(String ...args) {
		
//		String s="sohel";
//		String s1="sohel";
//		if(s.equals(s1))
//			out.println("both are equals");
//		else
//			out.println("both are different");
		
		
		
		// know we want to compare manually 
		String s="sohel";
		String s1="sohel";
		boolean f=false;
		if(s.length()==s1.length()) {
			f=true;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!=s1.charAt(i))
					f=false;
			}
		}
		if(f)
			out.println("both are equals");
		else
			out.println("both are different");
	}
}

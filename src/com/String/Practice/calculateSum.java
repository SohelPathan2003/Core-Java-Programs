package com.String.Practice;

public class calculateSum {
	public static void main(String args[]) {
		String str="abc1234mnopq567";
		
//		Example: WAP input string and separate digit from a string and calculate its sum
//		“abc1234mnopq567”;
//		1+2+3+4+5+6+7
		
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				sum+=str.charAt(i)-48;
			}
		}
		
		System.out.println(sum);
	}

}

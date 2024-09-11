package com.String.Practice;

import java.util.Scanner;

//Q4. WAP to input string and separate digit from string and calculate its sum?
//Example: abc123mno456

public class SeprateDigitFromString {
	public static void main(String args[]) {
		
		String str="abc123mno456";
		int sum=0,result=0;
		for(int i=0;i<str.length();i++) {
			sum=0;
			char ch=str.charAt(i);
			if(ch<=57 && ch>=48) 
			{
				sum=(int)ch-48;
				System.out.println(sum+"  "+ch);
				
				for(int j=i+1;j<str.length();j++) {
					char ch1=str.charAt(j);
					if(ch1<=57 && ch1>=48) {
						sum=sum*10+(int)ch1-48;
						i=j;
					}else {
						
						i=j;
						break;
					}
				}
				System.out.println(sum);
				
			}
			result+=sum;
		}
		
		System.out.println("Result is "+result);
		
	}

}

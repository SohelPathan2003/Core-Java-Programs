package com.String.Practice;

public class sumNumberics {
	public static void main(String args[]) {
		
		
String str="abc1234mnopq567";
		
//		Example: WAP input string and separate digit from a string and calculate its sum
//		“abc1234mnopq567”;
//		1+2+3+4+5+6+7
		

		int sum=0,result=0,ans=0,r=0;
		for(int i=0;i<str.length();i++) {
			sum=0;
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				sum=str.charAt(i)-48;
				
				for(int j=i+1;j<str.length();j++) {
					
					if(str.charAt(j)>=48 && str.charAt(j)<=57) {
						
						
						
						r=str.charAt(j)-48;
						sum=sum*10+r;
					}else {
						i=j;
						break;
					}
					
				}
				
				
				result+=sum;
			}
		}
		
		
	      System.out.println(result);
	}

}

package com.String.Practice;

import java.util.Scanner;

public class ReverseByUsingStringBuffer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a string");
		  String str=sc.nextLine();
		  
		   StringBuilder strb=new StringBuilder();
		   
		   for(int i=str.length()-1;i>=0;i--) {
			   strb.append(str.substring(i,i+1));
			   
		   }
		   
		  System.out.println(strb);
	}

}

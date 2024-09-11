package com.String.Practice;
import static java.lang.System.*;

import java.util.Scanner;
public class ToggleCaseLogic {
	public static void main(String ...args)
	{
		String s="soHeL";
		// toggle case means convert lower case character to upper case and upper case character to lower case
		// means swiping between character.
		
		char ch[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65&&s.charAt(i)<=92)
				ch[i]=(char)(s.charAt(i)+32);
			else
				ch[i]=(char)(s.charAt(i)-32);
				
		}
		
		System.out.println("input character from use");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextLine().charAt(0);
		
		
		String s1=new String(ch);
		
		out.println(s1);
	}

}

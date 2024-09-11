package com.String.Practice;
import static java.lang.System.*;
public class FindLengthOfEach {
	
	public static void main(String ...x) {
		
		String s="sohel12312pathan@__&^%$";
		int c=0,d=0,sp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65&&s.charAt(i)<=92||s.charAt(i)>=97&&s.charAt(i)<=122)
				c++;
			else if(s.charAt(i)>=48&&s.charAt(i)<=57)
				d++;
			else
				sp++;
		}
		
		out.println("length of characters are  \t"+c+"\n"+"length of digits are\t \t"+d+"\n"+"length of special sysmbol\t"+sp);
		
		
		
	}

}

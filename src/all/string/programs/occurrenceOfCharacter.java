package all.string.programs;

import java.util.Scanner;

public class occurrenceOfCharacter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		
		 char ch[]=str.toCharArray();
		 char temp;
		 // here we write a logic for ascending order 
		 
		 for(int i=0;i<ch.length;i++) {
			 for(int j=i+1;j<ch.length;j++) {
				 if(ch[i]<ch[j]) {
					  temp=ch[i];
					 ch[i]=ch[j];
					 ch[j]=temp;
				 }
			 }
		 }
		 
		 // here we check the occurence of character in string.
		 
		 
		   String s=new String(ch);
		   int count=1;
		   for(int i=0;i<s.length()-1;i++) {
			   if(s.charAt(i)==s.charAt(i+1)) {
				   count++;
				   if(i==s.length()-2) {
					   System.out.println(s.charAt(i)+"     "+count); 
				   }
			   }else {
				   System.out.println(s.charAt(i)+"     "+count);
				   count=1;
				   
			   }
			 
		   }
		 
	}
}

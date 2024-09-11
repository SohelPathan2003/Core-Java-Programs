package com.String.Practice;

public class RemoveDuplicateCharacter {
	
	public static void main(String args[]) {
		
		
		String str="good";
		
		char ch[]=new char[str.length()];
		
	  ch=str.toCharArray();
	  
	  for(int i=0;i<ch.length;i++) {  //  aababc //a
		  
		  if(ch[i]=='#')
			  continue;
		  for(int j=i+1;j<ch.length;j++) {    //a
			  if(ch[i]==ch[j]) {   // a==a a==b  a==a
				  ch[j]='#';
			  }
				
			  }
		  }
	  
	  
	  
	  for(int i=0;i<ch.length;i++) {
		  if(ch[i]!='#')
			  System.out.printf("%c",ch[i]);
	  }
	  }

}

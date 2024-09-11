package com.String.Practice;

public class CountLengthOFWord {
	public  static void main(String args[]) {
		
		
//    Example: WAP to count the every word length from a string and avoid duplicate 
//    word. 
		
		String str="java is good programming language and java support opps concept priti love you janeman ";
		int count=1;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
		String word[]=new String[count-1];
		
		int k=0;
		for(int i=0;i<str.length();i++) {
			
			int c=1;//j
			for(int m=i;m<str.length();m++) {    //j
			if(str.charAt(m)!=' ') {
				c++;         //4
			}else {
				char ch[]=new char[c];   //4   
				int n=0;
				for(int j=i;n<c;j++) {
					ch[n++]=str.charAt(j);
				}
			      String s=new String(ch);
			      word[k++]=s;
			      i=m;
				
		        break;
			}
			}
		}
		
		
		
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		
		
		for(int i=0;i<word.length;i++) {
			char ch[]=new char[word[i].length()];
			for(int j=0;j<ch.length;j++) {
				ch[j]=word[i].charAt(j);
			}
			
			for(int h=0,m=ch.length-1;h<ch.length/2;h++,m--) {
				char t=ch[h];
				ch[h]=ch[m];
				ch[m]=t;
				
			}
			System.out.println(ch);
		}
		
		
//		for(int i=0,m=word.length-1;i<word.length/2;i++,m--) {
//			String s=word[i];
//			word[i]=word[m];
//			word[m]=s;
//		}
//		
//		for(int i=0;i<word.length;i++) {
//			System.out.printf("%s ",word[i]);
//		}
		
		
		
	}

	
}

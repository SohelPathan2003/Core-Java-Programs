package com.String.Practice;

import java.util.LinkedHashMap;

public class FindHighestOccurenceInString {
	public static void main(String args[]) {
		
		
	String	str="sohel123pathan234srs";
	
	 // first we have to convert string to  array because we cannot modify strign class because it is immutable class.
	
	char arr[]=str.toCharArray();
	
	
	
	     // first way to solved this problem.............
//	// now we have to sort the string
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]>arr[j]) {
//				char temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	
//      System.out.println("asdf");
//	int count=1;
//	int i=0;
//	for(i=0;i<arr.length-1;i++) {
//		if(Character.isAlphabetic(arr[i])&& Character.isAlphabetic(arr[i+1])) {
//		if((arr[i]>=65 &&arr[i]<=90 || arr[i]>=97 &&arr[i]<=122)&& (arr[i+1]>=65 &&arr[i+1]<=90 || arr[i+1]>=97 && arr[i+1]<=122)) {
//			if(arr[i]==arr[i+1]) {
//				count++;
//			}else {
//				System.out.println(arr[i]+" = "+count);
//				count=1;
//			}
//		}
//	}
//}
//	System.out.println(arr[i]+" = "+count);

	
	
	
	
	
	
	
	// second way to solved this problem.............

	char ch[]=new char[arr.length];
	int count=0,j=0;;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=65&&arr[i]<=90 || arr[i]>=97&&arr[i]<=122) {
			ch[j++]=arr[i];
		}else {
			count++;
		}
	}
	
	
     LinkedHashMap <Character,Integer>lhm=new LinkedHashMap<Character,Integer>();
	 
     for(int i=0;i<ch.length-count;i++) {
    	 
    	  Integer value=lhm.get(lhm);
    	  if(value==null) {
    		  
    	  }
     }
	
	
	}

}

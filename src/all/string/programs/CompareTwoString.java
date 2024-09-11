package all.string.programs;

import java.util.Scanner;

public class CompareTwoString {

	// WAP to input two strings and compare them without using equals() or compareTo() method ?
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter two strings");
		
		
		String str=sc.nextLine();
		String str2=sc.nextLine();
		
		int f=1;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			char ch2=str2.charAt(i);
			
			if(ch!=ch2) {
				f=0;
				break;
				
			}
		}
		
		if(f==1) {
			System.out.println("Both string are same");
			
		}else {
			System.out.println("both are different");
		}
		}while(true);
		
	

	}

}

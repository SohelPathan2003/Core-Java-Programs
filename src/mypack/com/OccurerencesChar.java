package mypack.com;
import java.util.Scanner;

public class OccurerencesChar {
public static void main(String args[]) {
	
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
	
	char ch[]=new char[str.length()+1];
	
	char temp;
	int count=1;
	for(int i=0;i<str.length();i++) {
		ch[i]=str.charAt(i);
	}
		for(int i=0;i<str.length();i++) {
			for(int j=1+i;j<str.length();j++) {
				if(ch[i]>ch[j]){
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			System.out.printf("%c ",ch[i]);
		}
		
		System.out.println();
		for(int i=0;i<str.length();i++) {
			if(ch[i]==ch[i+1]) {
				count++;
			}else {
				System.out.printf(" %c ------> %d\n",ch[i],count);
				count=1;
			}
		}
		
		
	}
}

package FileHandling;

import java.io.*;
import java.util.Scanner;
public class findEvenFromFile {
	public static void main(String args[]) throws IOException{
		
		FileWriter fw=new FileWriter("C:\\Users\\HP\\Downloads\\Collection note\\findeven.txt",true);
		
		FileReader fr=new FileReader("C:\\Users\\HP\\Downloads\\Collection note\\findeven.txt");
		
	    BufferedWriter bw=new BufferedWriter(fw);
	    
	    Scanner sc=new Scanner(System.in);
	    String data;
	    System.out.println("Enter values in file");
//	    for(int i=0;i<=10;i++) {
//	    	data=sc.nextLine();
//	    	bw.write(data);
//	    	bw.newLine();
//	    }
	    
	    BufferedReader br=new BufferedReader(fr);
	   String d;
	    
	    while((d=br.readLine())!=null) {
	    	int l=Integer.parseInt(d);
	    	
	    	if(l%2==0)
	    	System.out.println(l);
	    	
	    }
		br.close();
		bw.close();
	}

}

package FileHandling;

import java.io.*;
import java.util.Scanner;
public class bufferedWriter {

	public static void main(String args[]) throws IOException{
		
		FileWriter fw=new FileWriter("D:\\myfolder\\myfile.txt",true);
		// this class write data in one line we cannot break the line means if we want to 
		// write some line's on next line so that we bufferedReader class and bufferedReader class
		// contain one method newLine();
		
		
		BufferedWriter br=new BufferedWriter(fw);
		
		System.out.println("enter a string ");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		fw.write(data);
		br.newLine();
		br.close();
		fw.close();
         
		System.out.println("data saved successfully...........");
		
		
	}
}

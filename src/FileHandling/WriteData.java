package FileHandling;
import java.io.*;
import java.util.Scanner;

public class WriteData {
	public static void main(String args[]) throws IOException {
		
		FileWriter fw=new FileWriter("D:\\myfolder\\myfile.txt",false);  // append method override
		// new value on previous value append means if we declare second parameter as false.
		
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		fw.write(str);
		fw.close();
		System.out.println("data inserted successfully......");
		
		}

}

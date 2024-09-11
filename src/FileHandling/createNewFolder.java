package FileHandling;


import java.io.*;
public class createNewFolder {

	public static void main(String args[]) throws IOException {
		
		File file=new File("D:\\myfolder");
		
		boolean b=file.mkdir();
		
		if(b)
			System.out.println("folder created successfully.........");
		else
			System.out.println("folder not created some problem is there.......");
		
		
		
		File f=new File("D:\\myfolder\\myfile.txt");
		b=f.createNewFile();
		
		if(b)
			System.out.println("file create successfully........");
		else
			System.out.println("file not created some problem is there........");
	}
}

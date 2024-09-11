package FileHandling;

import java.io.*;
public class createFile {
	public static void main(String args[]) {
		
		File file=new File("E:\\myfolder");
		boolean b=file.mkdir();    // this method help us to create folder at destination
		
		boolean c=file.exists();
		
		if(b)
			System.out.println("folder created successfully....");
		else
			System.out.println("some problem is there.........");
	}

}

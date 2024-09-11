package FileHandling;

import java.io.*;
public class readContentFromFile {
	
	public static void main(String args[])throws IOException {
		
		FileReader fr=new FileReader("D:\\myfolder\\myfile.txt");
		int data=0;
		while((data = fr.read())!=-1)
		{
			//System.out.println((char)data);
			//data=fr.read();
			System.out.printf("%c",data);
		
		}
		fr.close();
		
	}

}

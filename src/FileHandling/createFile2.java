package FileHandling;
import java.io.*;
public class createFile2 {

	public static void main(String args[]) throws IOException {
		
		
		
		File file=new File("E:\\myfolder\\myfile.txt");
		
		
		boolean b=file.createNewFile();   // if we want  to create new file we have createNewFile()
		// method...
		
		if(b)
			System.out.println("file created successfully ...............");
		
		else
			System.out.println("file not created............");
		
	}
}

























//package FileHandling;
//import java.io.*;
//public class createFile2 {
//
//	public static void main(String args[]) throws IOException {
//		File file=new File("C:\\Users\\HP\\Downloads\\Collection note\\myfile.txt");
//	    boolean b=file.createNewFile();
//	    if(b)
//	    	System.out.println("file created successfully......");
//	    else
//	    	System.out.println("File Not create some problem is there.......");
//	}
//}

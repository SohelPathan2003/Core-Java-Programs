package FileHandling;
import java.io.*;
public class getFileAndFolders {

	
	public static void main(String args[])throws IOException {
		
		File file=new File("D:\\myfolder");
		
		boolean b=file.exists();
		
		if(b) {
			System.out.println("folder is already craeted........");
		    
		     File f=new File("D:\\myfolder\\myfile1.txt");
		     b=f.exists();
		     if(b)
		    	 System.out.println("file is already created........");
		     else
		     {
		    	 f.createNewFile();
		    	 System.out.println("file created successfully...........");
		     }
		}else {
			file.mkdir();
		     System.out.println("folder craeted successfully......");
		}
		
	}
}

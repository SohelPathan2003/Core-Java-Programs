package FileHandling;

import java.io.File;

public class getAllFilesAndFolders {
	public static void main(String args[]) {
		
		
		File file=new File("E:\\");
		
		File[] files=file.listFiles();
		
		
		for(int i=0;i<files.length;i++) {
			
			if(files[i].isDirectory())
			System.out.println(files[i]);
		}
	}
			
			
			

}

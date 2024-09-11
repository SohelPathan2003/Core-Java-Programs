package FileHandling;

import java.io.*;
public class GetAllDirectories {
	public static void main(String args[]) {
		
		File[] file=File.listRoots();
		
		for(int i=0;i<file.length;i++) {
			System.out.println(file[i]);
		}
	}

}


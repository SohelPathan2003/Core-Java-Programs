package FileHandling;
import java.io.*;

public class ListRoots {
  
	public static void main(String args[]) {
		
		
		File file[]=File.listRoots();
		
		//  getTotalSpace()   :- this method return total space of your roots
		
		for(int i=0;i<file.length;i++) {
			System.out.println(file[i].getTotalSpace()/1073741824+"GB");
			System.out.println("Free space  "+file[i].getFreeSpace()/1073741824+"GB");
			
			long total=file[i].getTotalSpace()/1073741824;
			long free=file[i].getFreeSpace()/1073741824;
			System.out.println("used space  "+(total-free));
		}
		
	}
}

package FileHandling;
import java.io.*;


public class readLine {

	
	public static void main(String args[]) throws IOException{
		
		FileReader fr=new FileReader("D:\\myfolder\\myfile.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		while(br.read()!=-1) {
		String str=br.readLine();
		System.out.println(str);
		}
		fr.close();
		br.close();
		
	}
}

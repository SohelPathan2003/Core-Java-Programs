package CSVFile;
import java.io.*;
import java.sql.*;
public class myCSV {
	
	public static void main(String ...args) throws IOException,ClassNotFoundException,SQLException{
		File f=new File("src\\CSVFile\\myfile.csv");
		
		FileReader fr=new FileReader(f.getAbsolutePath());
		
		BufferedReader br=new BufferedReader(fr);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mycsv","root","@Root512");
		PreparedStatement pstmt=conn.prepareStatement("insert into mydata values(?,?,?)");
		
		
		String s=null;
		while((s=br.readLine())!=null) {
			String ar[]=s.split(",");
			
			int id=Integer.parseInt(ar[0]);
			pstmt.setInt(1,id);
			
			pstmt.setString(2,ar[1]);
			long contact=Integer.parseInt(ar[2]);
			pstmt.setLong(3,contact);
			pstmt.execute();
		}
		
		
		
	
//	if(!b)
//		System.out.println("inserted");
//	else
//		System.out.println("not inserted");
//		
//		
		
		
		
		
	}

}

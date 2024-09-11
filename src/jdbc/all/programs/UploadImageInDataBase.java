package jdbc.all.programs;
import java.io.File;
import static java.lang.System.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
public class UploadImageInDataBase {

	public static void main(String ...args)throws IOException,SQLException {
		
		com.mysql.cj.jdbc.Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sep2023","root","@Root512");
		
		if(conn!=null) 
			out.println("connected");
		PreparedStatement pstmt=conn.prepareStatement("insert into imgstore values(?,?)");
		
		pstmt.setString(1,"myimage");
		
		File file=new File("C:\\Users\\HP\\Pictures\\sp.jpeg");
		
		FileInputStream ifs=new FileInputStream(file);
		System.out.println(ifs);
		pstmt.setBinaryStream(2,ifs,file.length());
		int ans=pstmt.executeUpdate();
		
		if(ans>0) {
			System.out.println("image inserted successfully");
		}else {
			System.out.println("some problem is there........");
		}
		
		conn.close();
	}

}

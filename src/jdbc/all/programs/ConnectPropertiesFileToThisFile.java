package jdbc.all.programs;
import java.io.*;
import java.util.Properties;
import java.sql.*;
public class ConnectPropertiesFileToThisFile {
	
	public static void main(String args[]) throws IOException , SQLException,ClassNotFoundException {
		
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\JdbcApplication.java\\resource\\db.properties");
	Properties p=new Properties();
	
	p.load(fis);
	
	
	String driver=p.getProperty("driver");
	System.out.println(driver);
	
//	String url=(String) p.get("url");
	String url=p.getProperty("url");
	System.out.println(url);
	
	
	
	
//    String username=(String)p.get("username");
	String username=p.getProperty("username");
	System.out.println(username);
	
	
	
	
	
	
//	String password=(String)p.get("password");
	String password=p.getProperty("password");
	System.out.println(password);
	
	
	
//	com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();	
	//DriverManager.registerDriver(d);
	
	
	Class.forName(driver);
	
	Connection conn=DriverManager.getConnection(url,username,password);
	
	
	if(conn!=null)
		System.out.println("connected successfully");
	else
		System.out.println("not connected");
	
	
	
	}

}

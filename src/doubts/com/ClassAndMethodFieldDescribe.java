package doubts.com;

import java.lang.reflect.Method;

import com.mysql.cj.result.Field;

class student{
	
	private int a;
	String name;
	private int rollno;
	public String getStudentname() {
		return name;
	}
	public int getRollNo() {
		return rollno;
	}
	
	
}
public class ClassAndMethodFieldDescribe {
	
	public static void main(String args[]) {
		
		
	   student s=new student();
	   
	   Class classname=s.getClass();
	   System.out.println(classname);
	   
	   
	   Method m[]=classname.getDeclaredMethods();
	   for(Method method:m) {
		   System.out.println(method.getName());
	   }
	   
	   java.lang.reflect.Field[] f=classname.getDeclaredFields();
	   for(java.lang.reflect.Field field:f) {
		   System.out.println(field.getName());
	   }
		
	}

}

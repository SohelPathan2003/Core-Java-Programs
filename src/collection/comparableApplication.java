package collection;

import java.util.*;

class comapp implements Comparable{   // if not implements Comparable interface in pojo then JVM generate run time exception
	// classCastException. but if we think about Comparable interface we need to override the compareTo(Object) method 
	// and it return the true when current running object is greater than another object and return -1 when it less than another
	// object if both are same then it will return 0.
	
	private int id;
	private String name;
	private int salary;
	
	comapp(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	
	int getSalary() {
		return salary;
	}
	public int compareTo(Object o) {//internally JVM call this method and pass the array list and without current running
		                                // object.
		
		comapp c=(comapp)o;
		 
		if(this.salary<c.getSalary()) {
			return 1;
		}else if(this.salary>c.getSalary()){
			return -1;
		}else {
			return 0;
		}
		
	}
}

 
public class comparableApplication {
	

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		comapp obj=new comapp(1,"sohel",10000);
		comapp obj1=new comapp(2,"sahil",5000000);
		comapp obj2=new comapp(3,"tejas",20000);
		comapp obj3=new comapp(4,"bhusan",80000);
		
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(new comapp(5,"ganesh",500));
		
		System.out.println("Before sorting the ArrayList");
		for(Object o:al) {
			comapp c=(comapp)o;
			System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getSalary());
		}
		
		Collections.sort(al);
		
		System.out.println("After sorting the ArrayList");
		for(Object o:al) {
			comapp c=(comapp)o;
			System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getSalary());
		}
		

	}

}

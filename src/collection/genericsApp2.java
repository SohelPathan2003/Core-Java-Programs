package collection;

import java.util.*;

public class genericsApp2 {

	public static void main(String[] args) {
		ArrayList<pojoApp> al=new ArrayList<pojoApp>();
		
		al.add(new pojoApp(1,"sohel",2541));
		al.add(new pojoApp(2,"sahil",234324));
		al.add(new pojoApp(3,"tejas",234234));
		al.add(new pojoApp(4,"ganesh",234234));
		al.add(new pojoApp(5,"bhusan",54443));
		
		for(Object obj:al) {
			pojoApp pojo=(pojoApp)obj;
			
			System.out.println(pojo.getId()+"\t"+pojo.getName()+"\t"+pojo.getSalary());
		}
		

	}

}

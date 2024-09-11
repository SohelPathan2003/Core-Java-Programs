package collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class depdetails{
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	depdetails(){
		
	}
	
	depdetails(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
}

public class classDepartmentProject {

	public static void main(String[] args) {
		depdetails obj=new depdetails(1,"sohel",1233);
		depdetails obj1=new depdetails(2,"sahil",1200);
		depdetails obj2=new depdetails(3,"tejas",1000);
		
		ArrayList<depdetails> al=new ArrayList<depdetails>();
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		String dep1="DEV";
		String dep2="TESTER";
		LinkedHashMap<String,ArrayList<depdetails>> hs=new LinkedHashMap<String,ArrayList<depdetails>>();
		hs.put(dep1,al);
		hs.put(dep2,al);
		
		Set<Map.Entry<String,ArrayList<depdetails>>> set=hs.entrySet();
		
		for(Map.Entry<String,ArrayList<depdetails>> o:set) {
			System.out.println(o.getKey()+": ");
			System.out.println("---------------------------------------------------------");
			
			ArrayList a=o.getValue();
			for(Object d:a) {
				depdetails dep=(depdetails)d;
				System.out.println(dep.getId()+"\t"+dep.getName()+"\t"+dep.getSal());
				
			}
			
		}

	}

}

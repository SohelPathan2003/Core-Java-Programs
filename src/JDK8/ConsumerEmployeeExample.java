package JDK8;
import java.util.function.Consumer;
import java.util.*;

//class pojo{
//	
//	
//	public pojo(int id, String name, int salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public pojo() {
//		
//	}
//	private int id;
//	private String name;
//	private int salary;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	
//}
//
//     class mycons implements Consumer<pojo>,Comparator<pojo>{
//    	 public void accept(pojo p) {
//    		 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSalary());
//    	 }
//
//		@Override
//		public int compare(pojo o1, pojo o2) {
//			
//			if(o1.getSalary()<o2.getSalary()) {
//				return 1;
//			}else if(o1.getSalary()>o2.getSalary()) {
//				return -1;
//			}else {
//				return 0;
//			}
//			
//		}
//
//		
//		
//    	 
//     }
//public class ConsumerEmployeeExample {
//	public static void main(String args[]) {
//		
//		ArrayList<pojo> al=new ArrayList<pojo>();
//		
//		al.add(new pojo(1,"sohel",1000));
//		al.add(new pojo(2,"sahil",1200));
//		al.add(new pojo(3,"tejas",1300));
//		al.add(new pojo(4,"bhushan",700));
//		al.add(new pojo(5,"joel",7600));
//		al.add(new pojo(6,"rushi",100));
//		
//		mycons cons=new mycons();
//		
//		
//		Collections.sort(al,cons);
//		
//		al.forEach(cons);
//		
//		
//		
//		
//		
//	}
//
//}















class pojo{
	
	
	public pojo(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public pojo() {
		
	}
	private int id;
	private String name;
	private int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class ConsumerEmployeeExample {
	public static void main(String args[]) {
		
		ArrayList<pojo> al=new ArrayList<pojo>();
		
		al.add(new pojo(1,"sohel",1000));
		al.add(new pojo(2,"sahil",1200));
		al.add(new pojo(3,"tejas",1300));
		al.add(new pojo(4,"bhushan",700));
		al.add(new pojo(5,"joel",7600));
		al.add(new pojo(6,"rushi",100));
		
		
			
		
		
		al.forEach((pojo p)->System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSalary()));
		
		
		
		
		
	}

}


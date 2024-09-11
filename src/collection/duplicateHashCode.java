package collection;
import java.util.*;
class p{
	
	private int id;
	private String name;
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
	
	p(int id,String name){
		this.id=id;
		this.name=name;
	}
	p(){
		
	}
	
	public int hashCode() {
		return id*10000;
		
	}
	
	public boolean equals(Object o) {
		p obj=(p)o;
		if(this.id==obj.id && this.name.equals(obj.name)) {
			return true;
		}else {
			return false;
		}
	}
}

public class duplicateHashCode {
	public static void main(String args[]) {
		
		LinkedHashSet<p> lhs=new LinkedHashSet<p>();
		lhs.add(new p(1,"sohel"));
		lhs.add(new p(2,"sahil"));
		lhs.add(new p(1,"sohel"));
		
		for(p obj:lhs) {
			System.out.println(obj.getId()+"\t"+obj.getName());
		}
		
	}

}

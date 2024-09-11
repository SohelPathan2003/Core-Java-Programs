package collection;
import java.util.*;

class data{
	private int id;
	private String name;
	private int run;
	
	data(){
		
	}
	data(int id,String name,int run){
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
}

class playerbyId implements Comparator{
	
	public int compare(Object o1,Object o2) {
		data d1=(data)o1;
		data d2=(data)o2;
		if(d1.getId()>d2.getId()) {
			return 1;
		}else if(d1.getId()<d2.getId()){
			return -1;
		}else {
			return 0;
		}
	}
}

class playerbyRun implements Comparator {
	
	public int compare(Object o1,Object o2) {
		data d1=(data)o1;
		data d2=(data)o2;
		if(d1.getRun()>d2.getRun()) {
			return 1;
		}else if(d1.getRun()<d2.getRun()) {
			return -1;
		}else {
			return 0;
		}
	}
}


public class comparatorApp {
	

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		playerbyRun pbr=new playerbyRun();
		playerbyId pbi=new playerbyId();
		al.add(new data(1,"sohel",10000));
		al.add(new data(5,"tejas",20000));
		al.add(new data(4,"sahil",500000));
		al.add(new data(2,"ganu",20293));
		al.add(new data(6,"rusi",5214));
		
		System.out.println("Before Sorting ArrayList by their Runs");
		for(Object o:al) {
			data d=(data)o;
		System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getRun());
		
		}
		
		Collections.sort(al,pbr);
		
		System.out.println("After Sortig Arraylist by their Runs");
		for(Object o:al) {
			data d=(data)o;
		System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getRun());
		
		}
		
		
		Collections.sort(al,pbi);
		
		System.out.println("After Sortig Arraylist by their id");
		for(Object o:al) {
			data d=(data)o;
		System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getRun());
		
		}
	}

}

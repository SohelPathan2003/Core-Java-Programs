package collection;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class pojo1{
pojo1(){
		
	}
	private int id;
	private String name;
	private int run;
	pojo1(int id,String name,int run){
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
	void show() {
		System.out.println(id+"\t"+name+"\t"+run);
	}
	int getId() {
		return id;
	}
	
	int getRun() {
		return run;
	}
}




class a21 extends pojo1 implements Comparator<pojo1>{
	
	
	public int compare(pojo1 o1,pojo1 o2) {
		if(o1.getId()>o2.getId()) {
			return 1;
		}else if(o1.getId()<o2.getId()) {
			return -1;
		}else {
			return 0;
		}
	}


}


class sortByRun extends pojo1 implements Comparator<pojo1>{
	
	public int compare(pojo1 o1,pojo1 o2) {
		if(o1.getRun()>o2.getRun()) {
			return 1;
		}else if (o1.getRun()<o2.getRun()) {
			return -1;
		}else {
			return 0;
		}
	}
}






public class Comparator_Interface {
	public static void main(String args[]) {
		
		ArrayList<pojo1> al=new ArrayList<pojo1>();
		al.add(new pojo1(5,"sohel",10000));
		al.add(new pojo1(1,"sahil",1300));
		al.add(new pojo1(3,"tejas",1200));
		al.add(new pojo1(2,"yash",1500));
		al.add(new pojo1(4,"shoheb",5000));
//		
//		a21 obj=new a21();
//		Collections.sort(al,obj);
		
		
		sortByRun sbr=new sortByRun();
		Collections.sort(al,sbr);
		
		
		for(pojo1 o:al) {
		 o.show();	
		}
		
		
	}

}

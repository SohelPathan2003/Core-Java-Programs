package org;

import java.util.*;

class yash<E>{
		private int id;
		private String name;
		
		yash(int id,String name){
			this.id=id;
			this.name=name;
		}
		yash(){
			
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
		
		 void add(ArrayList<yash> al) {
			  int sum=0;
			  for(yash o :al) {
				
				 sum+=(o.getId());
				
			  }
			  System.out.println(sum);
		  }
		
	}



public class userDefine {

	public static void main(String[] args) {
	     ArrayList<yash> al=new ArrayList<yash>();
	     al.add(new yash(1,"yash jadhav"));
	     al.add(new yash(2,"sohel"));
	     al.add(new yash(3,"tejas sohel wable"));
	     

	     yash y=new yash();
	     y.add(al);
	         
	}

}

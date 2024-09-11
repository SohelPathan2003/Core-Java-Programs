package org;


class cloneApplication implements Cloneable{
	private int id;
	private String name;
	private int run;
	
	public void setvalues(int id,String name,int run) {
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
	public void show() {
		System.out.println(id+"\t"+name+"\t"+run);
	}
	
	public cloneApplication getclone() throws CloneNotSupportedException {
		return (cloneApplication)this.clone();
	}
}

public class clonable {
	public static void main(String args[])throws CloneNotSupportedException {
		
		cloneApplication obj=new cloneApplication();
		
		obj.setvalues(1,"sohel",1000);
		
	    cloneApplication ca=obj.getclone(); 
	    
	    ca.show();
	}

}

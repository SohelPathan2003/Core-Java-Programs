package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

class employee{
	employee(int id){
		this.id=id;
	}
	
	private int id;
	
	public int hashCode() {
		return id*100;
	}
	public boolean equals(Object obj) {    // drawback of equals method when we pass different 
		//value to equals method then it will not execute it execute only for same values.
		System.out.println("hiiiiiiii");
		employee o=(employee)obj;
		
		if(this.id==o.id) {
			
		   System.out.println(this.id);
			return true;
		}
		else
		{
			return false;
			}
	}
	
	public int getid() {
		return this.id;
	}
}
public class EqualsMethodWorking {
	public static void main(String args[]) {
		
		
	    LinkedHashSet set=new LinkedHashSet();
	    set.add(new employee(5));
	    set.add(new employee(1));     // if we have two object then equals
	    //method and hashCode() method get executed by JVM internally.........
	    for(Object em:set)
	    {
	    	employee e=(employee)em;
	    	System.out.println(e.getid());
	    }
	}

}

package mypack.com;

     interface myInterface<E>{
    	 
    	public void add(E e);
     }
     
     
   class ganu implements myInterface<Integer>{
    	public void add( Integer e) {
    		System.out.println(e);
    		
    	}
    }
   
   class nanu implements myInterface<String>{
	   public void add(String s) {
		   System.out.println(s);
	   }
   }
public class GenericsWithInterface {
	public static void main(String args[]) {
		
		nanu obj=new nanu();
		obj.add("sohel");
		
		ganu g=new ganu();
		g.add(12);
		g.add(124);
		
		System.out.println(obj);
		System.out.println(g);
		
	}

}

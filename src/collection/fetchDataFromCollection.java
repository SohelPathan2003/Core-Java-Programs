package collection;

import java.util.*;

public class fetchDataFromCollection {
	public static void main(String args[]) {
		
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		   methods of collection interface:-
		  void add(Object );     this method is use for add the elements in collection
		  boolean isEmpty();   this method is use for check the collection is empty or not if
		                       collection is empty the return true otherwise return false.
		                       
		  boolean contains();    this method is use for check the element or value is present in 
		                         collection or not if present then return true otherwise return false.
		                         
		  boolean containsAll();     this method is use for check the more than one element present in
		                                collection or not if all elements or values is present in collection 
		                                then return true otherwise return false.
		                                
		  boolean remove(index no);      this method is use for remove or delete the element from collection 
		                                 if successfully get deleted then return true otherwise return false.
		                                 
		   addAll(Colleciton );      this method is help us to all the more than one element at time in collection 
		   
		   int size();              this mehtod is help us to check the size or get the current size
		                             or number of elements present in collection
		                             	
		   int indexOf(Object);         this method is use for multiple reasons first is it return the index of the 
		                               element if element present then return its index number other wise retunr -1
		                               
		                               another use of this mehtod is we can consider if indexOf() method return -1 
		                               then we can say element is not present. otherwise present in collection.
		   
		   	  
		   	  
		  		
		  */
	}

}

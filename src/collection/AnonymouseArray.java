package collection;

public class AnonymouseArray {
	public static void main(String args[]) {
		sum(new int[] {1,2,3,4,5}); // here we pass anonymous array...if we want to pass array as parameter then we pass anonymous 
		//array as a parameter.
		
		}
	public static void sum(int a[]) {
		 for(int i:a) {
			 System.out.println(i);
		 }
	}

}

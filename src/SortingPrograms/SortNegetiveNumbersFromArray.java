package SortingPrograms;

public class SortNegetiveNumbersFromArray {

	public static void main(String[] args) {
		
		int a[]=new int[] {-12,1,-66,22,9,-5,-3,-5};
		int first=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				int temp=a[first];
				a[first++]=a[i];
				a[i]=temp;
			}
			}
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		
		}
}

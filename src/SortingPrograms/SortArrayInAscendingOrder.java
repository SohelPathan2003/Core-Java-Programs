package SortingPrograms;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {
		int a[]=new int[] {12,2,4,53,23,3,24,1 };
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}

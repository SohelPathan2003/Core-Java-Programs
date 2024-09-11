package mypack.com;
import java.util.Scanner;
public class ObjectArray {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any type of values within Object Array\n");
		
			 obj[0]=sc.nextInt();
			 
			 sc.nextLine();
			 obj[1]=sc.nextLine();
			 obj[2]=sc.nextFloat();
			 obj[3]=sc.nextDouble();
			 obj[4]=sc.nextLong();
	for(int i=0;i<5;i++) {
      System.out.println(obj[i]);
	}
	}
}

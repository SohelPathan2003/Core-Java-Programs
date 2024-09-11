package mypack.com;

import java.util.Scanner;
class Delete{
	Integer i=0,l=0,j=0,k=0,m=0;
	public void deleteElement(String s) {
		l=s.length();
		char ch[]=new char[l+1];
		for(i=0;i<l;i++) {
			ch[i]=s.charAt(i);
		}
		for(m=0;m<l;m++) {
		for(i=0;i<l;i++) {
			for(j=i+1;j<l;j++) {
				if(ch[i]==ch[j]) {
					for(k=j;k<l;k++) {
						ch[k]=ch[k+1];
					}
				}
			}
		}
	}
		String s1=new String(ch);
		System.out.println("String is: "+s1);
		
	}
}
public class duplicateRemove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		Delete d=new Delete();
		d.deleteElement(s);
	}

}







































//
//    	public class duplicateRemove {
//
//    		public static void main(String[] args) {
//
//        String name = new String("sohelpathan");
//        int l=name.length();
//        char a[] = new char[l+1];
//        
//        for(int i=0;i<l;i++) {
//            a[i] = name.charAt(i);
//        }
//        
//        for (int m = 0; m < l; m++) {
//            for (int i = 0; i <l; i++){
//                for (int j = i+ 1; j <l; j++) {
//                    if (a[i] == a[j]) {
//                        for (int k = j; k < l; k++) {
//                            a[k] = a[k + 1];
//
//                        }
//                    }
//                    }
//                }
//        }
//        String str2 = new String(a);
//        System.out.println(str2);
//}
//}


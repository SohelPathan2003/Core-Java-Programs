package mypack.com;

public class reverseString {
	public static void main(String args[]) {
		 String name=new String("i am indian");
		 
		 char ch[]=new char[name.length()];
		 
		 for(int i=0;i<name.length();i++) {
			 ch[i]=name.charAt(i);
			 
		 }
		 
		 char temp;
		 for(int i=0,j=name.length()-1;i<name.length()/2;i++,j--) {
			 temp=ch[i];
			 ch[i]=ch[j];
			 ch[j]=temp;
		 } 
		 String str2=new String(ch);
		 System.out.println(str2);
	}

}

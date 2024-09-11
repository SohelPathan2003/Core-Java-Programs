package all.string.programs;

public class RemoveDuplictatecharacterFromString {
	
	
	public static void main(String args[]) {
		
		String str="sohelpssssssathsohelpla";
		
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='1')
				continue;
			for(int j=i+1;j<ch.length;j++) {
				
				
				if(ch[i]==ch[j]) {
					ch[j]='1';
				}
			}
			System.out.println(ch[i]);
		}
		
	}

}

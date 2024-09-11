package all.string.programs;

public class reverseword {

	public static void main(String[] args) {
		String str="sohel pathan from giris tech hub";
		
		char ch[]=str.toCharArray();
		
		int start=0,end=0;
		System.out.println(ch.length);
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ' || i==(ch.length-1)) {
				
				if(i==(ch.length-1))
					end=i;
				else
				end=i-1;
				
				while(start<=end) {
					char c=ch[start];
					ch[start]=ch[end];
					ch[end]=c;
					start++;
					end--;
				}
				start=i+1;
				
			}

	}
		System.out.println(ch);
}

}

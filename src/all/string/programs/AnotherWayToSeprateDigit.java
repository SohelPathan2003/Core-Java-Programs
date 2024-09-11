package all.string.programs;

public class AnotherWayToSeprateDigit {

	public static void main(String[] args) {
		String str="soh1k2kj3n4";
		char ch,ch1;
		int sum,result=0;
		for(int i=0;i<str.length();i++) {
			sum=0;
			ch=str.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				sum=(int)ch-48;
				for(int j=i+1;j<str.length();j++) {
					ch1=str.charAt(j);
					if(Character.isDigit(ch1)) {
						sum=sum*10+(int)ch-48;
						
					}else {
						i=j;
						break;
					}
				}
			}
			result+=sum;
		}
		
		System.out.println(result);
	}

}

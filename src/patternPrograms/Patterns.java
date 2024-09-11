package patternPrograms;

public class Patterns {

	public static void main(String[] args) {
		/* 1  2  3  4  5

	    1  *           *
	    2     *     * 
	    3        *
	    4     *     * 
	    5  *           *
	    
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j || i+j==6) {
					System.out.print("*");	
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		     A  B  C  D  E
             1  2  3  4  5
             F  G  H  I  J
             6  7  8  9  10
             K  L  M  N  O

		
		
		
		boolean flag=true;
		char c='A';
		int d=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2!=0) {
					System.out.printf("%c ",c++);
					
				}else
					System.out.printf("%d ",d++);
			}
			System.out.println();
		}
		
		
		
     A  A  A  A  A
     1  1  1  1  1
     B  B  B  B  B
     2  2  2  2  2
     C  C  C  C  C
		
		
		int d=1;
		char c='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2!=0) {
					System.out.printf("%c ",c);
				}else
					System.out.printf("%d ",d);
			}
			if(i%2!=0)
			c++;
			else
			d++;
			System.out.println();
		}
		
		
		
		A  B  C  D  E
        B  C  D  E  F
        C  D  E  F  G 
        D  E  F  G  H
        E  F  D  H  I

		
		

		char c='A';
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%c ",c++);
			}
			c=++ch;
			System.out.println();
		}
		
		
   A
   B B
   C C  C
   D D  D  D
   E E  E  E  E
		
		
		char c=65;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i)
					System.out.printf("%c ",c);
			}
			c++;
			System.out.println();
		}
		
   A
   A  B
   A  B  C
   A  B  C  D
   A  B  C  D  E
		
		
		
		
		
		
		char c='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i)
					System.out.printf("%c ",c++);
			}              
			c=65;
			System.out.println();
		}
		
		
		A
        1  2
        A  B  C
        1  2  3   4
        A  B  C   D  E
		
		*/
		char c='A';
		int d=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i){
					if( i%2!=0) 
					System.out.printf("%c ",c++);
					else
						System.out.printf("%d ",d++);
				}
				
			}
			System.out.println();
			
			c=65;
			d=1;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

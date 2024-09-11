package mypack.com;

class Abc1010{
	
	
}
public class Basic {

		public static void main(String[] args)
		{
			try {

				Class.forName("mypack.com.Abc101");
				System.out.println("class is found");
				
			}catch(ClassNotFoundException e) {
				System.out.println("Error"+e);
			}
				
		}
}

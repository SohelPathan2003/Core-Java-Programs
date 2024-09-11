package doubts.com;


class asdfas{
	
	static int a;
	
	void setval(int a) {
		this.a=a;
	}
	
	void display() {
		System.out.println(a);
	}
}
public class UseThisKeywordWithStaticVariable {
	
	public static void main(String args[]) {
		
		asdfas obj=new asdfas();
		obj.setval(12);
		obj.display();
		
		obj=null;
		
		obj.display();
		
		
	}

}

package mypack.com;


interface ab{
	void show();
}

interface cb{
	void show();
}
class c{
	void show() {
		System.out.println("i am c class show method");
	}
}

class d extends c implements ab,cb{
	public void show() {
		System.out.println("i am d class show method");
	}
}
public class multipleInheritance {
	public static void main(String args[]) {
		d obj=new d();
		obj.show();
	}

}

package mypack.com;
import java.util.Stack;
public class StackApplication {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push(20);        // with the help of push method we can add the object into the stack so we can say it work as add in stack.
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		
		Object a=s.pop();      // pop method remove the last elements from stack and return that element or object .
		System.out.println(a);
		
		
		a=s.peek();          // this method only fetch last object of stack did not remove it from stack.
		System.out.println(a);            
		
		System.out.println(s);
	}

}

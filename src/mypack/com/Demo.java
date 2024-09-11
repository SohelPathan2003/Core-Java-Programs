
package mypack.com;

class A{
    static A obj=null;
    private A(){

    	
    }

    static A getobj(){
      if(obj==null){
        obj=new A();
      }
      return obj;
    }
    void show(){
      System.out.println("I am a show method of singleton class");
    }

   }

   public class Demo{
    public static void main(String args[]){
       A obj=A.getobj();
       obj.show();
       
       A obj2=A.getobj();
       
       System.out.println(obj.hashCode());
       System.out.println(obj2.hashCode());
    }
   }


















//class A{
//      private static int a,b;
//      private A(){
//
//      }
//      static void setvalue(int c,int d){
//          a=c;
//         b=d;
//      }
//
//      static void getadd(){
//        System.out.println(a+b);
//      }
//
//     }
//
//     public class Demo{
//      public static void main(String args[]){
//       // A obj=new A();     // we cannot create object of utility class.we have to call method by it's class name
//
//
//        A.setvalue(12,12);
//        A.getadd();
//      }
//     }






















//package mypack.com;
//
//public class Abc{
//	
//	 class C{
//		
//			static void show() {
//				System.out.println(" i am show");
//			}
//	}
//}
//
//public class Demo  {
//	
//		public static void main(String[] args) {
//		
//			Abc.C ac = new Abc.C();
//			Abc.C.show();
//			
//			abc>jdk>bin>javac Demo.java
//			abc>jdk>bin>java Demo.class   
//		}
//}

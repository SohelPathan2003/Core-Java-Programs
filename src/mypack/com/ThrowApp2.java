package mypack.com;

import java.util.Scanner;

class MyException extends	ArithmeticException{

         public String getException(){

               return"ArrayIndexOutOfBound";
  }
}


class ab1{

       public void ArrayAddition(int a[]){
                int sum=0;
            for(int i=0;i<=a.length;i++){
			if(i<a.length){
                  sum=sum+a[i];
			
                 }
                 else{
                 
 			MyException obj=new MyException();
                   throw obj;
                }
              
           }
            System.out.println("Sum is "+sum);
      }
}
public class ThrowApp2 {
     public static void main(String args[]){

    	 ab1 obj=new ab1();
             Scanner sc=new Scanner(System.in);
              System.out.println("Enter size of array");
              int size=sc.nextInt();

             int a[]=new int[size];
             System.out.println("Enter elements in array");

                  for(int i=0;i<a.length;i++){

                     a[i]=sc.nextInt();
                  }
           try{

               obj.ArrayAddition(a);
            }
                  catch(MyException e){

                    System.out.println("Error occured "+e.getException());
             }

         finally{
                System.out.println("I always execute");
             }
       }

 }



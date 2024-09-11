package org;

public class test12{

	  public static void main(String args[]){
	      

	     String str="sohel123pathan123sp1";

	      char ch;
	       int sum=0;
	       int res=0;

	      for(int i=0;i<str.length();i++){

	       ch=str.charAt(i);
               sum=0;
	       if(ch<=57 && ch>=48){
	         sum=ch-48;
	         System.out.println(sum);
	       for(int j=i+1;j<str.length();j++){
	             ch=str.charAt(j);
			 if(ch<=57 && ch>=48) { 
	             sum=sum*10+(int)ch-48;
	              
				i=j;
	            }else {
	            	break;
	            }
			 
	      }

	
	}
	     
	       res=sum+res;


	}

	System.out.printf("Addition is %d  ",res);
	                 
	          
	        


	}

	}


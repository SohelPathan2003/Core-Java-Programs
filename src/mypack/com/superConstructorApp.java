//package mypack.com;
//
//
//
//class Ab1{
//    protected String name;
//    protected int id;
//    protected double salary;
//    protected double exp;
//   
//    Ab1(String name,int id,int salary,double exp) {
//        this.name=name;
//        this.id=id;
//        this.salary=salary;
//        this.exp=exp;
//    }
//
//    void display(){
//    	
//        System.out.println("\n\n");
//        System.out.println("Name\tId\tSalary\tExperience");
//        System.out.println(name+"\t"+id+"\t"+salary+"\t"+exp);
//        
//    	
//    }
//}
//class ba1 extends Ab1{
//    protected double increment;
//
//    ba1(String name,int id,int salary,double exp, double increment ){
//        super(name,id,salary,exp);
//        this.increment=increment;
//        this.exp=exp;
//    }
//
//    void increment(){
//        if(exp>10){
//        	super.display();
//        	 increment=(salary*1.5)-salary;
//            salary=(salary*1.5);
//           
//        }
//
//    }
//    void display(){
//        System.out.println("\n\n");
//        System.out.println("Name\tId\tSalary\tExperience\t\tincrement");
//        System.out.println(name+"\t"+id+"\t"+salary+"\t"+exp+"\t\t\t  "+increment);
//    }
//
//
//}
//class ca1 extends ba1{
//    String gender;
//    String WT;
//    ca1(String name,int id,int salary,double exp,double increment,String gender){
//        super(name,id,salary,exp,increment);
//        this.gender=gender;
//    }
//    void WorkingTime(){
//        if(gender=="male"){
//            WT="Night";
//        }else{
//            WT="Day";
//        }
//    }
//
//    void display(){
//        super.display();
//        System.out.println("\n\n");
//        System.out.println("Name\tId\tSalary\tExperience\t\tWorking-shift");
//        System.out.println(name+"\t"+id+"\t"+salary+"\t"+exp+"\t\t\t"+WT);
//    }
//
//
//
//}
//
//public class superConstructorApp {
//    public static void main(String args[]){
//        ca1 obj=new ca1("sohel",1,5000,21.0,0,"male");
//        obj.increment();
//        obj.WorkingTime();
//        obj.display();
//        
//    }
//
//}

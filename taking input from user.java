import java.util.*;
class Demo
  {
  public static void main(String args[])
     {
   Scanner scan=new Scanner (System.in);
   System.out.println("Enter ID:");
   int eid=scan.nextInt();
   System.out.println("Enter name:");
   String nm=scan.next();
   System.out.println("Enter salary:");
   int sal=scan.nextInt();
   Employee emp1=new Employee();
   emp1.setdata(eid,nm,sal);
   emp1.printData();
   scan.close();
     }
}
class Employee
{
  int empID;
  String name;
  int salary;
  
  void setdata(int eid,String name,int salary)
  {
    empID=eid;
    this.name=name;
    this.salary=salary;
    System.out.println(this);
  }
  void printData()
  {
    System.out.println("emp ID="+empID);
    System.out.println("emp name="+name);
    System.out.println("emp salary="+salary);
  } 
}


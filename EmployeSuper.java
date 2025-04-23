import java.util.Scanner;
class Employee
{
  int Empid,Empsalary;
  String Empname,EmpAddress;
  Employee(int eno,int esalary,String ename,String eaddress)
  {
    Empid=eno;
    Empsalary=esalary;
    Empname=ename;
    EmpAddress=eaddress;
  }
}

class Teacher extends Employee
{ 
  String Department, Subject;
  Teacher(int eno,String ename,int esalary,String eaddress,String Dep,String Sub)
  {
   super(eno,esalary, ename,eaddress);
   Department=Dep;
   Subject=Sub;
  } 
  void display()
  {
    System.out.println("Employee ID:"+Empid);
    System.out.println("Employee Name:"+Empname);
    System.out.println("Employee Salary:"+Empsalary);
    System.out.println("Employee Address:"+EmpAddress);
    System.out.println("Department:"+Department);
    System.out.println("Subject Taught:"+Subject);
    }
 }
class EmployeSuper
 {
  public static void main(String args[])
  {
    int i,n,eno,esalary;
    String ename,Sub,eaddress,Dep;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employee:");
    n=sc.nextInt();
    Teacher teacher[] = new Teacher[n];
    for (i=0;i<n;i++)
    {
      System.out.println("Enter Employee ID:");
      eno=sc.nextInt();
      System.out.println("Enter Employee Name:");
      ename=sc.next();
      System.out.println("Enter Employee Salary:");
      esalary=sc.nextInt();
      System.out.println("Enter Employee Address:");
      eaddress=sc.next();
      System.out.println("Enter the Department:");
      Dep=sc.next();
      System.out.println("Enter the Subject Taught:");
      Sub=sc.next();
      teacher[i] = new Teacher(eno,ename,esalary,eaddress,Dep,Sub);
    }
   System.out.println("\n Details of Teachers"); 
   System.out.println("-------------------------------------");
   for(i=0;i<n;i++)
   {
     teacher[i].display();
  }
 }
} 
      
    
 

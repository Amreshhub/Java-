//Example of complit object and parameterized constructor

import java.util.*;
class Employee
{
	private String ecode,ename,post;
	private double basic,da,hra,ma=1500,gross,itax,net;

Employee()
{
	System.out.println("Default constructor called");
		ecode="";
		ename="";
		post="";
	gross=itax=net=0;
}
Employee(String ecode,String ename,String post,double basic)
{
	System.out.println("parameterized constructor called");
		this.ecode=ecode;
		this.ename=ename;
		this.post=post;
		this.basic=basic;
}
void assign(String ecode,String ename,String post,double basic)
{
		this.ecode=ecode;
		this.ename=ename;
		this.post=post;
		this.basic=basic;
}
void cal_salary()
{
	if(basic>=10000)
		da=basic*30/100;
	else
		da=basic*25/100;
	if(basic<5000)
		hra=basic*15/100;
	else
		hra=basic*20/100;
gross=basic+da+hra+ma;

	if(gross>15000)
		itax=gross*12/100;
net=gross-itax;
}
void display()
{
	System.out.println("***************Salary Details****************");
	System.out.println("Employee code:-"                         +ecode);
	System.out.println("Employee name:-"                         +ename);
	System.out.println("Employee Post:-"                         +post);
	System.out.println("Employee Basic pay in Rs:-"              +basic);
	System.out.println("Employee Derranece allowance in Rs:-"    +da);
	System.out.println("Employee House rent allowance in Rs:-"   +hra);
	System.out.println("Employee Madical allowance in Rs:-"      +ma);
	System.out.println("===============================================");
	System.out.println("Gross/Total salary in Rs:-"              +gross);
	System.out.println("IncomeTax deduction in Rs:-"             +itax);
	System.out.println("===============================================");
	System.out.println("Net Salary in RS:-"                      +net);
}
}//close of class
class emp123
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
	System.out.println("***************Enter Employee Information***************");
	System.out.print("Enter Employee Code:-");
	String ecode=x.nextLine();
	System.out.print("Enter Employee Name:-");
	String ename=x.nextLine();
	System.out.print("Enter Employee post:-");
	String post=x.nextLine();
	System.out.print("Enter Employee Basic Pay in Rs:-");
	double basic=x.nextDouble();
	
	Employee e2=new Employee();//default constructor called
	e2.display();

	
	Employee e1=new Employee("E002","Amresh","CEO",10000);//parameterized constructor called
	e1.cal_salary();
	e1.display();

	Employee e3=new Employee(ecode,ename,post,5000);//assign()called
	e3.cal_salary();
	e3.display();
	}
}//close of main class


	
	
	
	
	
	
	
	
	

	
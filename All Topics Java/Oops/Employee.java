//Example of class object
import java.util.*;
class emp
{
	private  String ecode,ename,post;
			 double basic,da,hra,me=1500,gross,itax,net;
	
	void input()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Insert Employee Information");
		System.out.print("Enter Employee code:-");
		ecode=x.nextLine();
		System.out.print("Enter Employee Name:-");
		ename=x.nextLine();
		System.out.print("Enter Employee Post:-");
		post=x.nextLine();
		System.out.print("Enter Employee Basic Pay In Rs:-");
		basic=x.nextDouble();
	}
	void cal_salary()
	{
		da=basic*25/100;
		hra=basic*15/100;
		gross=basic+da+hra+me;
		
		if(gross>15000)
			itax=gross*12/100;
		net=gross-itax;
	}
	
	void display()
	{
		System.out.println("**********Displaying Employee Salery***************");
		System.out.println("Employee code                 ::"+ecode);
		System.out.println("Employee Name                 ::"+ename);
		System.out.println("Employee Post                 ::"+post);
		System.out.println("Employee Basic pay in Rs      ::"+basic);
		System.out.println("Derness Alloowanse in Rs      ::"+da);
		System.out.println("House rent Allowanse in Rs    ::"+hra);
		System.out.println("Medacial Allowance Fixwd in Rs::"+me);
		System.out.println("===================================================");
		System.out.println("Gross /Total Salery in Rs     ::"+gross);
		System.out.println("Income Tax Deduction in Rs    ::"+itax);
		System.out.println("===================================================");
		System.out.println("Net Salery Amount in Rs       ::"+net);
	}
}//close of class
class Employee
{
	public static void main(String args[])
	{
		emp e=new emp();
		e.input();
		e.cal_salary();
		e.display();
		
	}//close of main	
}//close of main class


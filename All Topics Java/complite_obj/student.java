//Example of compelit object and parameterized constructor

import java.util.*;
class Result
{
	private String enroll,sname,Remarks="FAIL",result;
	private double c,cpp,java,total,agg;

Result()
{
	System.out.println("Default constructor called");
		enroll="";
		sname="";
		c=0;
		cpp=0;
		java=0;
	total=agg=0;
	Remarks=result="";
}
Result(String enroll,String sname,double c,double cpp,double java)
{
	System.out.println("parameterized constructor called");
		this.enroll=enroll;
		this.sname=sname;
		this.c=c;
		this.cpp=cpp;
		this.java=java;
}
void assign(String enroll,String sname,double c,double cpp,double java)
{
		this.enroll=enroll;
		this.sname=sname;
		this.c=c;
		this.cpp=cpp;
		this.java=java;
}
void cal_result()
{
	if(c>=24&&cpp>=24&&java>=24)
		result="PASS";
	else
		result="FAIL";
		

total=c+cpp+java;
if(result=="PASS")
agg=total*100/180;

if(agg>=90)
Remarks="EXCELLENT";

if(agg>=70&&agg<90)
Remarks="VERYGOOD";

if(agg>=60&&agg<70)
Remarks="GOOD";

if(agg>=40&&agg<60)
Remarks="PASS";

}
void display()
{
	System.out.println("***************STUDENT RESULT****************");
	System.out.println("Student Enrollment no:-         "+enroll);
	System.out.println("Student name:-		    "+sname);
	System.out.println("Markes Obtant in C Language:-   "+c);
	System.out.println("Markes Obtant in Cpp Language:- "+cpp);
	System.out.println("Markes Obtant in java Language:-"+java);
	System.out.println("===============================================");
	System.out.println("Total markes obtant:-           "+total);
	System.out.println("===============================================");
	System.out.println("AGGregrate of student:-         "+agg+"%");
	System.out.println("Result of Student:-             "+result);
	System.out.println("Remarks of Student:-            "+Remarks);
	System.out.println("===============================================");
}
}//close of class
class student
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
	System.out.println("***************Enter Student Information***************");
	System.out.print("Enter Student Enrollment no:-");
	String enroll=x.nextLine();
	System.out.print("Enter Student Name:-");
	String sname=x.nextLine();
	System.out.print("Enter Markse obtant in C Language:-");
	double c=x.nextDouble();
	System.out.print("Enter Markse obtant in Cpp Language:-");
	double cpp=x.nextDouble();
	System.out.print("Enter Markse obtant in java Language:-");
	double java=x.nextDouble();

	
	Result r1=new Result();//default constructor called
	r1.display();

	
	Result r2=new Result("S001","Amresh",40,59,54);//parameterized constructor called
	r2.cal_result();
	r2.display();

	Result r3=new Result(enroll,sname,c,cpp,java);//assign()called
	r3.cal_result();
	r3.display();
	}
}//close of main class


	
	
	
	
	
	
	
	
	

	
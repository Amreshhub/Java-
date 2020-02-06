import java.util.*;
class result
{
	private  String enroll,sname,remarks;
			 double c,cpp,java,total,agr;
	
	void input()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Insert Student Information");
		System.out.print("Enter Student Enrollment no:-");
		enroll=x.nextLine();
		System.out.print("Enter Student Name:-");
		sname=x.nextLine();
		System.out.print("Enter Markes obtant in C:-");
		c=x.nextDouble();
		System.out.print("Enter Markes obtant in CPP:-");
		cpp=x.nextDouble();
		System.out.print("Enter Markes obtant in Java:-");
		java=x.nextDouble();
	}
	void cal_Result()
	{
		total=c+cpp+java;
		agr=total*100/180;
		
		if(c>=24&&cpp>=24&&java>=24)
			remarks= "PASS";
		else
			remarks= "FAIL";
			
	}
	
	void display()
	{
		System.out.println("**********Displaying Student Result***************");
		System.out.println("Student Enroll.NO            ::"+enroll);
		System.out.println("Student Name                 ::"+sname);
		System.out.println("Markas Obtant in C           ::"+c);
		System.out.println("Markas Obtant in CPP         ::"+cpp);
		System.out.println("Markas Obtant in JAVA        ::"+java);
		System.out.println("===================================================");
		System.out.println("Total marks obtant           ::"+total);
		System.out.println("Agreate of all student       ::"+agr+"%");
		System.out.println("===================================================");
		System.out.println("Student Remarks       		 ::"+remarks);
	}
}//close of class
class student
{
	public static void main(String args[])
	{
		result r=new result();
		r.input();
		r.cal_Result();
		r.display();
		
	}//close of main	
}//close of main class


//program based on salary calucation of one employee
import java.io.*;
class salary
{
	public static void main (String args[])throws IOException
	{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee code:-");
		String ecode=(f.readLine());
		System.out.print("Enter Employee Name:-");
		String ename=(f.readLine());
		System.out.print("Enter Employee post:-");
		String epost=(f.readLine());
		System.out.print("Enter Basic pay in Rs:-");
		double basic=Double.parseDouble(f.readLine());
		
		double da=basic*30/100;
		double hra=basic*25/100;
		double ma=1500;
		double gross=da+hra+ma+basic;
		double itax=gross*12/100;
		double net=gross-itax;
		
		
		System.out.println("===============Salery Detils=============");
		System.out.println("Employee code               :-"+ecode);
		System.out.println("Employee name             	:-"+ename);
		System.out.println("Employee post               :-"+epost);
		System.out.println("Basic pay in RS             :-"+basic);
		System.out.println("Dearness allowance in Rs    :-"+da);
		System.out.println("House rean allowance in Rs  :-"+hra);
		System.out.println("Medical allowance in Rs     :-"+ma);
		System.out.println("-----------------------------------------");
		System.out.println("Gross/total salary in Rs    :-"+gross);
		System.out.println("Incom tex deduction in Rs   :-"+itax);
		System.out.println("------------------------------------------");
		System.out.println("Net Salery Amount in Rs     :-"+net);
	}//close of main
}//close of class
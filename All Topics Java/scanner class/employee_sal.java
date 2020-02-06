//claculate employee slery
import java.util.*;
class employee_sal
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter Employee Code:-");
		String ecode=x.nextLine();
		
		System.out.print("Enter Employee Name:-");
		String ename=x.nextLine();
		
		System.out.print("Enter of Employee Post:-");
		String epost=x.nextLine();
		
		System.out.print("Enter Basic of Employee:-");
		double basic=x.nextDouble();
		
		
		double da=basic*30/100;
		double hra=basic*25/100;
		double ma=1500;
		double gross=basic+da+hra+ma;
		double itax=gross*12/100;
		double paybel=gross-itax;
		double bonus=0.0;
		if(epost.equalsIgnoreCase("programer"))
			 bonus=paybel*10/100;
			double net=paybel+bonus;
			
			
			System.out.println("=============SAlery====================");
			System.out.println("Employee code          ::"+ecode);
			System.out.println("Employee name	       ::"+ename);
			System.out.println("Post				   ::"+epost);
			System.out.println("Basic pay of Employee  ::"+basic);
			System.out.println("D.A  in Rs             ::"+da);
			System.out.println("H.R.A in Rs            ::"+hra);
			System.out.println("Madical Allowance in Rs::"+ma);
			System.out.println("---------------------------------------");
			System.out.println("Gross/Total salery in Rs::"+gross);
			System.out.println("IncomeTax in Rs         ::"+itax);
			System.out.println("---------------------------------------");
			System.out.println("Payble Amount in Rs     ::"+paybel);
			System.out.println("Bonus Amount in Rs      ::"+bonus);
			System.out.println("---------------------------------------");
			System.out.println("Net Salery Amount in RS ::"+net);
		
	}//close of main
}//close of class
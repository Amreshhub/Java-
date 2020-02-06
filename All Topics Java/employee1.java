import java.io.*;
class employee1 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee code:-");
		String ecode=(d.readLine());
		System.out.print("Enter Basic pay in Rs:-");
		double basic=Double.parseDouble(d.readLine());
		
		double hra=basic*30/100;
		double ca=250*4;
		double ma=basic*20/100;
		double gross=basic+ca+ma+hra;
		double lv=gross/31*5;
		double itax=gross*12/100;
		double net=gross-lv-itax;
		
		
		System.out.println("=================Salery=======================");
		System.out.println("Employee code:-                  "+ecode);
		System.out.println("Employee Basic pay in Rs:-		 "+basic);
		System.out.println("Convenioan allowance in RS:-     "+ca);
		System.out.println("House rent allowance in Rs:-     "+hra);
		System.out.println("Madical allowance in Rs:-		 "+ma);
		System.out.println("----------------------------------------------");
		System.out.println("Gross/total salery in Rs:-       "+gross);
		System.out.println("Leav deduction in Rs:-	  		 "+lv);
		System.out.println("-----------------------------------------------");
		System.out.println("Net Saleryy in Rs:-				 "+net);
		
	}//close of main
	
}//close of class



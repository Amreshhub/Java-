import java.io.*;
class product
{
	public static void main(String args[])throws IOException
	{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter product code:-");
		String pcode=(s.readLine());
		System.out.print("Enter Company name:-");
		String cname=(s.readLine());
		System.out.print("Enter M.R.P of given product:-");
		double mrp=Double.parseDouble(s.readLine());
		System.out.print("Enter Quantety Tokan:-");
		double qty=Double.parseDouble(s.readLine());
		
		
		
		double total=mrp*qty;
		double dis=total*30/100;
		double paybal=total-dis;
		double vat=paybal*12/100;
		double net =paybal+vat;
		
		System.out.println("===========Bill========================");
		System.out.println("Produce code       :-"+pcode);
		System.out.println("Company name       :-"+cname);
		System.out.println("M.R.P in Rs        :-"+mrp);
		System.out.println("Quantety Tokan     :-"+qty);
		System.out.println("---------------------------------------");
		System.out.println("Total amount in Rs :-"+total);
		System.out.println("12% vat deduction  :-"+vat);
		System.out.println("---------------------------------------");
		System.out.println("Net salery Amount is:-"+net);
		
		
	}//close of main
}//close of class
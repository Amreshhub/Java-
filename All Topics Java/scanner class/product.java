//calculet product detils
import java.util.*;
class product
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter Producet code::");
		
		String pcode=x.nextLine();
		
		System.out.print("Enter  product Type:-");
		String ptype=x.nextLine();
		
		System.out.print("Enter mrp of given product::");
		double mrp=x.nextDouble();
		
		System.out.print("Enter quantety tokan:-");
		double qty=x.nextDouble();
		
		double total=mrp*qty;
		double dis=0.0;
		if(ptype.equalsIgnoreCase("Garment"))
			dis=total*30/100;
			
		double payble=total-dis;
		double vat=payble*12/100;
		
		double net=payble+vat;
		
		System.out.println("==========EMPLOYEE DETAILS=============");
		System.out.println("Producet code::        "+pcode);
		System.out.println("Producet Type::		   "+ptype);
		System.out.println("M.R.P in Rs	 ::		   "+mrp);
		System.out.println("Quantety Tokan::       "+qty);
		System.out.println("----------------------------------------");
		System.out.println("Total amount in Rs::   "+total);
		System.out.println("Discount Amount in Rs::"+dis);
		System.out.println("----------------------------------------");
		System.out.println("Payble Amount in Rs::  "+payble);
		System.out.println("12% Vat in Rs::		   "+vat);
		System.out.println("----------------------------------------");
		System.out.println("NET bill Amount in Rs::"+net);
		
		
			
	}//close of main
		}//close of class
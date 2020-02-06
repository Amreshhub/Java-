//accept producet details calculate and print bill
import java.util.*;
class bulk_discount_on_qty
{
	public static void main(String args[])
	{
		boolean b=true;
		double mrp=0.0,qty=0.0,total=0.0,bdis=0.0,pay=0.0,vat=0.0,net=0.0,rate=0.0;
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Producet code:-");
		double pcode=x.nextDouble();
		
		if(pcode>0)
		{
			System.out.print("Enter M.R.P of given Producet:-");
			mrp=x.nextDouble();
			
				if(mrp>0)
				{
					System.out.print("Enter Quataty of given Producet:-");
					qty=x.nextDouble();
					
						if(qty>0)
						{
							if(qty<=10)
								if(qty<=50)
									rate=20.0;
								else
									if(qty<=100)
										rate=25.0;
									else
										rate=30.0;
						}else{
							b=false;
							System.out.println("Invalied Quantety found !plz Enter agan" );
						 }
										
			
					
				}else{
					b=false;
					System.out.println("Invalied MRP found !plz Enter agan" );
						 }
		}else{
			b=false;
			System.out.println("Invalied Producet code found !plz Enter agan" );
			
					 }
		if(b)
		{
			total=mrp*qty;
			bdis=total*rate/100;
			pay=total-bdis;
			vat=pay*12/100;
			net=pay+vat;
			
		System.out.println("==========Bill DETAILS=============");
		System.out.println("Producet code::        		"+pcode);
		System.out.println("M.R.P in Rs	 ::		   		"+mrp);
		System.out.println("Quantety Tokan::       		"+qty);
		System.out.println("----------------------------------------");
		System.out.println("Total amount in Rs::   		"+total);
		System.out.println("BULK Discount Amount in Rs::"+bdis);
		System.out.println("----------------------------------------");
		System.out.println("Payble Amount in Rs:: 		"+pay);
		System.out.println("12% Vat in Rs::		  		"+vat);
		System.out.println("----------------------------------------");
		System.out.println("NET bill Amount in Rs::		"+net);
	
			
		}
	}//close of main
}//close of class
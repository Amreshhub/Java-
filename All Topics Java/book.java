import java.io.*;
class book
{
	public static void main (String args[])throws IOException
	{
		BufferedReader v=new BufferedReader(new InputStreamReader(System.in));
		String pname=new String();
		System.out.print("Enter publisher name(BPB)/(THM)0/(VEENUS):-");
		 pname=(v.readLine());
		System.out.print("Enter MRP of given book:-");
		double mrp=Double.parseDouble(v.readLine());
		
		double rate=0.0;
		boolean n;
		if( pname.equals(BPB))//||pname==bpb)
		//{
		
			//if(n==true)		
			{
			
			rate=30.0;
		//}
		}
			if( pname.equals(TMH))//||pname==tmh)
		//	{
			
			//if(n==true)
			{
		
			rate=15.0;
		
		//}
			}
			if( pname.equals(VENNUS))//||pname==vennus)
		//{
			//if(n==true)
			{
			rate=20.0;
		//}
		}
		
		double dis=mrp*rate/100;
		double paybal=mrp-dis;
		double vat=paybal*12.15/100;
		double net=paybal+vat;
		
		System.out.println("===========BOOK BILL====================");
		System.out.println("Publishar name(BPB?/TMH?/VENNUS?:-"+pname);
		System.out.println("MRP in Rs						:-"+mrp);
		System.out.println("Discount rate					:-"+rate);
		System.out.println("Discount Amount in Rs           :-"+dis);
		System.out.println("------------------------------------------");
		System.out.println("Paybal Amount in Rs   			:-"+paybal);
		System.out.println("12.15% vat in Rs				:-"+vat);
		System.out.println("-------------------------------------------");
		System.out.println("Net Bill Amount in Rs			:-"+net);
		
		
	}//close of main
}//close of class
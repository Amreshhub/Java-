//accept book publisher all details calculate and ditels
import java.util.*;
class book_publishar
{
	public static void main(String args[])
	{
		double rate=0.0;
		double 	dis=0.0,pay=0.0,vat=0.0,net=0.0;
		boolean flag=true;
		String pname="";
		Scanner x=new Scanner(System.in);
			
			System.out.print("Enter mrp of given book:-");
			double mrp=x.nextDouble();
			
			if(mrp>0){
				System.out.print("Enter Publisher name as BPB.TMH.VEENUS:-");
				 pname=x.nextLine();
				 pname=x.nextLine();

				  if(pname.equalsIgnoreCase("BPB"))
				  
				  	 rate=30.0;
				  	
				  else
				  
				  	if(pname.equalsIgnoreCase("TMH"))				  	
				  		rate=20.0;
				  	
				  
				  	else
				  	 if(pname.equalsIgnoreCase("VEENUS"))
				  	 	
				  	 
				  	 	rate=25.0;
				  	 	
				      else
				  	   {
				  	 	 flag=false;
				  	 	   System.out.println("Invalied publisher name found Plz enter agan:");
				  	 	
				  	         
				  	         }
			}			
	else{
		flag=false;
		System.out.print("Invaled Mrp found Plz enter agan");
	}
			
			if(flag)
			{
			     	
				dis=mrp*rate/100;
				pay=mrp-dis;
				vat=pay*12/100;
				net=pay+vat;
				
			
			System.out.println("***************Bill*********************");
			System.out.println("Publisher name as TMH,BPB,VEENUS:- "+pname);
			System.out.println("Publisher M.R.P IN RS:-            "+mrp);
			System.out.println("Dicount slab in persentege:-       "+rate+"%");
			System.out.println("Dicount amount in Rs:-             "+dis);
			System.out.println("==========================================");
			System.out.println("Payble Amount in Rs:-			   "+pay);
			System.out.println("12% Vat in Rs:-					   "+vat);
			System.out.println("==========================================");
			System.out.println("Net Bill amount in Rs:-			  "+net);
			System.out.println("*******************************************");
			}
			
	}//close of main
}//close of class
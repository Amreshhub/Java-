//accept footware detials calculate bill and display
import java.util.*;
class footwaer
{
	public static void main(String args[])
	{
		boolean a=true;
		String cname="";
		double rate=0.0,pay=0.0,dis=0.0,vat=0.0,net=0.0;
		
		Scanner b=new Scanner(System.in);
		
		System.out.print("Enter M.R.P in gevin footware:-");
		double mrp=b.nextDouble();
		
		if(mrp>0)
		{
			System.out.print("Enter Company name:-");
			cname=b.nextLine();
			cname=b.nextLine();//fluse memory
			
			if(cname.equalsIgnoreCase("Action"))
				rate=20.0;
			else
				if(cname.equalsIgnoreCase("Libearty"))
					rate=30.0;
				else
					if(cname.equalsIgnoreCase("woodland"))
						rate=50.0;
					else{
						a=false;
						System.out.println("Invalied company name found Plz!enter agan");
						}
						
						
						
		}else{
			a=false;
			System.out.println("Invalied mrp found Plz!enter agan");	
		}
		
		if(a){
			
			dis=mrp*rate/100;
			pay=mrp-dis;
			vat=pay*12/100;
			net=pay+vat;
			System.out.println("***************Bill******************************");
			System.out.println("Company name as Action/Liberty/Woodland:- "+cname);
			System.out.println(" M.R.P IN RS:-            		   "+mrp);
			System.out.println("Dicount slab in persentege:-       "+rate+"%");
			System.out.println("Dicount amount in Rs:-             "+dis);
			System.out.println("==========================================");
			System.out.println("Payble Amount in Rs:-			   "+pay);
			System.out.println("12% Vat in Rs:-					   "+vat);
			System.out.println("==========================================");
			System.out.println("Net Bill amount in Rs:-			  "+net);
			System.out.println("**************************************************");
		
		}
	}//close of main
}//close of class
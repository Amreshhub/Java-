//accept Electricity details and calculate and display
import java.util.*;
class Electricity_bill
{
	public static void main(String args[])
	{
		boolean a=true;
		int unit=0,rental=300;
		double rate=0.0,charge=0.0;
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter Meter no of Consumer:-");
		int m_no=x.nextInt();
		
		if(m_no>0){
			System.out.print("Enter Unit Consume:-");
			unit=x.nextInt();
				if(unit>=0)
				{
					if(unit<=100)
						rate=6.0;
					else
						if(unit<=200)
							rate=5.50;
						else
							rate=5.00;
				}else{
					a=false;
					System.out.println("Invalied unit found Plz Enter agan!");
				}
		}else{
				a=false;
					System.out.println("Invalied Meter no found Plz Enter agan!");
				}
			if(a)
			{
				charge=unit*rate+rental;
				
				System.out.println("*********Electricity Bill********************");
					System.out.println("Meter No                ::"+m_no);
					System.out.println("Unit consume            ::"+unit);
					System.out.println("Rate per Unit           ::"+rate);
					System.out.println("Rentel per Month        ::"+rental);
					System.out.println("====================================");
					System.out.println("Chrage to be paid in Rs ::"+charge);
				System.out.println("*********************************************");
					
			}
		
				
		
	}//close of main
}//close of class
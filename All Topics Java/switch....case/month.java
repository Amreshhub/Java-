//accept month no and check display corrospoinding month name
import java.util.*;
class month
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter Month no:-");
		int m_no=x.nextInt();
		
		switch(m_no)
		{
			case 1: System.out.println("Janurary");
						break;
			case 2: System.out.println("February");
						break;
			case 3: System.out.println("March");
						break;
			case 4: System.out.println("April");
						break;
			case 5: System.out.println("may");
						break;
			case 6: System.out.println("Jun");
						break;
			case 7: System.out.println("July");
						break;
			case 8: System.out.println("Auguast");
						break;
			case 9: System.out.println("Septmber");
						break;
			case 10: System.out.println("October");
						break;
			case 11: System.out.println("Nomvember");
						break;
			case 12: System.out.println("December");
						break;
			default: System.out.println("Invalied month no found");
						
		}//close of switch
	}//close of main
		
}//close of class

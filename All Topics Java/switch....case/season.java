//accept month no check and display corrspoinding season
import java.util.*;
class season
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter Month No:-");
		int m_no=x.nextInt();
		
		switch(m_no)
		{
			
			case 11:
			case 12:
			case 1:
			case 2: System.out.println("Winter Seassion");
					break;
			case 3:
			case 4:
			case 5:
			case 6: System.out.println("Summer Seassion");
					break;
			case 7:
			case 8:
			case 9:
			case 10:System.out.println("Rainy seassion");
					break;
			default:System.out.println("Invalied month no Found");
			
		}//close of switch
	}//close of main
}//close of class
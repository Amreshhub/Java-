//program to using break stetaments
import java.util.*;
class using_brrek
{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	
	System.out.print("Enter month no in 1-12:-");
	int mno=x.nextInt();
	
	switch(mno)
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
		case 6: System.out.println("June");
			break;
		case 7: System.out.println("July");
			break;
		case 8: System.out.println("August");
			break;
		case 9: System.out.println("Septmber");
			break;
		case 10: System.out.println("October");
			break;
		case 11: System.out.println("Nomvember");
			break;
		case 12: System.out.println("December");
			break;
		default:System.out.println("Invalied month number found Plz enter agan");
	}//close of switch
	}//close of main
}//close of class


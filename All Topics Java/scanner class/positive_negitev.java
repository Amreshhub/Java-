//accept a number chack and displaygiven no is positiveor negitive
import java.util.*;
class positive_negitev
{
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		
		System.out.print("Enter any one number:-");
		
		int num=c.nextInt();
		
		if(num<0)
			System.out.println(num+"is negitev number");
		else
			System.out.println(num+"is positive number");
	}//close of main
}//close of class

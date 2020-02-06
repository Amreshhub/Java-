//accept a num check and disply no is positive even or not
import java.util.*;
class positive
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter A number;-");
		
		int num=x.nextInt();
		
		if(num>0)
			if(num%2==0)
				System.out.println(num+"is positive even no");
			else
				System.out.println(num+"is positive odd no");
		else
			System.out.println(num+"is negitive no");


				
	}//close of main
}//close of class
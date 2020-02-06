//accept a num check positive even/odd or negitive even/odd no
import java.util.*;
class positive_negitive_even_odd
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter any one no:-");
		
		int num=x.nextInt();
		
		if(num<0)
			if(num%2!=0)
				System.out.println(num+"is negtive odd number");
			else
				System.out.println(num+"is negtive even number");
		else if(num%2!=0)
				System.out.println(num+"is  postive odd number");
			else
				System.out.println(num+"is positive even number");
				
	}//close of main
}//close of class
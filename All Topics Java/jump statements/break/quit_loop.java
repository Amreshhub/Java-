//program to show using break in quit looping
import java.util.*;
class quit_loop
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		
		int num=x.nextInt();
		int d=2;
		while(d<= num/2)
		{
			if(num%d==0)
			break;
			d++;
		}	
			if(d>num/2)
			    System.out.print(num+"is prime no");
			else
				System.out.print(num+"is not a prime no");
	}
}
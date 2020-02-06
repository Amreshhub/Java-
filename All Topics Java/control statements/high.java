//accept three no check and display highest value
import java.util.*;
class high
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter any three no:-");
		int a=x.nextInt();
		int b=x.nextInt();
		int c=x.nextInt();
		
		if(a>b)
			if(a>c)
				System.out.println("Highest value is:-"+a);
			else
				System.out.println("Highest value is:-"+c);
		else if(b>c)
				System.out.println("Highest value is:-"+b);
			 else
			 	System.out.println("Highest value is:-"+c);
		
	}//close of main
}//close of main


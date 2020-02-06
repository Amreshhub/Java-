//accept three no check and display the smollest value
import java.util.*;
class smollest
{
	public static void main(String args[])
	{
		Scanner y=new Scanner(System.in);
		
		System.out.print("Enter any three no:-");
		
		int a=y.nextInt();
		int b=y.nextInt();
		int c=y.nextInt();
		
		if(a<b)
			if(a<c)
				System.out.println("Smollest value is:-"+a);
				
			else
				System.out.println("Smollest value is:-"+c);
		else if(b<c)
				System.out.println("Smollest value is:-"+b);
			else
				System.out.println("Smollest value is:-"+c);	
	}//close of main
}//close of class

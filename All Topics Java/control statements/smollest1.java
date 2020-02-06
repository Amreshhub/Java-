//accept any four no check and display the smollest value
import java.util.*;
class smollest1
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		int a,b,c,d;
		
		System.out.print("Enter any four no::-");
		a=x.nextInt();
		b=x.nextInt();
		c=x.nextInt();
		d=x.nextInt();

		
		
		if(a<b)
			if(a<c)
				if(a<d)
					System.out.println("Smollest value is::"+a);
				else
					System.out.println("Smollest value is::"+d);
			else if(c<d)
						System.out.println("Smollest value is::"+c);
				 else
				 		System.out.println("Smollest value is::"+d);
		else if(b<c)
				if(b<d)
						System.out.println("Smollest value is::"+b);
				else
						System.out.println("Smollest value is::"+d);
			else if(c<d)
						System.out.println("Smollest value is::"+c);
				 else
				 		System.out.println("Smollest value is::"+d);		 		
	}//close of main
}//close of class
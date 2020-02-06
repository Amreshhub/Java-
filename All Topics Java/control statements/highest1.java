//acept four no check and display the highest value
import java.util.*;
class highest1
{
	public static void main(String args[])
	{
		Scanner z=new Scanner(System.in);
		
		System.out.print("Enter any four no::");
		int a,b,c,d;
		a=z.nextInt();
		b=z.nextInt();
		c=z.nextInt();
		d=z.nextInt();
		
		if(a>b)
			if(a>c)
				if(a>d)
					System.out.println("Hifhest value is::"+a);
				else
					System.out.println("Hifhest value is::"+d);
			else if(c>d)
					System.out.println("Hifhest value is::"+c);
				else
					System.out.println("Hifhest value is::"+d);
		else if(b>c)
				if(b>d)
					System.out.println("Hifhest value is::"+b);
				else
					System.out.println("Hifhest value is::"+d);
			 else if(c>d)
			 		System.out.println("Hifhest value is::"+c);
			 	  else
			 	  	System.out.println("Hifhest value is::"+d);	
			 		
	}//close of main
}//close of class
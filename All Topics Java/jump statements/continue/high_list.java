//program to show using labbled continue with while loop
import java.util.*;
class high_list
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
			int i=1,h=0,l=0,n,num;
	a1:do
	{
			System.out.print("Enter how many no you want:-");
		     n=x.nextInt();
		     if(n<=0){
		     		System.out.println("Invalied number found plz enter positive number");
				     continue a1;
		     
		     	
	
		a2:do
		{
			System.out.print("Enter positive no"+i+":-");
			num=x.nextInt();
			if(num<=0)
			{
				System.out.println("Invalied number found plz enter positive number");
				continue;
			}
			
			if(i==1)
				h=l=num;
			if(num>h)
				h=num;
			else if(num<l)
				l=num;
				i++;
		}while(n<=i);
		System.out.println("Highest number is="+h);
		System.out.println("smollest number is="+l);
	}
	}while(n<=0);
}
}

		
				
			
		
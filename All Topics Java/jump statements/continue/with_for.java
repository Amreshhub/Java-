//wap in java to accept n  positive integer number check and display the total count of even or odd no?
import java.util.*;
class with_for
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter how many no you want:-");
		int n=x.nextInt();
		int i,num,even=0,odd=0;
		for(i=1;i<=n;i++)
		{
			System.out.print("Enter positive no"+i+":-");
			num=x.nextInt();
			if(num<=0)
			{
				System.out.println("Invalied number found plz enter positive number");
				continue;
			}
			
		
		if(num%2==0)
			even++;
		else
			odd++;
		}//close of for
		System.out.println("Total count of even="+even);
		System.out.println("Total count of odd="+odd);
		
		
	}//close of main
}//close of class
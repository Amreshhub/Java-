
//accept a 5 degit numbar calculate and display sum of degit along with reverse
import java.util.*;
 class sum_rev_five_d
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		int	ctr=0,sum=0,rev=0,cnum=num;
		 
		 for(;num>0;ctr++)
		 {
		 	num=num/10;

		 }
	if(ctr==5)
	{
		for(int d=0;cnum>0;d++)
		{
			d=cnum%10;
			sum=sum+d;
			rev=rev*10+d;
			cnum=cnum/10;
		}
	
		 System.out.println("Sum of degite:="+sum);
		 System.out.println("Reverse of degite:="+rev);
	}else
		System.out.println("Invalied degit found Plz enter five degit number");
		
		 
	}
}

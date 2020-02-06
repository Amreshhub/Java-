//accept five degit number claculate and disply sum along with reverse order using dummy for
import java.util.*;
class sum_rev
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Five degit number:-");
		
		int num=a.nextInt();
		 int sum=0,rev=0,ctr=0,cnum=num;
		 
		for(;num>0;num=num/10,ctr++);
		if(ctr==5)
		{
		
		for(int d=0;cnum>0;d=cnum%10,sum=sum+d,rev=rev*10+d,cnum=cnum/10);
			System.out.println("Sum of degit:-"+sum);
			System.out.println("Reverse order is:-"+rev);
		}else
			System.out.println("Invalid Degit number found|plz Enter 5Degit number agan");	
	}//close of main
}//close of class
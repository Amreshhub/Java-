//accept seven degit number calculate and display Sum of alternet degit
import java.util.*;
class seven_d_sum
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter Seven Degit number:-");
		int num=a.nextInt();
		int sum=0,ctr=0,cnum=num;
		
		for(;num>0;num=num/10,ctr++);
		if(ctr==7)
		{
			for(int d=0;cnum>0;d=cnum%10,sum=sum+d,cnum=cnum/100);
			System.out.print("Sum of Alternet Degit:-"+sum);
			
		}else
			System.out.println("Invalied number found Plz enter Seven Degit number");
		}//close of main
}//close of class
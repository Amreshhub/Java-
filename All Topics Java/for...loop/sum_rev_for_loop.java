
//accept a numbar calculate and display sum and Reverse of degit
import java.util.*;
 class sum_rev_for
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int rev=0,sum=0;
		 
		 for(int d=0;num>0;d++)
		 {
		 	d=num%10;
		 	sum=sum+d;
		 	rev=rev*10+d;
		 	num=num/10;
		 }
		 System.out.println("Sum of degit:-"+sum);
		 System.out.println("Reverse of degit:-"+rev);
		 
	}
}

//accept a numbar calculate and display sum of diget and reverse order
import java.util.*;
class sum_reverse
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int d=0,sum=0,rev=0;
		 
		 while(num>0)
		 {
		 	d=num%10;
		 	sum=sum+d;
		 	rev=rev*10+d;
		 	num=num/10;
		 	
		 }
		 System.out.println("Sum of Givean number:-"+sum);
		 System.out.println("reverse of Givean number:-"+rev);
	}//end of main
}//end of class
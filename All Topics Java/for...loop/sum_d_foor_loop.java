//accept a numbar calculate and display sum of degit
import java.util.*;
public class sum_d_foor_loop
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int sum=0;
		 
		 for(int d=0;num>0;d++)
		 {
		 	d=num%10;
		 	sum=sum+d;
		 	num=num/10;
		 }
		 System.out.println("Sum of degit:-"+sum);
		 
	}
}

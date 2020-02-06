//accept a numbar calucalte and display sum of digit?
import java.util.*;
class sum_of_digit
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int d=0,sum=0;
		 
		 while(num>0)
		 {
		 	d=num%10;
		 	sum=sum+d;
		 	num=num/10;
		 	
		 }
		 System.out.println("Sum of Givean String:-"+sum);
	}//end of main
}//end of class
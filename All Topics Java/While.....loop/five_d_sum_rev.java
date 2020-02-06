//accept 5degite number calculate and display sum of degite along with reverse
import java.util.*;
class five_d_sum_rev
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter five degite number:-");
		int num=x.nextInt();
		int sum=0,rev=0;
		int cnum=num;
		int d=0;
		while(cnum>0)
		{
			cnum=cnum/10;
			d++;}
		if(d==5){
			    while(num>0){
				d=num%10;
				sum=sum+d;
				rev=rev*10+d;
				num=num/10;}
		
		
		System.out.println("Sum of degte:-"+sum);
		System.out.println("Reverse order of:-"+rev);
		
		}	else
			System.out.println("Invalied degite found Plz enter Five degite No");	
	}
}
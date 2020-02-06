//accept 7degite number calculate and display sum of  Alternat degite along with reverse
import java.util.*;
class alternet_sum
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter seven degite number:-");
		int num=x.nextInt();
		int sum=0,rev=0;
		int cnum=num;
		int d=0;
		while(cnum>0)
		{
			cnum=cnum/10;
			d++;}
		if(d==7){
			    while(num>0){
				d=num%10;
				sum=sum+d;
				
			//	rev=rev*10+d;
				num=num/100;}
		
		
		System.out.println("Sum of Alternet degte:-"+sum);
		//System.out.println("Reverse order of:-"+rev);
		
		}	else
			System.out.println("Invalied degite found Plz enter seven degite No");	
	}
}
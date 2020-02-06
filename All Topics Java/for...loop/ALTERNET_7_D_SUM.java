//ACCEPT 7 DEGIT NUMBER CALCULATE AND DISPLAY SUM OF ALTERNET DEGIT
import java.util.*;
class alternet
{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		
	System.out.print("Enter seven degit number:-");
	int num=a.nextInt();
	int cnum=num,sum=0,ctr;
	
	for( ctr=0;num>0;ctr++)
	{
		num=num/10;
		
	}
if(ctr==7){
	
	for(int d=0;cnum>0;)
	{
		d=cnum%10;
		sum=sum+d;
		cnum=cnum/100;
	}
		System.out.println("Sum of alternet degit:-"+sum);
	}else
		System.out.println("Invalied degit found Plz enter seven degit number");		
		
	}
}
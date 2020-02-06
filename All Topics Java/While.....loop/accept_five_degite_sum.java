//accept 5 degit number and display sum of degit
import java.util.*;
class count_d
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Five Degit number:-");
		int num=x.nextInt();
		int cnum=num,ctr=0,d=0,sum=0;	
		while(num>0)
		{
			num=num/10;
			ctr++;
			
		}
	if(ctr==5){
		while(cnum>0)
		{
			d=cnum%10;
			sum=sum+d;
			cnum=cnum/10;
		}
		System.out.print("Sum of Five degit:-"+sum);
	}else
		System.out.print("Invalied no found plz Enter Five degit no");	
	}//close of main
}//close of class
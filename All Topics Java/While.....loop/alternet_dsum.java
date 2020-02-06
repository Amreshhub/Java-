//accept 7 degit number calculate and disply su, of alternet degit

import java.util.*;
class alternet_dsum
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Seven Degit number:-");
		int num=x.nextInt();
		int cnum=num,ctr=0,d=0,sum=0;	
		while(num>0)
		{
			num=num/10;
			ctr++;
			
		}
	if(ctr==7){
		while(cnum>0)
		{
			d=cnum%10;
			sum=sum+d;
			cnum=cnum/100;
		}
		System.out.print("Sum of Seven Alternet degit:-"+sum);
	}else
		System.out.print("Invalied no found plz Enter Seven degit no");	
	}//close of main
}//close of class
//accept a number check and display given number is amstrong or not

import java.util.*;
class amstrong
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int d=0,sum=0, cnum=num;
		 
		 while(num>0)
		 {
		 	d=num%10;
		 	sum=sum+d*d*d;
		 	num=num/10;
		 	
		 }
		 if(cnum==sum)
		 	System.out.println(cnum+"is amstrong number");
		 else
		 	System.out.println(cnum+"is not amstrong number");	
	}//end of main
}//end of class
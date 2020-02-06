//accept a number check and display given number is palindrom or not

import java.util.*;
class amstrong
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int d=0,rev=0, cnum=num;
		 
		 while(num>0)
		 {
		 	d=num%10;
		 	rev=rev*10+d;
		 	num=num/10;
		 	
		 }
		 if(cnum==rev)
		 	System.out.println(cnum+"is palindrom number");
		 else
		 	System.out.println(cnum+"is not palindrom  number");	
	}//end of main
}//end of class
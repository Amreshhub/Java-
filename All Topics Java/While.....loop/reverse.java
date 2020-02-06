//accept a number calculate and display reverse order
import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int d=0,rev=0;
		 
		 while(num>0)
		 {
		 	d=num%10;
		 	rev=rev*10+d;
		 	num=num/10;
		 	
		 }
		 System.out.println("reverse of Givean Number:-"+rev);
	}//end of main
}//end of class
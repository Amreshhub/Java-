//accept a number calculate and disply factriol value
import java.util.*;
class factriol
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter a number:-");
		 int num=a.nextInt();
		 int fact=1,cnum=num;
		 
		 for(;num>0;fact=fact*num,--num);
		 System.out.println( "factriol of"+cnum+" is:-"+fact);
	}
}
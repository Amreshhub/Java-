
//accept a numbaer display the total count of diget
import java.util.*;
class dcount
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		int num=x.nextInt();
		 int d=0;
		 while(num>d)
		 {
		 	num=num%10;
		 	d++;
		 	
		 	
		 }
		 System.out.println("Total count of degit:"+d);
	}
}
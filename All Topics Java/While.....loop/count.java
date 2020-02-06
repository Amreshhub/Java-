//accept a numbaer display the total count of diget
import java.util.*;
class count
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		int num=x.nextInt();
		 int ctr=1,d=0;
		 while(num>=ctr)
		 {
		 	d=num%10;
		 	d++;
		 	d=d-1;
		 	ctr++;
		 }
		 System.out.println("Total count of degit:"+d);
	}
}
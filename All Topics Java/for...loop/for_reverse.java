
//accept a numbar calculate and display Reverse of degit
import java.util.*;
public class for_reverse
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int rev=0;
		 
		 for(int d=0;num>0;d++)
		 {
		 	d=num%10;
		 	rev=rev*10+d;
		 	num=num/10;
		 }
		 System.out.println("Reverse of degit:-"+rev);
		 
	}
}

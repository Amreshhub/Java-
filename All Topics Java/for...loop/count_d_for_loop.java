
//accept a numbar calculate and display Total count of degit
import java.util.*;
 class count_d_for_loop
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		int	ctr=0;
		 
		 for(;num>0;ctr++)
		 {
		 	num=num/10;

		 }
		 System.out.println("Total count of degit of degit:-"+ctr);
		 
	}
}

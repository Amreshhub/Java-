//accept base and power value And calculate and display exponce value
import java.util.*;
class exponce_value
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter base Value:-");
		int base=x.nextInt();
		System.out.print("Enter power Value:-");
		int power=x.nextInt();
		int y=1,ctr=1;
		
		while(ctr<=power)
		{
			y=y*base;
			ctr++;
			
		}
		System.out.println("Exponision value is:-"+y);
	}
}
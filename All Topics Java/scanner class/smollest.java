//accept two no chack and display smollest value
import java.util.*;
class smollest
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter first Number::");
		int a=x.nextInt();
		System.out.print("Enter Second Number::");
		int b=x.nextInt();
		
		if(a<b)
			System.out.println(a+"is smollest number");
		else
			System.out.println(b+"is smollest number");		
	}//close of main 
}//close of class
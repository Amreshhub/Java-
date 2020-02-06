//accept a string and display reverce order
import java.util.*;
class reverce
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		
		System.out.print("Enter a string:-");
		
		String str=x.nextLine();
		
		int a=0;
		String rev="";
		char ch;
		while(a<str.length())
		{
			ch=str.charAt(a);
			rev=ch+rev;
			a++;
		}
		System.out.println("Reverce order is:-"+rev);
	}
}
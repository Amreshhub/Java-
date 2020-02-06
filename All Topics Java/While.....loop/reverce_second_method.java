//accept a string and display reverce order
import java.util.*;
class reverce_second_method
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter a String:-");
		
		String str=x.nextLine();
		 String rev="";
		 int i=str.length()-1;
		 
		 while(i>=0)
		 {
		 	rev=rev+str.charAt(i);
		 	i--;
		 }
		 System.out.println("Reverce order is:-"+rev);
	}
}
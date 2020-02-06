//comapare two string
import java.util.*;
class compare
{
	public static void main(String args[])
	{
		Scanner y=new Scanner(System.in);
	System.out.print("Enter first string::");
		String str1=y.nextLine();
		System.out.print("Enter Second string::");
		String str2=y.nextLine();
		
		if(str2.equalsIgnoreCase(str1))
		
			System.out.println("String are Same");
		else
			System.out.println("String are not ssame");
			
		
	}//close of main
}//close of class
//accept two no ckack highest value and print them
import java.util.*;
class highest
{
	public static void main(String args[])
	{
		Scanner v=new Scanner(System.in);
		
	System.out.print("Enter first String::");
	int a=v.nextInt();
	System.out.print("Enter Second String::");
	int b=v.nextInt();
	
	if(a>b)
		System.out.println("Highest value::"+a);
	else
		System.out.println("Highest value::"+b);
	
	
	}//close of main
}//close of class
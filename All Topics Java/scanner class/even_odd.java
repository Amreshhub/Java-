//accept a no and chack and display no is even or odd
import java.util.*;
class even_odd
{
	public static void main(String args[])
	{
		Scanner y=new Scanner(System.in);
		
		System.out.print("Enter Any one number:-");
		int num=y.nextInt();
		
		if(num%2==0)
			System.out.println(num+"is even number");
		else
			System.out.println(num+"is odd number");
	}//close of main
}//close of class
//program to show use of lebel break with code block
import java.util.*;
class code_block
{
	public static void main (String[] args)
	
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter  a positive no:-");
		int num=x.nextInt();
		a1:{
			if(num<=0)
				System.out.print("Invalied no found plz enter Positive number");
				break a1;}
		
		System.out.print("positive number"+num+ "Entered");
		
		a2:{
			if(num%2==0)
				System.out.print(" is even number");
			else
				System.out.print(" is odd number");
				break a2;
		}
		
	}

}
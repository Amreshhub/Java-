//use of lebel break with loop
import java.util.*;
class lebel_with_loop
{
	public static void main (String[] args)
	
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter how many number you want:-");
		
		int n=x.nextInt();
     	int num,i=1;
	a1:while(true)
		{
			System.out.print("Enter a number"+i+":-");
			num=x.nextInt();
		
	a2:while(true)
	{
		if(num<=0)
			System.out.print("Invalied number found plz Enter agan");
		
			break a2;}
	
	System.out.print("positive number"+num+" Entered");

		if(num%2==0)
			System.out.println("is even no");
		else
			System.out.println("is odd no");
			i++;
			if(i>n){
				System.out.print("Succeesfully complited");
				break a1;
			}
//			break a2;
	
	}		
	}
	}


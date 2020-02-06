//EXAMPLE TO DISPLAY MENU DERIVEN PROGRAM
import java.util.*;
class do_while
{
	public static void main(String args[])throw InterruptedException
	{
		int sum=0,d=0,cnum=0
		Scanner x=new Scanner(System.in);
		do{
		
		System.out.println("=================Menu====================");
		System.out.println("<1> to get sum of degit.............");	
		System.out.println("<2> to get Reverse of degit.............");	
		System.out.println("<3> to get Perfact no.............");
		System.out.println("<4> to get Pprime no.............");
		System.out.println("<5> to get HCF............");
		System.out.println("<0> to Exit Apliction............");
		System.out.println("=====================================");
		
		System.out.println("Enter Choice if Menu List:-");
		String choice=x.nextLine();
		
		switch(choice)
		{
			case 1: System.out.println("Enter a number:-");
			
			    num=x.nextInt();
			    cnum=num;
			    while(num>o)
			    {
			    	d=num%10;
			    	sum=sum+d;
			    	num=num/10;
			    	
			    }
			    System.out.println("Sum of This "+cnum+"="+sum);
		}
		}
		
		
				
				
			
	}
}
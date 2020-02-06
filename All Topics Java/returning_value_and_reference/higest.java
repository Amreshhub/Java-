//example to demonstrate return value from method
import java.util.*;
class High
{
	private  double num1,num2;
	
	void accept(double a,double b)
	{
		num1=a;
		num2=b;
	}
	double  gretest()
	{
		return(num1>num2?num1:num2);
		
	}
	
}//close of class
class higest
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter any two number:-");
		double c=x.nextDouble();
		double d=x.nextDouble();
		
		High h=new High();
		h.accept(c,d);
	double h1=h.gretest();
	
	System.out.println("Highest value of two number:-"+h1);
		
	}//close of main
}//close of class
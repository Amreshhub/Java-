//Example to sho class object
import java.util.*;
class add
{
	private   double num1,num2,summatiom;
	
	void accept(double a,double b)
	{
		num1=a;num2=b;
	}
	void sum()
	{
		summatiom=num1+num2;
	}
	void print()
	{
		System.out.print("Sum of two number:-"+summatiom);
	}
}
class addtion
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter two no:-");
		double n=x.nextDouble();
		double o=x.nextDouble();
		
		add a1=new add();
		
		a1.accept(n,o);
		a1.sum();
		a1.print();
		}
}//close of main class
//Example to show method overloding in java
import java.util.*;
class Addition
{
	private double num1,num2,num3,num4,add;
	
	void input(int a,int b)
	{
		num1=a;num2=b;num3=num4=0.0;
	}
	void input(int a,int b,int c)
	{
		num1=a;num2=b;num3=c;num4=0.0;
	}
	void input(int a,int b,int c,int d)
	{
		num1=a;num2=b;num3=c;num4=d;
	}
	double sum()
	{
		add=num1+num2+num3+num4;
		return(add);
	}
	void disp()
	{
		System.out.println("Sum of number="+add);
	}
}//close of class
class Addition1{
	public static void main(String args[])
	{
		Addition no=new Addition();
		no.input(10,20);
		System.out.println("Sum of two number:-"+no.sum());
		no.input(10,20,30);
		System.out.println("Sum of Three number:-"+no.sum());
		no.input(10,20,30,40);
		no.sum();
		no.disp();
	}//close of main
}//close of main class
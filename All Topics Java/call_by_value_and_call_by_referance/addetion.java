//Example to demonstrate call_by_value in java
import java.util.*;
class sumition
{
	private double  num1,num2,add;
	
	void accept(double a,double b){
		num1=a; 
		num2=b;
	}
	void sum(){
		add=num1+num2;
	}
	void disp(){
		System.out.print("Sum of two number:-"+add);
	}
}//close of class
class addetion
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter any two number:-");
		
		double e=x.nextDouble();
		double f=x.nextDouble();
		
		 sumition w=new  sumition();
		 
		 w.accept(e,f);
		 w.sum();
		 w.disp();
		
		
	}//close of main
}//close of class


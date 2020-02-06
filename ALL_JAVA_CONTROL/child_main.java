//EXAMPLE TO DEMONSTRATE INHARITANCE IN JAVA
import java.lang.*;

 class base
{
	protected  int a,b,sum;
	
	public void accept(int a1,int a2)
	{
		a=a1;
		b=a2;
	}  

	public void display(){
	System.out.println("Value of a:-"+a);
	System.out.println("Value of b:-"+b);
	System.out.println("Sum of two no:-"+sum);
	}


}//close of base class

class child extends base
{
	public void calculate()
{
	sum=a+b;
}
}//close of derive class
 class child_main
{
public static void main(String args[])
{
	child ca=new child();
	ca.accept(10,20);
	ca.calculate();
	ca.display();
}
}//close of main class
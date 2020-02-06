//Example to show this keyword in java
import java.util.*;
class Complex
{
	private double real,img;
	
	void input(double real,double img)
	{
		this.real=real;
		this.img=img;
	}
	void disp()
	{
		if(img>=0)
			System.out.println(real+"+"+img+"i");
		else
			System.out.println(real+(img+"i"));
	}
}//close of class
class complex_no
{
	public static void main(String args[])
	{
		Complex c=new Complex();
		
		Scanner a=new Scanner(System.in);
		System.out.print("Enter real part of complex no:-");
		double  real=a.nextDouble();
		System.out.print("Enter img part of complex no:-");
		double  img=a.nextDouble();
		
		c.input(real,img);
		c.disp();
		
	}
}//close of main class
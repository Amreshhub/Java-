//program show call by valu and call by refarence
import java.util.*;
class complex
{
	private double real,img;
	
	void input(double r,double i)
	{
		real=r;
		img=i;
	}
	void add_complex(complex a,complex b)
	{
		real=a.real+b.real;
		img=a.img+b.img;
		
	}
	void print()
	{
		if(img>=0)
			System.out.println(real+"+"+img+"i");
		else
			System.out.println(real+(img+"i"));
	}
}//close of class
class complexno
{
	public static void main(String args[])
	{
		complex c1=new complex();
		complex c2=new complex();
		
		c1.input(9,4);//call by value
		c2.input(9,4);//call by value
		c1.print();
		c2.print();
		
		complex c3=new complex();
		
		c3.add_complex(c1,c2);//call by referance
		c3.print();
		
		
	}//close of main
}//close of main class
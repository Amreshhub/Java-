import java.util.*;
class com
{
	private double real,img;
	
	void input(double r,double i)
	{
		real=r;
		img=i;
		
	}
	void output()
	{
		if(img>=0)
		
			System.out.println(real+"+"+img+"i");
		else
			System.out.println(real+(img+"i"));
		}
}
class complex
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Real part of the complex no:-");
		double r=x.nextDouble();
		System.out.print("Enter Imeganer part of the complex no:-");
		double i=x.nextDouble();
		com c=new com();
		c.output();
		c.input(r,i);
		c.output();
	}
}
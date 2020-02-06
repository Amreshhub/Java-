h//example of reteruning reference of method
import java.util.*;
class dis
{
	private int feet,inch;
	
	void accept(int a,int b)
	{
		feet=a;
		inch=b;
	}
	dis add_distence(dis c)
	{
		dis temp=new dis();
		temp.feet=feet+c.feet;
		temp.inch=inch+c.inch;
		
		if(temp.inch>=12)
		{
			temp.feet+=temp.inch/12;
			temp.inch=temp.inch%12;
		}
		return(temp);
		
	}
	void print()
	{
		System.out.println(feet+"'"+inch+"\"");
	}
}//close of class
class distence
{
	public static void main (String[] args) 
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter first destence in Feet and Inch:-");
		int e=x.nextInt();
		int f=x.nextInt();
		System.out.print("Enter Second  destence in Feet and Inch:-");
		int g=x.nextInt();
		int h=x.nextInt();
		
		dis d1=new dis();
		d1.accept(e,f);
		dis d2=new dis();
		d2.accept(g,h);
		d1.print();
		d2.print();
		
	
		dis d3=d1.add_distence(d2);
		d3.print();
		
		
}//close of main	
}//close of main class

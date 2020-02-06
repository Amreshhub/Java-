//Example to show call by referance in java
import java.util.*;
class mdistance
{
	private int feet,inch;
	
	void accept(int f,int i)
	{
		feet=f;
		inch=i;
	}
	void add_distance(mdistance a,mdistance b)
	{
		feet=a.feet+b.feet;
		inch=a.inch+b.inch;
		
	}
	void disp()
	{
		if(inch>=12)
		{
			feet=feet+inch/12;
			inch=inch/12;
		}
		System.out.println("Distance:-"+feet+"'"+inch+"\"");
	}
}//close of class
class distance
{
	public static void main(String args[])
	{
		mdistance m1=new mdistance();
		mdistance m2=new mdistance();
		
		m1.accept(10,14);//call by value
		m2.accept(10,14);//call by value
		m1.disp();
		m2.disp();
		
		mdistance m3=new mdistance();
		
		m3.add_distance(m1,m2);//call by referance
		m3.disp();
		
		
	}//close of main
}//close of main class
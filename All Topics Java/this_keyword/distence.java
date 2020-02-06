//Example to show this keyword in java
import java.util.*;
class Destance
{
	private int feet,inch;
	
	void input(int feet,int inch)
	{
		this.feet=feet;
		this.inch=inch;
	if(inch>=12){
		this.feet+=inch/12;
		this.inch=inch%12;
	}
	}
	void disp()
	{
		System.out.println(feet+"'"+inch+"\"");
	}
}//close of class
class distence
{
	public static void main(String args[])
	{
		Destance d=new Destance();
		
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Destence in Feet:-");
		int feet=a.nextInt();
		System.out.print("Enter Destence in Feet:-");
		int inch=a.nextInt();
		
		d.input(feet,inch);
		d.disp();
		
	}
}//close of main class
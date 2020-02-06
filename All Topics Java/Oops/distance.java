import java.util.*;
class dist
{
	private int feet,inch;
	
	void read(int f,int i)
	{
		feet=f;
		inch=i;
		
	if(inch>=12)
	{
		feet+=inch/12;
		inch=inch%12;
	}
		
	}
	void print()
	{
		System.out.println(feet+"'"+inch+"\"");
		}
		}
class distance
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Dimonsen of object in feet:-");
		int f=x.nextInt();
		System.out.print("Enter Dimenson of object in inch:-");
		int i=x.nextInt();
		dist c=new dist();
		c.print();
		c.read(f,i);
		c.print();
	}
}
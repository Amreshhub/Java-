import java.util.*;
class time_format
{
	private int hour,min,sec;
	
	void accept(int h,int m,int s)
	{
		hour=h;min=m;sec=s;
		
	if(sec>=60)
	{
		min+=sec/60;
		sec=sec%60;
	}
	if(min>=60)
	{
		hour+=min/60;
		min=min%60;
	}	
	}
	void ptime()
	{
		System.out.println(hour+":"+min+":"+sec);
		}
		}
class time
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Time in hour:-");
		int h=x.nextInt();
		System.out.print("Enter Time in Min:-");
		int m=x.nextInt();
		System.out.print("Enter Time in Sec:-");
		int s=x.nextInt();
		time_format t=new time_format();
		t.ptime();
		t.accept(h,m,s);
		t.ptime();
	}
}
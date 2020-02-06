//program show call by valu and call by refarence
import java.util.*;
class Time
{
	private int hour,minute,second;
	
	void accept_time(int h,int m,int s)
	{
		hour=h;minute=m;second=s;
	}
	void add_time(Time a,Time b)
	{
		hour=a.hour+b.hour;
		minute=a.minute+b.minute;
		second=a.second+b.second;
		
	}
	void print_time()
	{
		if(second>=60)
		{
			minute=minute+second/60;
			second=second%60;
		}
		if(minute>=60)
		{
			hour=hour+minute/60;
			minute=minute%60;	
		}
		System.out.println(hour+":"+minute+":"+second);
			
	}
}//close of class
class time_format
{
	public static void main(String args[])
	{
		Time t1=new Time();
		Time t2=new Time();
		
		t1.accept_time(12,60,60);//call by value
		t2.accept_time(12,60,60);//call by value
		t1.print_time();
		t2.print_time();
		
		Time t3=new Time();
		
		t3.add_time(t1,t2);//call by referance
		t3.print_time();
		
		
	}//close of main
}//close of main class
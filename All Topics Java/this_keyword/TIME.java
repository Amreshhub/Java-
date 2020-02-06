//Example to show this keyword in java
import java.util.*;
class time
{
	private int hour,minute,second;
	
	void input(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	if(second>=60){
		this.minute=minute+second/60;
		this.second=second%60;
	}
		if(minute>=60){
		this.hour+=minute/60;
		this.minute=minute%60;
	}
	}
	void disp()
	{
		System.out.println(hour+":"+minute+":"+second);
	}
}//close of class
class time_formet
{
	public static void main(String args[])
	{
		time T=new time();
		
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Time in hour:-");
		int hour=a.nextInt();
		System.out.print("Enter Time in minutet:-");
		int minute=a.nextInt();
		System.out.print("Enter Time in Secondt:-");
		int second=a.nextInt();
		
		T.input(hour,minute,second);
		T.disp();
		
	}
}//close of main class
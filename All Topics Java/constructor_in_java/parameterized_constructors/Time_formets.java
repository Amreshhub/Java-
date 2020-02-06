//Example of parameterizsed constructers in java and example of overloading of constrecturs;

import java.util.*;
class times
{
	private  int hour,min,sec;
	
	
	
	 times()
	 {
	 	System.out.println("Default constrector called");
	 	 hour=1;
	 }
	  times(int hour)
	  {
	  	System.out.println("Parameterised constrector called");
	  	this.hour=hour;
	  }
	   times(int hour,int min)
	  {
	  	System.out.println("Parameterised constrector called");
	  	this.hour=hour;
	  	this.min=min;	  	
	  }
	   times(int hour,int min,int sec)
	  {
	  	System.out.println("Parameterised constrector called");
	  	this.hour=hour;
	  	this.min=min;
	  	this.sec=sec;	  	
	  }
	   void time_input(int hour,int min,int sec)
	  {
	  	this.hour=hour;
	  	this.min=min;
	  	this.sec=sec;
	  	
	  	if(sec>=60)
	  	{
	  		this.min+=sec/60;
	  		this.sec=sec%60;
	  	}
	  	if(min>=60)
	  	{
	  		this.hour+=min/60;
	  		this.min=min%60;
	  	}
	  		  	
	  }
	  void display()
	  {
	  	System.out.println("**********Display Time Formet***************");
	        	System.out.println(hour+":"+min+":"+sec);
	  	System.out.println("********************************************");
	  }
	  
	
}//close of class
class Time_formets
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
	  	System.out.println("**********Enter Time Formit***************");
	        	System.out.print("Enter Hour:-");
	        int hour=x.nextInt();
	        	System.out.print("Enter Minute:-");
	        int min=x.nextInt();
	  			System.out.print("Enter Second:-");
	  		int sec=x.nextInt();
	  	System.out.println("********************************************");
	  
	  
	  	times t=new times();
	  	t.display();
	  	
	    times t1=new times(hour);
	    t1.display();
	  	
	  	times t2=new times(hour,min);
	    t2.display();
	  	
	    times t3=new times(hour,min,sec);
	    t3.display();
	  	
	 	
	  	t. time_input(hour,min,sec);
	  	t.display();
	 		
	}
}
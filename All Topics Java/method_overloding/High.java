//example to show method overloading in java
import java.util.*;
class HIGHEST
{
	
	int high(int a,int b)
	{
		return(a>b?a:b);
	}
	int high(int a,int b,int c)
	{
		if(a>b)
			if(a>c)
				return(a);
			else
				return(c);
		else if(b>c)
				return(b);
			 else
			 	return(c);
	}
	int high(int a,int b,int c,int d)
	{
		if(a>b)
			if(a>c)
				if(a>d)
					return(a);
				else
					return(b);
			else if(c>d)
					return(c);
				 else
				 	return(d);
		else if(b>c)
				if(b>d)
					return(b);
				else
					return(d);
			 else if(c>d)
			 		return(c);
			 	  else
			 	  	return(d);
	}
}//close of class
class High
{
	public static void main(String args[])
	{
		HIGHEST hh=new HIGHEST();
		
		System.out.println("Highest value between two number:-"+hh.high(20,30));
		System.out.println("Highest value between three number:-"+hh.high(20,30,40));
		System.out.println("Highest value between four number:-"+hh.high(20,30,40,50));
		
	}//close of main
}//close of main class
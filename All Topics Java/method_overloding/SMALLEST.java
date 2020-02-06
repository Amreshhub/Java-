//Example to show method overloading in java
import java.util.*;
class smollest
{
	
	int lowest(int a,int b)
	{
		return(a<b?a:b);
	}
	int lowest(int a,int b,int c)
	{
		if(a<b)
			if(a<c)
				return(a);
			else
				return(c);
		else if(b<c)
				return(b);
			 else
			 	return(c);
	}
	int lowest(int a,int b,int c,int d)
	{
		if(a<b)
			if(a<c)
				if(a<d)
					return(a);
				else
					return(d);
			else if(c<d)
					return(c);
				 else
				 	return(d);
		else if(b<c)
				if(b<d)
					return(b);
				else
					return(d);
			 else if(c<d)
			 		return(c);
			 	  else
			 	  	return(d);
	}
}//close of class
class SMALLEST
{
	public static void main(String args[])
	{
		smollest ss=new smollest();
		
		System.out.println("Lowest value between two number:-"+ss.lowest(20,30));
		System.out.println("Lowest value between three number:-"+ss.lowest(20,10,40));
		System.out.println("Lowest value between four number:-"+ss.lowest(20,30,40,5));
		
	}//close of main
}//close of main class
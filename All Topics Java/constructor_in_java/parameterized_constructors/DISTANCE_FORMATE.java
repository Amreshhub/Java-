//Example of parameterizsed constructers in java and example of overloading of constrecturs;

import java.util.*;
class distance
{
	private  double feet,inch;
	
	
	
	 distance()
	  {
	 	System.out.println("Default constrector called");
	 	 feet=3;
	 	 inch=4;
	   }
	  distance(double feet)
	   {
	  	System.out.println("Parameterised constrector called");
	  	this.feet=feet;
	   }
	   distance(double feet,double inch)
	    {
	  	System.out.println("Parameterised constrector called");
	  	this.feet=feet;
	  	this.inch=inch;	  	
	     }
	   void distance_input(double feet,double inch)
	   {
	  	this.feet=feet;
	  	this.inch=inch;
	  	
	  	if(inch>=12)
	  	{
	  		this.feet+=inch/12;
	  		this.inch=inch%12;
	  	}
	   }
	  void display()
	  {
	  	System.out.println("**********Display DEstance Formet***************");
	        	System.out.println("Destince:-"+feet+"'"+inch+"\"");
	  	System.out.println("********************************************");
	  }
	  
	
}//close of class
class DISTANCE_FORMATE
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
	  	System.out.println("**********Enter Distance Formit***************");
	        	System.out.print("Enter distance in feet:-");
	        double  feet=x.nextDouble();
	        	System.out.print("Enter Distance in inch:-");
	        double inch=x.nextDouble();
	  	System.out.println("********************************************");
	  
	  
	  	distance d=new distance();
	  	d.display();
	  	
	    distance d1=new distance(feet);
	    d1.display();
	  	
	  	distance d2=new distance(feet,inch);
	    d2.display();
	  	d. distance_input(feet,inch);
	  	d.display();
	 		
	}
}
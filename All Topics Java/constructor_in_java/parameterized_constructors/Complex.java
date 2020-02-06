//Example of parameterizsed constructers in java and example of overloading of constrecturs;

import java.util.*;
class complex
{
	private  double real,img;
	
	
	
	 complex()
	  {
	 	System.out.println("Default constrector called");
	 	 real=3;
	 	 img=4;
	   }
	  complex(double real)
	   {
	  	System.out.println("Parameterised constrector called");
	  	this.real=real;
	   }
	   complex(double real,double img)
	    {
	  	System.out.println("Parameterised constrector called");
	  	this.real=img;
	  	this.real=img;	  	
	     }
	   void complex_input(double real,double img)
	   {
	  	this.real=real;
	  	this.img=img;
	   }
	  void display()
	  {
	  	System.out.println("**********Display Complex no Formet***************");
	  	if(img>=0)
	  		
	        	System.out.println(real+"+"+img+"i");
	    else
	    	  	System.out.println(real+(img+"i"));
	  	System.out.println("********************************************");
	  }
	  
	
}//close of class
class Complex_formate
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
	  	System.out.println("**********Enter Complex Formit***************");
	        	System.out.print("Enter Real part of complex no:-");
	        double  real=x.nextDouble();
	        	System.out.print("Enter Imgenari part of complex no:-");
	        double img=x.nextDouble();
	  	System.out.println("********************************************");
	  
	  
	  	complex c=new complex();
	  	c.display();
	  	
	    complex c1=new complex(real);
	    c1.display();
	  	
	  	complex c2=new complex(real,img);
	    c2.display();
	  	c. complex_input(real,img);
	  	c.display();
	 		
	}
}
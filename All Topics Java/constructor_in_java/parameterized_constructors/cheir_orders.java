//Example of parameterizsed constructers in java and example of overloading of constrecturs;

import java.util.*;
class chair_order
{
	private  double width,hight;
	private int legs,arms;
	private String color;
	
	
	 chair_order()
	 {
	 	System.out.println("Default constrector called");
	 	 width=5;
	 	 hight=7;
	 	 legs=4;
	 	 arms=2;
	 	 color="BROWN";
	 }
	  chair_order(double width,double hight)
	  {
	  	System.out.println("Parameterised constrector called");
	  	this.width=width;this.hight=hight;
	  }
	   chair_order(double width,double hight,int legs,int arms)
	  {
	  	System.out.println("Parameterised constrector called");
	  	this.width=width;this.hight=hight;this.legs=legs;this.arms=arms;	  	
	  }
	   chair_order(double width,double hight,int legs,int arms,String color)
	  {
	  	System.out.println("Parameterised constrector called");
	  	this.width=width;this.hight=hight;this.legs=legs;this.arms=arms;this.color=color;	  	
	  }
	   void chair_input(double width,double hight,int legs,int arms,String color)
	  {
	  	this.width=width;this.hight=hight;this.legs=legs;this.arms=arms;this.color=color;	  	
	  }
	  void display()
	  {
	  	System.out.println("**********Display Chair Order***************");
	        	System.out.println("Width:-"+width);
	        	System.out.println("Height:-"+hight);
	  			System.out.println("NO of Legs:-"+legs);
	  			System.out.println("No of Arms:-"+arms);
	  			System.out.println("Color:-"+color);
	  	System.out.println("********************************************");
	  }
	  
	
}//close of class
class cheir_order
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		Scanner x1=new Scanner(System.in);
			
	
		
		
	  	System.out.println("**********Enter Chair Order***************");
	        	System.out.print("Enter Width:-");
	        double width=x.nextDouble();
	        	System.out.print("Enter Height:-");
	        double hight=x.nextDouble();
	  			System.out.print("Enter NO of Legs:-");
	  		int legs=x.nextInt();
	  			System.out.print("Enter No of Arms:-");
	  		int arms=x.nextInt();
	  			System.out.print("Enter Color:-");
	  		String color=x1.nextLine();	
	  	System.out.println("********************************************");
	  
	  
	  	chair_order c=new chair_order();
	  	c.display();
	  	
	  	chair_order c1=new chair_order(width,hight);
	  
	  	c1.display();
	  	
	  	 chair_order c2=new chair_order(width,hight,legs,arms);
	    	c2.display();
	  	
	  	chair_order c3=new chair_order(width,hight,legs,arms,color);
	  	c3.display();
	  	
	 	
	  	c. chair_input(width,hight,legs,arms,color);
	  	c.display();
	 		
	}
}
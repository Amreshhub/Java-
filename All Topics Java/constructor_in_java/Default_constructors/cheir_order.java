//Example to show defin default constrector in java
import java.util.*;
class cheir{
	
		private double  hight,width;
		private int legs,arms;
		private String color;
		
cheir()
{
	hight=8.0;
	width=4.0;
	arms=2;
	legs=4;
	color="Brown";
	
}

void input(double hight,double width,int legs,int arms,String color)
{
	this.hight=hight;
	this.width=width;
	this.legs=legs;
	this.arms=arms;
	this.color=color;
}
void display()
{
	System.out.println("**********Order of Cheir***********");
	System.out.println("Hight:-"+hight);
	System.out.println("Width:-"+width);
	System.out.println("Arms:-"+arms);
	System.out.println("Leags:-"+legs);
	System.out.println("Color:-"+color);
}

}//close of class
class cheir_order
{
	
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		Scanner x1=new Scanner(System.in);
		
		System.out.println("***********Bokking order of cheir*************");
		System.out.print("Enter Hight of cheir to be made:-");
		double hight=x.nextDouble();
		System.out.print("Enter Width of cheir to be made:-");
		double width=x.nextDouble();
		System.out.print("Enter No of Legs cheir to be made:-");
		int legs=x.nextInt();
		System.out.print("Enter NO  of Arms cheir to be made:-");
		int arms=x.nextInt();
		System.out.print("Enter Color of cheir to be made:-");
		 String color=x1.nextLine();
		
		cheir c=new cheir();
		
		c.display();
		c.input(hight,width,legs,arms,color);
		c.display();
	}
}
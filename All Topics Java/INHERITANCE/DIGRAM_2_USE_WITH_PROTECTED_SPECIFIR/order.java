//Example to show use of protected access spifier in case of inharitance

//Defining super class Furniture

import java.util.*;
class Furniture
{
	protected double width,height;
	protected String color;
}//close of super class Furniture

//define subclass chair
class chair extends Furniture
{
	private int legs,arms;
void accept(double width,double height,String color,int legs,int arms)
{
	this.width=width;
	this.height=height;
	this.color=color;
	this.legs=legs;
	this.arms=arms;
}
void print()
{
	System.out.println("*********Displaying of chair order**************");
		System.out.println("Width:-"+width);
		System.out.println("Height:-"+height);
		System.out.println("NO of Legs:-"+legs);
		System.out.println("No of Arms:-"+arms);
		System.out.println("Chair Color:-"+color);
	System.out.println("************************************************");
}
}//close of subclass chair

//Define sub class Bookshilf

class Bookshilf extends Furniture
{
	private int shilf;

void accept(double width,double height,String color,int shilf)
{
	this.width=width;
	this.height=height;
	this.color=color;
	this.shilf=shilf;
	
}
void print()
{
	System.out.println("*********Displaying of Bookshilf order**************");
		System.out.println("Width:-"+width);
		System.out.println("Height:-"+height);
		System.out.println("NO of Shilf:-"+shilf);
		System.out.println("Chair Color:-"+color);
	System.out.println("************************************************");
}
}//close of subclass Bookshilf

//Defining Main class
class order
{
	public static void main(String a[])
	{
		chair c=new chair();
		c.accept(12.5,6,"BROWN",4,2);
		c.print();

		
		Bookshilf b=new Bookshilf();
		b.accept(10,4,"BLACK",6);
		b.print();
	}//close of main
}//close of main class

	
//Example to show  case of inharitance

//Defining super class Furniture
//IMPLEMEMTING DIGRAM 4
import java.util.*;
class Furniture
{
	private double width,height;
	private String color;


void input(double width,double height,String color)
{
	this.width=width;this.height=height;this.color=color;
}
void output()
{
	System.out.println("Width:-"+width);
	System.out.println("Height:-"+height);
	System.out.println("Color:-"+color);
}
}//close of super class Furniture

//define subclass chair
class chair extends Furniture
{
	private int legs,arms;
void input(double width,double height,String color,int legs,int arms)
{
	input(width,height,color);
	this.legs=legs;
	this.arms=arms;
}
void output()
{
	System.out.println("*********Displaying of chair order**************");
		super.output();
		System.out.println("NO of Legs:-"+legs);
		System.out.println("No of Arms:-"+arms);
		
	System.out.println("************************************************");
}
}//close of subclass chair

//Define sub class Bookshilf

class Bookshilf extends Furniture
{
	private int shilf;

void input(double width,double height,String color,int shilf)
{
	input(width,height,color);
	this.shilf=shilf;
	
}
void output()
{
	System.out.println("*********Displaying of Bookshilf order**************");
		super.output();
		System.out.println("NO of Shilf:-"+shilf);
		
	System.out.println("************************************************");
}
}//close of subclass Bookshilf

//Defining Main class
class order1_of_bookseilf
{
	public static void main(String a[])
	{
		chair c=new chair();
		c.input(12.5,6,"BROWN",4,2);
		c.output();

		
		Bookshilf b=new Bookshilf();
		b.input(10,4,"BLACK",6);
		b.output();
	}//close of main
}//close of main class

	
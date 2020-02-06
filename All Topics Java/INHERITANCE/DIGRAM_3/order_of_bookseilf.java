//Example to show  case of inharitance

//Defining super class Furniture
//IMPLEMEMTING DIGRAM 3
import java.util.*;
class Furniture
{
	private double width,height;
	private String color;


protected void input(double width,double height,String color)
{
	this.width=width;this.height=height;this.color=color;
}
protected void output()
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
void accept(double width,double height,String color,int legs,int arms)
{
	input(width,height,color);
	this.legs=legs;
	this.arms=arms;
}
void print()
{
	System.out.println("*********Displaying of chair order**************");
		output();
		System.out.println("NO of Legs:-"+legs);
		System.out.println("No of Arms:-"+arms);
		
	System.out.println("************************************************");
}
}//close of subclass chair

//Define sub class Bookshilf

class Bookshilf extends Furniture
{
	private int shilf;

void accept(double width,double height,String color,int shilf)
{
	input(width,height,color);
	this.shilf=shilf;
	
}
void print()
{
	System.out.println("*********Displaying of Bookshilf order**************");
		output();
		System.out.println("NO of Shilf:-"+shilf);
		
	System.out.println("************************************************");
}
}//close of subclass Bookshilf

//Defining Main class
class order_of_bookseilf
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

	
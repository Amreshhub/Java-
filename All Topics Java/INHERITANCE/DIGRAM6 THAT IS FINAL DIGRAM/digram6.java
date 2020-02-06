//Example to show  case of inharitance

//Defining super class Furniture
//IMPLEMEMTING DIGRAM 6 that is final digram
import java.util.*;
class Furniture
{
	private double width,height;
	private String color;
Furniture(){
color="";
}
Furniture(double width,double height,String color)
{
	this.width=width;this.height=height;this.color=color;
}


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
chair(){}
chair(double width,double height,String color,int legs,int arms){
super(width,height,color);
	this.legs=legs;
	this.arms=arms;
}
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
Bookshilf(){}
Bookshilf(double width,double height,String color,int shilf)
{
	super(width,height,color);
	this.shilf=shilf;
	
}

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
class digram6
{
	public static void main(String a[])
	{
		chair c=new chair(12.5,6,"BROWN",4,2);
		Bookshilf b=new Bookshilf(10,4,"BLACK",5);
	Furniture f;
	f=c;//here working dynamic dispatch method
	f.output();
	f=b;
	f.output();//one interface diffrent output acchived run time pollymorphsim 
	}//close of main
}//close of main class

	
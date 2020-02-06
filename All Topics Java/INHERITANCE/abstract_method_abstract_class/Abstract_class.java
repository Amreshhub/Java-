//Example to show abstract method and abstract class
//Defining super class shape
abstract class shape{
	
	private double base,height;

	shape(){}
	shape(double base,double height){
	this.base=base;
	this.height=height;
	}
	void input(double base,double height){
	this.base=base;
	this.height=height;
	}
	double return_base(){
	return(base);
	}
	double return_height(){
	return(height);
	}
	
abstract void area();
}//close of abstract class shape
//Defining sub class Triangle
	
class Triangle extends shape{
private double tarea;

Triangle(){}
Triangle(double base,double height){
	super(base,height);
	}
void area(){
tarea=return_base()*return_height()*0.5;
System.out.println("Area of Triangle="+tarea);
}
}//close of sub class Traingle	
//Defining sub class Ractangle
	
class Ractangle extends shape{
private double rarea;

Ractangle(){}
Ractangle(double base,double height){
	super(base,height);
	}
void area(){
rarea=return_base()*return_height();
System.out.println("Area of Ractangle="+rarea);
}
}//close of sub class Ractangle
//Defining main class
class Abstract_class{
	public static void main(String args[]){
	
	Triangle t=new Triangle(12.8,5.9);
	Ractangle r=new Ractangle(23,7.9);
	shape s;
	s=t;//Dyinamic dispatch method workes
	s.area();
	s=r;
	s.area();//acchived Run time pollymorphishm
	}//close of main
}//close of main class

				
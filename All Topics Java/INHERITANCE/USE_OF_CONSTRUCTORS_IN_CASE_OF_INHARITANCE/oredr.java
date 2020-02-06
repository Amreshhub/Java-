//PROGRAM TO SHOW USE OF CONSTRUCTOR IN CASE OF INHARITANCE

//Defining super class A
class A{
	private int avar;
A(){
System.out.println("Super class A Default constructor called");
avar=10;
}
void input(int a){
avar=a;
}
void disp(){
System.out.println("Super class A() disp method called");
System.out.println("Value in instance varible avar:-"+avar);
}
}//close of super class A
//Define sub class B
class B extends A{
private int bvar;

B(){
System.out.println("Sub class B Default constructor called");
bvar=20;
}
void input(int a,int b){
input(a);
bvar=b;
}
void disp(){
super.disp();
System.out.println("Sub class B disp() method called");
System.out.println("Value in instance varible bvar:-"+bvar);
}
}//close of sub class B
//Defining main class
class oredr{
public static void main(String args[])
{
	B bobj=new B();
	bobj.disp();
	bobj.input(23,24);
	bobj.disp();
}//close of main
}//close of class
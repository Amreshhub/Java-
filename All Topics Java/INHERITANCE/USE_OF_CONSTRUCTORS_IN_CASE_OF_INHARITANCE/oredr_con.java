//PROGRAM TO SHOW USE OF CONSTRUCTORS IN CASE OF INHARITANCE

//Defining super class A
class A{
	private int avar;
A(){
System.out.println("Super class A Default constructor called");
avar=10;
}
A(int c){
System.out.println("Spuer class A  parameterized constroctrs callad");
avar=c;
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
B(int d,int e){
super(d);
System.out.println("Subclass B parameterized constroctor called");
bvar=e;
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
class oredr_con{
public static void main(String args[])
{
	B bobj=new B(22,44);
	bobj.disp();
}//close of main
}//close of class
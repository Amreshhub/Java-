//Example to show use of super keyword in java
//Defining super class A
class A{
 double avar;
    A(){
	System.out.println("Super class A Default constructor called");
	avar=10;
	}
    A(double a){
	System.out.println("Super class A Parameterized constructor called");
	avar=a;
	}

    void input(double m){
	avar=m;
		}
    void print(){
	System.out.println("Value in super class A varible avar="+avar);
	}
}//close of super class A

//Defining sub class B
class B extends A{
 double bvar;
     B(){
	System.out.println("Sub class B Default constructor called");
	bvar=20;
	}
     B(double a,double e){
	super(e);//ues of super keyword
	System.out.println("Sub class B Parameterized constructor called");
	avar=a;
	}


     void input(double c,double d){//method ovverrloding
	input(c);
	bvar=d;
	}
     void print(){//method overridding 
	super.print();
	System.out.println("Value in sub class B variable bvar="+bvar);
	}
}//close of sub class B

//Defining main class
class super_key{
public static void main(String args[]){

B bobj=new B(44,55.0);
bobj.print();
	}//close of main
}//close of main class
 
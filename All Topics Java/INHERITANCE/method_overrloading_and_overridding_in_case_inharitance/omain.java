//Example to show method ovverriding and overrloding in case of inharitance
//Defining super class A
class A{
 double avar;

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
class omain{
public static void main(String args[]){

B bobj=new B();
bobj.input(20.3,34);
bobj.print();
	}//close of main
}//close of main class
 
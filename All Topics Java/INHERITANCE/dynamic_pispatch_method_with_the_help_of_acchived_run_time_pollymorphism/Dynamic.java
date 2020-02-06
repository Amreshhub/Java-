//Example to show Working Dynamic dispatch method in case of inharitance
//Defining super class A
class A{

    void disp(){
	System.out.println("Super class A disp() method called");
	}
}//close of super class A

//Defining sub class B
class B extends A{
 void disp(){
	System.out.println("Sub class B disp()method  called");
	}
}//close of sub class B
//Defining subclass C
class C extends A{
 void disp(){
	System.out.println("Sub class C disp()method called");
	}
}//close of sub class B


//Defining main class
class Dynamic{
public static void main(String args[]){

B b1=new B();
C c1=new C();
A a1;
a1=b1;//hear working Dynamic dispatch method 
a1.disp();//one interface different output acchived run time pollymorphishm
a1=c1;//hear working Dynamic dispatch method 
a1.disp();//one interface different output acchived run time pollymorphishm
	}//close of main
}//close of main class
 
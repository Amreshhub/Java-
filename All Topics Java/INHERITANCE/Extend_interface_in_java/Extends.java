//Example to show how to extend interface in java
//Defining interface (style) named A

interface A{

void Adisp();
}

//Defining interface (style) named B

interface B extends A{

void Bdisp();
}
//Defining class that implemented interface (style)A

class C implements A{

public void Adisp(){

	System.out.println("Style1 interface A implemented by class");
}
public void Bdisp(){

	System.out.println("Style1 interface B implemented by class");
}
}//close of implemented class

class Extends{
	public static void main(String args[]){
		C ob=new C();
		ob.Adisp();
		ob.Bdisp();
		}//close of main
}//close of main class


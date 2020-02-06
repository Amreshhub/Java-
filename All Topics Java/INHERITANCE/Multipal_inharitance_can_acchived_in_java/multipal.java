 XZZZZ 
.//Java application to show how a similar result like multipal inharitance can be acchive in java
//Defining Super class Base
class Base{
	void bdisp(){
		System.out.println("Super class bdisp()method called");
	}
	}//close of super class Base
//Defining interface named style

	interface style1{
		void sdisp();
	}//close of interface named style1
//defining class that extends super class and interface (style1)

class multipal_inharitance extends Base implements style1{

public void sdisp(){
	System.out.println("Sdisp()method implimented called");
}
}//close of class
class multipal{
	public static void main(String args[]){
		multipal_inharitance m=new multipal_inharitance();
		m.bdisp();
		m.sdisp();
	}
}//close of main class
		
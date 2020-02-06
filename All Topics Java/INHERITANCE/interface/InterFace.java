//Program to show the use of interface i:e style in java
//Defining interface(style)
interface Automobile{
	void gear();
	void brak();
}//close of interface
//defining class Maruti 
class maruti implements  Automobile 
{

	public void gear(){
	 System.out.println("Four gear in Action");
	}
	
	public void brak(){
	 System.out.println("Normale break in Action");
	}
}//close of class maruti

//defining class Honda
class Honda implements  Automobile
{

	public void gear(){
	 System.out.println("Five gear in Action");
	}
	
	public void brak(){
	 System.out.println("Power break in Action");
	}
}//close of class Honda

//Defining main class
class InterFace{
	public static void main(String args[]){
	
	
	maruti m=new maruti();
	Honda h=new Honda();

	Automobile A;
	A=m;
	A.gear();
	A=h;
	A.brak();
	}//close of main
}//close of main class
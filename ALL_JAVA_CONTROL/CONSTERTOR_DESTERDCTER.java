//EXAMPLE TO SHOW CONSTERCTOR AND DESTERCTOR
class conste
{
	int a,b,sum;
public conste()
{
	a=10;
	b=20;
	
}
public conste(int a1,int a2)
{
	a=a1;
	b=a2;
	
}
public void calculate()
{
	sum=a+b;
}
public void display(){
	System.out.println("Sum of two no:-"+sum);
	
}	
}//close of class
class CONSTERTOR_DESTERDCTER
{
	public static void main(String args[])
	{
	conste c=new conste();
//	c.sum();
	c.calculate();
	c.display();
}
}//close of main

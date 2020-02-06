//example to demonstrate the example of constrocter  in case of inharitance java
class test
{
	protected  int a,b,sum;
	public test(){
		a=10;
		b=10;
		
	}
	public test(int a1,int a2)
	{
		a=a1;
		b=a2;
	}
	public void  disp(){
		System.out.println("Value in var a:-"+a);
		System.out.println("Value in var b:-"+b);
	}
	
}
 class child_test
 {
 	public  child_test()
 	{
 		super();
 	}
 	public  child_test(int a,int b)
 	{
 		super(a,b);
 		sum=a+b;
 	}
 	public void  disp()
 	{
 		super.disp();
 		System.out.println("Sumation is two no:-"+sum);
 	}
 }
class test_main
{
	public static void main(String args[])
	{
		child_test c=new child_test();
		c.disp();
		child_test c1=new child_test(10,20);
		c1.disp();
		
	
		
	}
}
//program besd on narrowing conversson
class narrowing
{
	public static void main(String args[])
	{
		byte a,b=2,c;
		float m=40.56f;
		int i,j=200;
	a=(byte)j;//narrowing conversion
	i=(int)m;//narrowing conversion
	c=(byte)(b*10);//narrowing conversion
	
	System.out.println("Value of var a="+a);
	System.out.println("Value of var j="+i);
	System.out.println("Value of var c="+c);
	
	}//close of main
}//close of class

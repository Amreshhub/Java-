class home_work
{
	public static void main(String args[])
	{
		byte a=80,b=-20,c=15,d=-5;
		int i=-10;
		a=(byte)(a>>4);//right shift
		System.out.println("Right shifted Value of var a:-"+a);
		b=(byte)(b>>2);//right shift
		System.out.println("Right shifted Value of var b:-"+b);
		i=i>>>24;
		System.out.println("Right shifted Value of var i:-"+i);
		d=(byte)(d<<1);//left shift
		System.out.println("left shifted Value of var d:-"+d);
		
	}
}
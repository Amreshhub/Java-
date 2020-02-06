class home_work
{
	public static void main (String args[])
	{
		byte x=29,y=19,a=-2,z;
		z=(byte)(x&y);//logical AND
		System.out.println("Value in var z:-"+z);
		z=(byte)(x|y);//logical OR
		System.out.println("Value in var z:-"+z);
		z=(byte)(x^y);//exceluse OR
		System.out.println("Value in var z:-"+z);
		a=(byte)(~a);//logical not
		System.out.println("Value in var a:-"+a);
		
	}//close of main
}//close of class
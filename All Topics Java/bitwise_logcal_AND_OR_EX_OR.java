class bitwise_logical_AND_OR_EX_OR
{
	public static void main(String args[])
	{
		byte a=10,b=15,c;
		c=(byte)(a&b);//bitwise logcal AND
		System.out.println("Value in Var a:-"+c);
		c=(byte)(a|b);//bitwise logical OR
		System.out.println("Value in var a:-"+c);
		c=(byte)(a^b);//bitwise exculive OR
		System.out.println("Value in var a:-"+c);
			
	}//close of main
}//close of class
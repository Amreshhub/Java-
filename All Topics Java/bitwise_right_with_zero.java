class bitwise_right_with_zero
{
	public static void main (String args[])
	{
		byte a=127;
		a=(byte)(a>>>6);//right shift field with zero
		System.out.println("Right sifeted value in var a:-"+a);
		int i=-1;
		i=i>>>24;//i>>>=24
		System.out.println("Value sefited in var i:-"+i);
		
	}//close of main
}//close of class

import java.io.*;
class circumface
{
	public static void main(String args[])throws IOException
	{
		double pi= 22.0/7.0;
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter Value of redius:-");
	double red=Double.parseDouble(b.readLine());
	double circum=2*pi*red*red;
	System.out.println("Circumface of given circle:-"+circum);
	}//close of main
}//close of class
//calculat area of righttrangle
import java.io.*;
class right_trangle
{
	public static void main(String args[])throws IOException
	{
		BufferedReader c=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Hight value of rightTrangle:-");
		double h=Double.parseDouble(c.readLine());
		System.out.print("Enter Base value of rightTrangle:-");
		double b=Double.parseDouble(c.readLine());
		double area=1/2.0*b*h;
		System.out.println("Area of given RightTrangle:-"+area);
	
	}//close of main
}//close of class
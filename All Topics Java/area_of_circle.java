import java.io.*;
class area_of_circle
{
	public static void main (String args[]) throws IOException
{
	double pi=22.0/7.0;
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter value of readues:-");
	double red=Double .parseDouble(x.readLine());
	double area=pi*red*red;
	System.out.println("Area of the given circle:="+area);
	
}//close of main
}//close of class
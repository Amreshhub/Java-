//program to input from consol input
import java.io.*;
class consol
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String::-");
		String str=d.readLine();
		System.out.print("Stored String is:-"+str);
		}
}
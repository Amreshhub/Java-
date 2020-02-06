//program based on input two string from consol input
import java.io.*;
class consol2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first String::-");
		String str1=b.readLine();
		System.out.print("Enter Second string::-");
		String str2=b.readLine();
		String str=str1+str2;
		System.out.print("Concatnation String is::-"+str);
		}//close of main
	}//close of class
//INPUT 2
import java.io.*;
class input1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader v=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first String:-");
		String str1=v.readLine();
		System.out.print("Enter second String:-");
		String str2=v.readLine();
		String str=str1+str2;
		System.out.print("Concatnition String is:-"+str);
		}
	}
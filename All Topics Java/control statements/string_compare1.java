//accept two string in console input and chack string are same or not
import java.io.*;
class string_compare1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter frist String::");
		String str1=x.readLine();
		System.out.println("Enter second String::");
		String str2=x.readLine();
		
		if(str1.equals(str2))
			System.out.println("Strin are Same");
		else
			System.out.println("String are not same");
			
	}//close of main
}//close of class
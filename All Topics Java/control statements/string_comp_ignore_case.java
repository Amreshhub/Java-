//accept two string from consol input i.e;system.in chack and display meassege given string same or not
import java.io.*;
class string_comp_ignore_case
{
	public static void main(String args[])throws IOException
	{
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first String::");
		String str1=a.readLine();
		System.out.println("Enter Second String::");
		String str2=a.readLine();
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("String are Same");
		else
			System.out.println("String are not same");
				
	}//close of main
}//close of class
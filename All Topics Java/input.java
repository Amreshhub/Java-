//program beased on  string in put and input to keybord
import java.io.*;
class input
{
	public static void main(String args[]) throws IOException
	{
			
	     BufferedReader c =new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a string::");
	String str=c.readLine();
	System.out.print("Stored string is:-"+str);
	}//close of main
    }//close of  class
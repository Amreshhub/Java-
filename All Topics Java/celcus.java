//accept tempurter in celcus and convert equlavalent farenhite
import java.io.*;
class celcus
{
	public static void main(String args[])throws IOException
	{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Tempurter in Celcus:-");
		double cel=Double.parseDouble(d.readLine());
		double f=9/5.0*cel+32;
		System.out.println("Converted tempretrare inFharrenhite:-"+f);
		
	}//close of main
}//close of class
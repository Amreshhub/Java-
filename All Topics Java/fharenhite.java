//accept tempuractor in Farinet conver into celcus
import java.io.*;
class fharenhite
{
	public static void main(String args[])throws IOException
	{
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter temperture in Faharinet:-");
		double f=Double.parseDouble(d.readLine());
		double ci=9/5.0*f-32;
		System.out.println("Covarted equvalent temperater in celcus:-"+ci);
		
	}//close of main
}//close of main
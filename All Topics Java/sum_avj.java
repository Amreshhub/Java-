//ACCEPT TWO NUMBER FROM CONSOLE INPUT
import java.io.*;
class sum_avj
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter First Num:-");
	double a=Double.parseDouble(f.readLine());
	System.out.print("Enter Second num:-");
	double b=Double.parseDouble(f.readLine());
	double sum=a+b;
	double avg=sum/2.0;
	System.out.println("Sum of two Number:-"+sum);
	System.out.println("Average of two number:-"+avg);
	}//close of main
}//close of class
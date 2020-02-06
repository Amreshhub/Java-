//Accept students record and print 
import java.io.*;
class result
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader h=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter student Enrollment number:-");
		String enroll=(h.readLine());
		System.out.print("Enter student name:-");
		String sname=(h.readLine());
		System.out.print("Enter Student Semester:-");
		String sem=(h.readLine());
		System.out.print("Enter Markes obtant in C language:-");
		double mc=Double.parseDouble(h.readLine());
		System.out.print("Enter Marks Obtanet in C++ Language:-");
		double mcpp=Double.parseDouble(h.readLine());
		System.out.print("Enter markes obtantant in Java language:-");
		double mjava=Double.parseDouble(h.readLine());
		

		double total=mc+mcpp+mjava;
		

	System.out.println("=======Student Result==============");
	System.out.println("Enrollment number	        :"+enroll);
	System.out.println("Student Name	        :"+sname);
	System.out.println("Semester		        :"+sem);
	System.out.println("Markes Obtadent in C	        :"+mc);
	System.out.println("Markes Obtadent in CPP     :"+mc);
	System.out.println("Markes Obtadent in Java     :"+mc);
	System.out.println("----------------------------------------------------");
	System.out.println("Total Marks is	         :"+total);
	}//close of main
}//close of class

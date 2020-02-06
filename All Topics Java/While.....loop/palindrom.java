//accept a String check and display given no is palinodram or not
import java.util.*;
class palindrom
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		 System.out.print("Enter a String:-");
		 
		 String str=x.nextLine();
		 
		 int b=str.length()-1;
		 String rev="";
		 
		 while(b>=0)
		 {
		 	rev=rev+str.charAt(b);
		 	b--;
		 }
		 
		 if(str.equalsIgnoreCase(rev))
		 	System.out.println(str+"is palindrom ");
		 else
		 	System.out.println(str+"is not palindrom ");
		 	
	}//close of main 
}//close of class


//accept a numbar calculate and display Factriol of degit
import java.util.*;
 class for_factriol
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		 int num=x.nextInt();
		 int cnum=num;
		 int fact=1;
		 
		 for(;num>0 ;--num)
		 {
		 	fact=fact*num;
		 }
		 System.out.println(cnum+"Of factriol value is:-"+fact);
		 
		 
	}
}

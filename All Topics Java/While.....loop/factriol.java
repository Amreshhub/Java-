//accept a number and print factriol value
import java.util.*;
class factriol
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		int num=x.nextInt();
		int cnum=num;
		 int f=1;
		 
		 while(num>0)
		 {
		 	 f=f*num;
		 	 	--num;
		 	 	
		 	 	 }
		 	System.out.println(cnum+"Factriol value is"+f);
	}
}
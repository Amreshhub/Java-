//PROGRAM TO DEMONSTRATE THE PRIME NUMBER
import java.util.*;
class PRIME_NO
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number:-");
		int num=x.nextInt();
		
		 int d=2;
		 
		 while(d<=num/2)
		 {
		 	 if(num%d==0)
		 	 	d=num;
		 	 	d++;
		 	 	
		 }
		 if(d>num)
		 	System.out.println(num+"is not prime");
		 else
		 	System.out.println(num+"is   prime");
	}
}
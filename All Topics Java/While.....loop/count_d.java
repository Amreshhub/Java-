//accept a number display total count of degit
import java.util.*;
class count_d
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter  number:-");
		int num=x.nextInt();
		int cnum=num;
		int c=0;
		
		while(num>0)
		{
			num=num/10;
			c++;
			
		}
		System.out.print("Total count of this no "+cnum+"is:-"+c);
	}
}
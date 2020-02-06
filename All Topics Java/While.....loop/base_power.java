//accept base and power value  calculate and display exponiotion value

import java.util.*;
class base_power
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Value of base:-");
		int base=x.nextInt();
		System.out.print("Enter Value of power:-");
		int power=x.nextInt();
		
		int y=1,d=1;
		while(d<=power)
		{
			y=y*base;
			d++;
		}
		System.out.println("Value of exponition is:-"+y);
		
	}
}
		
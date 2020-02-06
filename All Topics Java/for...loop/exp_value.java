//ACCEPT  BASE AND POWER CALCULATE AND DISPLAY EXPONITION VALUE
import java.util.*;
class exp_value
{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		
	System.out.print("Enter Value of Base:-");
	int base=a.nextInt();
	
	System.out.print("Enter Value of Power:-");
	int power=a.nextInt();
	int exp=1;
	
	for(int i=1;i<=power;i++)
	{
		exp=exp*base;
	}
		System.out.println("Exponition value is:-"+exp);
	}//close of main
}//close of class	
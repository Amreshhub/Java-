//Accept base and power calculate and display Exxponition value
import java.util.*;
class exp_value
{
	public static void main(String args[]){
	
		Scanner a=new Scanner(System.in);
		
	System.out.print("Enter Base Value:-");
	int base =a.nextInt();
	
	System.out.print("Enter power Value:-");
	int power =a.nextInt();
	
	int exp=1;
	
	for(int i=1;i<=power;exp=exp*base,i++);
	System.out.println("Exponitiuon valoe is:-"+exp);
	
	
}//close of main
}//close of class
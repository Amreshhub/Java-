//Accept  a number  calucate and display sum of degit along with reverse
import java.util.*;
class exp_value
{
	public static void main(String args[]){
	
		Scanner a=new Scanner(System.in);
		
	System.out.print("Enter a nunber:-");
	int num =a.nextInt();
	
    int sum=0,rev=0;
    
    for(int d=0;num>0;d=num%10,sum=sum+d,rev=rev*10+d,num=num/10);
    
    System.out.println("sum of degit:-"+sum);
    System.out.println("Reverse Value:-"+rev);
	}//close of main
}//close of class
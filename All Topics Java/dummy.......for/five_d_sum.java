//acppt five degit number calculate and display sum and along with rev
import java.util.*;
class five_d_sum
{
	public static void main(String args[]){
	
		Scanner a=new Scanner(System.in);
		
	System.out.print("Enter a nunber:-");
	int num =a.nextInt();
	
    int sum=0,cnum=num,ctr=0,rev=0;
    for(;num>0;num=num/10,ctr++);
 if(ctr==5) 
  {
    for(int d=0;cnum>0;d=cnum%10,sum=sum+d,rev=rev*10+d,cnum=cnum/10);
    	System.out.println("sum of    degit:-"+sum);
	System.out.print("Reverse order is:-"+rev);
}else
    System.out.println("INVALIED DEGIT FOUND PLZ ENTER FIVE DEGIT NO ONLY");
}//close of main
}  //close of class
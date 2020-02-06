//Accept  a number  check and display given number is palindrom or not
import java.util.*;
class palindrom
{
	public static void main(String args[]){
	
		Scanner a=new Scanner(System.in);
		
	System.out.print("Enter a nunber:-");
	int num =a.nextInt();
	
    int rev=0,cnum=num;    
    for(int d=0;num>0;d=num%10,rev=rev*10+d,num=num/10);
    
    if(rev==cnum)
    	System.out.println(cnum+ " is palindrom no");
    else
    	System.out.println(cnum+ "is not palindrom no");
	}//close of main
}//close of class
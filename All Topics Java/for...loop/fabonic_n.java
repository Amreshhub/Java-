//accept term display fabonic serise

import java.util.*;
class exp_value
{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		
	System.out.print("How many term you want:-");
	int n=a.nextInt();
	
	int term=0;
	
	for(int i=0,h=1,t=0;i<=n;i++)
	{
		System.out.print(+term  );
		  
		  t=h;
		  h=term;
		  term=h+t;
	}
	}
}
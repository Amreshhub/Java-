//accept n number and disply fabonic serise

import java.util.*;
class fabonic_s
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter How many time do you want:-");
		int n=x.nextInt();
		int h=0,t=1,tr=0,d=0;
		
		while(d<=n)
		{
			System.out.print(+tr  );
			h=t;
			t=tr;
			tr=h+t;
			
			d++;
		}
	
      }
}//close of class
	
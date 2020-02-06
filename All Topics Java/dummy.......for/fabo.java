//accept  n tream and print fabonic
import java.util.*;
class fabo
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter how many tream do you want:-");
		int n=a.nextInt();
		
		int tr=0;
		for(int  h=1,t=0,ctr=1;ctr<=n;t=h,h=tr,tr=h+t,ctr++)
	
		System.out.print( +tr  );
	}
}
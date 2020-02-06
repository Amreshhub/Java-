//accept n number calculate and display fabonic serise
import java.util.*;
class fabonic
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("How many term do you want:-");
		int n=x.nextInt();
		 int tr=0,i=0,h=0,t=1;
		 
		 while(i<=n)
		 	
		 {
		 	System.out.print(+tr  );
		 	h=t;
		 	t=tr;
		 	tr=h+t;
		 	i++;
		 }
	}
}
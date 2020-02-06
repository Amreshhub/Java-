
//accept 2 numbar calculate and display HCF
import java.util.*;
 class hcf_for__loop
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter inital number:-");
		 int i=x.nextInt();
		System.out.print("Enter inital number:-");
		 int f=x.nextInt();
		 int t,hcf=0;
		if(f<i)
		{
			t=i;
			i=f;
			f=t;
			
		}
		for(int d=1;d<=i;d++)
		{
			if(i%d==0&&f%d==0)
				hcf=d;
				
		}
		 System.out.println("Hifhest comman factor is:-"+hcf);
		 
		 
	}
}

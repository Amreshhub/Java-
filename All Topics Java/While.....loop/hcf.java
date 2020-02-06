//accept two no check and display the highest comain facter
import java.util.*;
class hcf
{
	public static void main(String rags[]){
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter inital number:-");
		int num=x.nextInt();
		System.out.print("Enter fanil number:-");
		int num2=x.nextInt();
		int t,hfc=0;
		if(num>num2){
			t=num;
			num=num2;
			num2=t;}
			int d=1;
		while(d<=num){
		 if(num%d==0&&num2%d==0)
		 {
		 	hfc=d;
		 	 d++;
		 	 	
		 	 	 }
		}
		 	System.out.println("Total hcf is:-"+hfc);
	}
}
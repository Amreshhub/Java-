//accept no in dynamicully allocate irragular matrix calculate and display the sum and average value?
import java.util.*;
class dynimic_sum_avg
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter how many row you want:-");
		int row=x.nextInt();
		double num[][]=new double[row][];
		int ctr=0,col,r,c;
		double sum=0.0,avg=0.0;
		
		
		for(ctr=0;ctr<row;ctr++){
			System.out.print("Enter columan dimmision for row no"+ctr+" ");
			col=x.nextInt();
			num[ctr]=new double [col];
			}
			System.out.print("Insert value irreguraler matrix");
			for(r=0;r<row;r++){
				System.out.println("Enter row value"+(r+1));
			for(c=0;c<num[r].length;c++){
				ctr++;
				System.out.print("Enter number"+(c+1)+":-");
				num[r][c]=x.nextInt();
				sum=sum+num[r][c];
						
			}	
				}
			avg=sum/ctr;
			System.out.println("Sum of irregular matrix:-"+sum);
			System.out.println("Average value of irregular matrix:-"+avg);
			
	}//close of main
}//close of class
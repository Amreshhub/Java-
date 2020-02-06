//accept MxN matrix n numbers calculate and display sum and average value?
import java.util.*;
class sum_avg
{
	public static void main (String[] args) {
		Scanner x=new Scanner(System.in);
	int r,c;
	
	System.out.print("Enter size of Row/dimminson:-");
	int m=x.nextInt();
	System.out.print("Enter size of columan Dimmision:-");
	int n=x.nextInt();
	double num [][]=new double [m][n];
	double sum=0,avg;
	
	for(r=0;r<m;r++){
		System.out.println("Enter row value::"+(r+1));
	for(c=0;c<n;c++){
		System.out.print("Enter number:-"+(c+1)+"   ");
		num[r][c]=x.nextDouble();
		sum=sum+num[r][c];	
	}		
	}
avg=sum/(m*n);
System.out.println("Sum of "+(m*n)+"matrix="+sum);
System.out.println("Average of"+(m*n)+"matrix="+avg);
}//close of main
}//close of class
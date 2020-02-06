//ACCEPT  NUMBER IN IRREGULAR MATRIX CONSIST COLUMAN 2,4 AND 6 RESEPICTULLY CALCULATE AND PRINT SUM AND AVERAGE VALUE OF ELEMENT?
import java.util.*;
 class sum_avg
 {
 	public static void main(String args[])
 	{
 		Scanner x=new Scanner(System.in);
 		
 		int r,c;
 	double num[][]=new double [3][];
 	num[0]=new double[2];
 	num[1]=new double[4];
 	num[2]=new double[6];
 	 int ctr=0;
 	 double sum=0.0,avg=0.0;
 	for(r=0;r<3;r++){
 		System.out.println("Enter row value"+(r+1));
 	for(c=0;c<num[r].length;c++){
 		System.out.print("Enter number"+(c+1)+":-");
 		num[r][c]=x.nextInt();
 		sum=sum+num[r][c];
 		ctr++;	
 	}
 	}
 	 avg=sum/ctr;
 	 System.out.println("sum of irregular matrix is:-"+sum);
 	 System.out.println("Average value of matrix is:-"+avg);
 	}//close of main
 }//close of class
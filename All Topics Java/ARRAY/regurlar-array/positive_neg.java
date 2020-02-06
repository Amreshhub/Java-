//accept MxN matrix n numbers chack and display total count of positive and negativ?
import java.util.*;
class positive_neg
{
	public static void main (String[] args) {
		Scanner x=new Scanner(System.in);
	int r,c;
	
	System.out.print("Enter size of Row/dimminson:-");
	int m=x.nextInt();
	System.out.print("Enter size of columan Dimmision:-");
	int n=x.nextInt();
	int num [][]=new int[m][n];
	int p=0,ne=0;
	
	for(r=0;r<m;r++){
		System.out.println("Enter row value::"+(r+1));
	for(c=0;c<n;c++){
		System.out.print("Enter number"+(c+1)+":-"+"   ");
		num[r][c]=x.nextInt();
		if(num[r][c]<0)
			ne++;
		else
			p++;	
	}		
	}

System.out.println("Total count of "+(m*n)+"matrix in Positive number:-"+p);
System.out.println("Total count of "+(m*n)+"matrix in Negativ number:-"+ne);

}//close of main
}//close of class
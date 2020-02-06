//accept MxN matrix n numbers calculate and display total count of even and odd?
import java.util.*;
class even_odd
{
	public static void main (String[] args) {
		Scanner x=new Scanner(System.in);
	int r,c;
	
	System.out.print("Enter size of Row/dimminson:-");
	int m=x.nextInt();
	System.out.print("Enter size of columan Dimmision:-");
	int n=x.nextInt();
	int num [][]=new int[m][n];
	int even=0,odd=0;
	
	for(r=0;r<m;r++){
		System.out.println("Enter row value::"+(r+1));
	for(c=0;c<n;c++){
		System.out.print("Enter number"+(c+1)+":-"+"   ");
		num[r][c]=x.nextInt();
		if(num[r][c]%2==0)
			even++;
		else
			odd++;	
	}		
	}

System.out.println("Total count of "+(m*n)+"matrix in Even number:-"+even);
System.out.println("Total count of "+(m*n)+"matrix in Odd number:-"+odd);

}//close of main
}//close of class
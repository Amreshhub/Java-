//accept two mxn  matrix n numbers calculate and display sum in matrix?
import java.util.*;
class matrix_sum
{
	public static void main (String[] args) {
		Scanner x=new Scanner(System.in);
	int r,c;
	System.out.print("Enter size of Row/dimminson matrix1:-");
	int m=x.nextInt();
	System.out.print("Enter size of columan Dimmision matrix1:-");
	int n=x.nextInt();
	int mat1 [][]=new int[m][n];
	
	System.out.print("Enter size of Row/dimminson matrix2:-");
	 m=x.nextInt();
	System.out.print("Enter size of columan Dimmision matrix2:-");
	 n=x.nextInt();
	int mat2 [][]=new int[m][n];
	int sum [][]=new int[m][n];
	
	System.out.print("Insert First matrix");
	for(r=0;r<m;r++){
		System.out.println("Enter row value::"+(r+1));
	for(c=0;c<n;c++){
		System.out.print("Enter number"+(c+1)+":-"+"   ");
		mat1[r][c]=x.nextInt();
	}
	}
	
	System.out.print("Insert Second matrix");
		for(r=0;r<m;r++){
		System.out.println("Enter row value::"+(r+1));
		for(c=0;c<n;c++){
		System.out.print("Enter number"+(c+1)+":-"+"   ");
		mat2[r][c]=x.nextInt();
	}
	}
	
	System.out.print("summition of under process");
	for(r=0;r<m;r++)
	for(c=0;c<n;c++)
		sum[r][c]=mat1[r][c]+mat2[r][c];	
	
		
			
	
System.out.println("Displaying first matrix::");
for(r=0;r<m;r++){
	System.out.print("\n");

for(c=0;c<n;c++){
	System.out.print("["+r+"]["+c+"]="+mat1[r][c]+"   ");
}
}
System.out.println("Displaying second matrix::");
for(r=0;r<m;r++){
	System.out.print("\n");

for(c=0;c<n;c++){
	System.out.print("["+r+"]["+c+"]="+mat2[r][c]+"   ");
}
}
System.out.println("Displaying summition matrix::");
for(r=0;r<m;r++){
	System.out.print("\n");

for(c=0;c<n;c++){
	System.out.print("["+r+"]["+c+"]="+sum[r][c]+"   ");
}
}

}//close of main
}//close of class
//accept nXn squaIr matrix n numbers calculate and TRANSPOSE OF MATRIX?
import java.util.*;
class transpose
{
	public static void main (String[] args) {
		Scanner x=new Scanner(System.in);
	int r,c;
	
	System.out.print("Enter size of square/dimminson matrix:-");
	int n=x.nextInt();
	int num [][]=new int[n][n];
	int tran [][]=new int[n][n];
	for(r=0;r<n;r++){
		System.out.println("Enter row value::"+(r+1));
	for(c=0;c<n;c++){
		System.out.print("Enter number"+(c+1)+":-"+"   ");
		num[r][c]=x.nextInt();
	}
	}
		for(r=0;r<n;r++)
		for(c=0;c<n;c++)
		tran[c][r]=num[r][c];
		
			
	
System.out.print("Displaying orignal matrix::");
for(r=0;r<n;r++){
	System.out.print("\n");

for(c=0;c<n;c++){
	System.out.print("["+r+"]["+c+"]="+num[r][c]+"   ");
}
}
System.out.print("Displaying transpose matrix::");
for(r=0;r<n;r++){
	System.out.print("\n");

for(c=0;c<n;c++){
	System.out.print("["+r+"]["+c+"]="+tran[r][c]+"   ");
}
}

}//close of main
}//close of class
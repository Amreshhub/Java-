//accept nXn squar matrix n numbers calculate and display sum od diognal element ?
import java.util.*;
class diogonal
{
	public static void main (String[] args) {
		Scanner x= new Scanner(System.in);
	int r,c;
	
	System.out.print("Enter size of square/dimminson matrix:-");
	int n=x.nextInt();
	int num [][]=new int[n][n];
	int fdig=0,bdig=0;
	for(r=0;r<n;r++){
		System.out.println("Enter row value::"+(r+1));
	for(c=0;c<n;c++){
		System.out.print("Enter number"+(c+1)+":-"+"   ");
		num[r][c]=x.nextInt();
	if(r==c)
		fdig=fdig+num[r][c];
	if(r+c==n-1)
		bdig=bdig+num[r][c];	
	}		
	}
System.out.print("Displaying reguraler matrix::");
for(r=0;r<n;r++){
	System.out.print("\n");

for(c=0;c<n;c++){
	System.out.print("["+r+"]["+c+"]="+num[r][c]+"   ");
}
}


System.out.println("Sum of farword dioganal:-"+fdig);
System.out.println("Sum  of backword Digonal:-"+bdig);

}//close of main
}//close of class
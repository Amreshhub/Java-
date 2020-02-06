//accept MxN matrix n numbers chack and display high and list no with row and columan ?
import java.util.*;
class high_list
{
	public static void main (String[] args) {
		Scanner x=new Scanner(System.in);
	int r,c;
	
	System.out.print("Enter size of Row/dimminson:-");
	int m=x.nextInt();
	System.out.print("Enter size of columan Dimmision:-");
	int n=x.nextInt();
	int num [][]=new int[m][n];
	int high,list,hr,hc,lr,lc;
	high=list=hr=hc=lr=lc=0;
	for(r=0;r<m;r++){
		System.out.println("Enter row value::"+(r+1));
	for(c=0;c<n;c++){
		System.out.print("Enter number"+(c+1)+":-"+"   ");
		num[r][c]=x.nextInt();
		if(r==0&&c==0)
			high=list=num[r][c];
	else if(num[r][c]>high)
			high=num[r][c];
			hr=r;hc=c;
		if(num[r][c]<list)
			list=num[r][c];
			lr=r;lc=c;	
	}		
	}
System.out.print("Displaying reguraler matrix::");
for(r=0;r<m;r++){
	System.out.print("\n");

for(c=0;c<n;c++){
	System.out.print("["+r+"]["+c+"]="+num[r][c]+"   ");
}
}


System.out.println("Highest value of at position["+hr+"]["+hc+"]="+high);
System.out.println("Smollest value of at position["+lr+"]["+lc+"]="+list);

}//close of main
}//close of class
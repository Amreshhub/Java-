//accept no in dynamicully allocate irragular matrix check  and display total count of even and odd  number?
import java.util.*;
class high_list
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter how many row you want:-");
		int row=x.nextInt();
		int num[][]=new int[row][];
	 
		int even=0,odd=0,ctr,r,c,col;
		
		
		for(ctr=0;ctr<row;ctr++){
			System.out.print("Enter columan dimmision for row no"+ctr+" ");
			col=x.nextInt();
			num[ctr]=new int[col];
			}
			System.out.print("Insert value irreguraler matrix");
			for(r=0;r<row;r++){
				System.out.println("Enter row value"+(r+1));
			for(c=0;c<num[r].length;c++){
				System.out.print("Enter number"+(c+1)+":-");
				num[r][c]=x.nextInt();
				if(num[r][c]<=0){
					System.out.print("Must inter positive number");
					c=c-1;
					continue;
				}
				if(num[r][c]%2==0)
					even++;
				else
					odd++;
						
			}	
				}
				System.out.print("Displaying irreguraler matrix");
			for(r=0;r<row;r++){
				System.out.println("\n");
			for(c=0;c<num[r].length;c++){
				System.out.print("["+r+"]["+c+"]="+num[r][c]+"  ");
			}
			}
			System.out.println("Total count of Even number is:-"+even);
			System.out.println("Total count of odd number is:-"+odd);
			
	}//close of main
}//close of class
//accept no in dynamicully allocate irragular matrix check  and display highest and list value with row and columan no?
import java.util.*;
class high_list
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter how many row you want:-");
		int row=x.nextInt();
		int num[][]=new int[row][];
	 
		int high=0,low=0,ctr,hr=0,hc=0,lr=0,lc=0,r,c,col;
		
		
		for(ctr=0;ctr<row;ctr++){
			System.out.print("Enter columan dimmision for row no"+ctr+" ");
			col=x.nextInt();
			num[ctr]=new int[col];
			}
			System.out.print("Insert value irreguraler matrix");
			for(r=0;r<row;r++){
				System.out.println("Enter row value"+(r+1));
			for(c=0;c<num[r].length;c++){
				ctr++;
				System.out.print("Enter number"+(c+1)+":-");
				num[r][c]=x.nextInt();
				if(r==0&&c==0)
				
					high=low=num[r][c];
				else if(num[r][c]>high){
					high=num[r][c];
					hr=r;hc=c;}
					else if(num[r][c]<low){
						low=num[r][c];
						lr=r;lc=c;
					}				
			}	
				}
				System.out.print("Displaying irreguraler matrix");
			for(r=0;r<row;r++){
				System.out.println("\n");
			for(c=0;c<num[r].length;c++){
				System.out.print("["+r+"]["+c+"]="+num[r][c]+"  ");
			}
			}
			System.out.println("Highest value is found it["+hr+"]["+hc+"]="+high);
			System.out.println("Lowest value is found it["+lr+"]["+lc+"]="+low);
			
	}//close of main
}//close of class
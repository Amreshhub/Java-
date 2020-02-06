//wap a java application accept number in  inregurlar matrix form siz 3 rows with 1,2and 3 recepctly and print same?
 import java.util.*;
 class inmatrix
 {
 	public static void main(String args[])
 	{
 		Scanner x=new Scanner(System.in);
 	int num[][]=new int[3][];
 	 num[0]=new int[1];
 	 num[1]=new int[2];
 	 num[2]=new int[3];
 	int r,c;
 	for(r=0;r<3;r++){
 	System.out.println("Inset Row Value"+r);
 	for(c=0;c<num[r].length;c++){
 		System.out.println("Enter number:-");
 		num[r][c]=x.nextInt();
 		
 	}
 	}
 	System.out.println("Displaying array index/elements");
 	for(r=0;r<3;r++){
 		System.out.print("\n");
 		for(c=0;c<num[r].length;c++)
 			System.out.print(num[r][c]+"  ");
 	}
 }//close of main
 }//close of class
//wap a java application accept number in regurlar matrix form siz is 2X3 and print same?
 import java.util.*;
 class matrix
 {
 	public static void main(String args[])
 	{
 		Scanner x=new Scanner(System.in);
 	int num[][]=new int[2][3];
 	int r,c;
 	for(r=0;r<2;r++){
 	System.out.println("Inset Row Value"+r);
 	for(c=0;c<num[r].length;c++){
 		System.out.println("Enter number:-");
 		num[r][c]=x.nextInt();
 		
 	}
 	}
 	System.out.println("Displaying array index/elements");
 	for(r=0;r<2;r++){
 		System.out.print("\n");
 		for(c=0;c<num[r].length;c++)
 			System.out.print(num[r][c]+"  ");
 	}
 }//close of main
 }//close of class
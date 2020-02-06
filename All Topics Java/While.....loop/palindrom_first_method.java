//accept a string check and display the given string palindrom or not
import java.util.*;
 class palindrom_first_method 
 {
 	public static void main(String args[])
 	{
 		Scanner x=new Scanner(System.in);
 		System.out.print("Enter a String:-");
 		String str=x.nextLine();
 		
 		String rev="";
 		char ch;
 		int i=0;
 		
 		while(i<str.length()){
 		
 			
 			ch=str.charAt(i);
 			rev=ch+rev;
 			i++;
 	}
 	if(str.equalsIgnoreCase(rev))
 		System.out.println(str+"is palindrom ");
		 else
		 	System.out.println(str+"is not palindrom ");
		 	

 }
 }//close of class

   
    
    

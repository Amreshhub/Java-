//Example to show Arithmatic Exception  handle by user
import java.util.*;
class arithmatic_exception{
	public static void main(String args[]){
int nr,dr,re;
Scanner x=new Scanner(System.in);
do{
System.out.print("Enter the nomnater value:-");
nr=x.nextInt();
do{
if(nr==0)
break;
System.out.print("Enter the Dnomnater value:-");
dr=x.nextInt();
try{
if(dr==0)
throw new ArithmeticException("Dived by zero");
re=nr/dr;
System.out.println("Result:-"+re);
}//close of try
catch(ArithmeticException e){
e.printStackTrace();
System.out.println(e.toString());
System.out.println(e.getMessage());
}//close of catch
}while(dr==0);
}while(nr==0);
}//close of main
}//close of class

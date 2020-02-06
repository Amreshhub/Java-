import java.io.*;
class sumkey
{
public static void main(String args[]){
int a,b,c;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print("\nEnter first number:");
a=Integer.ParseInt(d1.readLine());
System.out.print("\nEnter second number:");
b=Integer.ParseInt(d1.readLine());
c=a+b;
System.out.print("\nsum="+c);
}
catch(Exception e)
{
}
}
}


		
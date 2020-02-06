import java .io.*;
class  chackhigh
{
public static void main(String args[]) throws ioException
{
int a,b,c;
InputStreamReader a1=new InputStreamReader(System.in);
BufferedReader a2=new BufferedReader(a1);

System.out.print("Enter Farst no:-");
a=Integer.ParseInt(a2.readLine());
System.out.print("Enter second no:-");
b=Integer.ParseInt(a2.readLine());
System.out.print("Enter threadn no:-");
c=Integer.ParseInt(a2.readLine());

if(a>b)
	if(a>c)
	         System.out.print("Highest no:-"+a);
	else
	      System.out.print("Highest no:-"+c);
else
if(b>c)
            System.out.print("Highest no:-"+b);
else
            System.out.print("Highest no:-"+c);
}
}   
		




import java.io.*;
class empolly
{
public static void main(String args[]) throws IOException
{
String ename=new String();
long ecode;
float basic,da,ma=500.00f,hra,gross,itax,net;
InputStreamReader e1=new InputStreamReader(System.in);
BufferedReader e2=new BufferedReader(e1);

System.out.print("\nEnter Empollye name=");
ename=e2.ReadLine();


System.out.print("\nEnter Empollye code=");
ecode=Long.parseLong(e2.ReadLine());


System.out.print("\nEnter Empollye Basic pay in Rs:=");
basic=Float.valueof(e2.ReadLine()).floatvalue();

if(basic>=10000)

da=basic*20/100;
else
da=basic*15/100;

if(basic>=15000)

hra=basic*10/100;
else
hra=basic*9/100;
gross=basic+da+hra+ma;
if(gross>=20000)

itax=gross*12/100;
else
itax=0;
net=gross-itax;


System.out.print("\n=====================================");
System.out.print("\n Empollye name:="+ename);
System.out.print("\n Empollye code:="+ecode);
System.out.print("\nEmpollye Basic  in Rs:="+basic);
System.out.print("\n Empollye Dearrness allowance  in Rs:="+da);
System.out.print("\n Empollye House rent allowance  in Rs:="+hra);
System.out.print("\n Empollye madicale in Rs:="+ma);
System.out.print("\n=====================================");
System.out.print("\nGross/Total salary in Rs:"+gross);
System.out.print("\nIncometax Deduction in Rs="+itax);
System.out.print("\n=====================================");
System.out.print("\nNet salary amount in Rs="+net);
}
}









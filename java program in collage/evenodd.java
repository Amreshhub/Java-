import  java.lang.*;
class evenodd
{
public static void main(String args[]){

int a,ne=0,no=0,se=0,so=0;
System.out.print("\nEven\t\t\t\todd");
for(a=1;a<=20;a++)
{
if(a%2==0)
{
System.out.print("\n"+a);
ne=ne+1;
se=se+a;
}
else
{
System.out.print("\n\t\t\t\t"+a);
no=no+1;
so=so+a;
}
}
}
}
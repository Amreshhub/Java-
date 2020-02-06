import java.lang.*;
class nesting
{
public static void main(String args[]){
int a,b;
for(a=1;a<=3;a++)
{
	System.out.print("\na="+a);
for(b=1;b<=3;b++)
{
	System.out.print("\na="+a);
for(b=1;b<=3;b++)
{
	System.out.print("\nb="+b);
}
}
}
}
}
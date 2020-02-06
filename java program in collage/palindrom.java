import java.lang.*;
class palindrom
{
public static void main(String args[]){
int num=111,cnum,rev=0,d;
cnum=num ;
while(num>0)
{
	d=num%10;
	rev=rev*10+d;
	cnum=cnum/10;
}
if(cnum==rev)
	System.out.print("Given no is palindrom"+num);
else
	System.out.print("Given no is not palindrom"+num);
}
}
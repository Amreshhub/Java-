import java.lang.*;
class dsum
{
public static void main(String args[]){
int num,sum=0,cnum,d;
num=Integer.ParstInt(0);
cnum=num;
while(num>0)
{
	d=num%10;
	sum=sum+d;
	cnum=cnum/10;
}

	System.out.print("Sum of degite"+sum);

}
}

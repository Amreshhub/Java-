//chack highest value within three number
import java.lang.*;
class highest
{
public static void main(String args[]){
int a=2,b=0,c=8;
if(a>b)
	if(a>c)
	     System.out.print("Highest value="+a);

	else
	   System.out.print("Highest value="+c);
else if(b>c)
           System.out.print("Highest value="+b);
        else
           System.out.print("Highest value="+c);
}
}
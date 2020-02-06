import java.lang.*;
class psquare
{
public static void main(String args[]){
int n,d=1,q,r,c=0;
n=Integer.ParseInt(args[0]);
while(d<=n)
{
q=n/d;
r=n%d;
if(d==q&&r==0)
{
System.out.print("\nNumer is perfact square");
c=1;
break;
}
d=d+1;
}
if(c==0)
{
System.out.print("\nNumber is not perfacet square");
}
}
}
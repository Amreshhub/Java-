import java.awt.*;
import java.applet.*;
 public class table extends Applet
{
	public void paint(Graphics g)
{
	int  n=5,pr,r=40,c=50;
	int a;
	         
	for(a=1;a<=10;a++)
	{
		pr=n*a;
		g.drawString(String.valueOf(n)+"*"+String.valueOf(a)+"="+String.valueOf(pr),r,c);
			c=c+20;
		}//close of for
			}//close of paint
	
}//close of class
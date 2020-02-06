//program based on applet life cycle
import java.awt.*;
import java.applet.*;
public class h extends Applet
{	
	int a,b,c,d;
	public void init()
	{
		a=2;
		b=3;
		c=4;
		d=6;
	}//close of init()
		public void paint(Graphics g)
		{
			if(a>b)
			{
				if(a>c)
				{
					if(a>d)
					{
						g.drawString("Highest num="+String.valueOf(a),40,50);
						}
					else
					{
						g.drawString("Highest num="+String.valueOf(d),40,50);
						}
				}else if(c>d)
				          {
					g.drawString("Highest num="+String.valueOf(c),40,50);
					}
				          else{
					g.drawString("Highest num="+String.valueOf(d),40,50);
					}
			}else if(b>c)
			          {
				 if(b>d)
				 {
					g.drawString("Highest num="+String.valueOf(b),40,50);
					}
				else{
					g.drawString("Highest num="+String.valueOf(d),40,50);
					}
          			           }else if(c>d)
				{
					g.drawString("Highest num="+String.valueOf(c),40,50);
					}
				else{
					g.drawString("Highest num="+String.valueOf(d),40,50);
					}
     			}//close of  paint()
				}//close of class						
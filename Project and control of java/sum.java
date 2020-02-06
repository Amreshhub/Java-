//PROGRAM BASED ON APPLET LIFE CYCLE
import java.awt.*;
import java.applet.*;
public class sum extends Applet
{
		int a,b,c;
        	public void init()
	{
	a=10; 
	b=10;
	}//close of init()
		public void start(){
		c=a+b;
		}//close of start()
			public void paint(Graphics g)
			{
				g.drawString("Sum of two number="+String.valueOf(c),40,50);
				}//close of paint()
					}//close of class
			

			
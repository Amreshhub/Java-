//accept from web page to redus value of a circal calcluate  and print area of given circal
import java.awt.*;
import java.applet.*;
public class area extends Applet
{
	float red,a,pi;
public void init()
{
	pi =22/7;
red=Float.valueOf(getParameter("num1"));
}//close of init()
	public void strat()
	{
	a=pi*red*red;
		}//close of strat()
public void paint(Graphics g)
{
	g.drawString("Area of given circal ="+String.valueOf(a),40,50);
}//close of paint()
}//close of class

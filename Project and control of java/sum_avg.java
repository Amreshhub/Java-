//accept two number from web page and display sum and average
import java.awt.*;
import java.applet.*;

public class sum_avg extends Applet
{
	float sum,avg,a,b;
public void init()
{
	a=Float.valueOf(getParameter("num1"));
	b=Float.valueOf(getParameter("num2"));
}//close of init()
public void start()
{
	sum=a+b;
	avg=sum/2;
}//close of strat()
public void paint(Graphics g)
{
	g.drawString("Sum of two number="+String.valueOf(sum),40,50);
	g.drawString("Average value of two number="+String.valueOf(avg),40,60);
}//close of paint()
}//close of class
	
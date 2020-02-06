import java.awt.*;
import java.applet.*;
public  class interst extends Applet
{
	int p,r,t ,in;
public void init(){
p=Integer.parseInt(getParameter("num1"));
r=Integer. parseInt(getParameter("num2"));
t=Integer.parseInt(getParameter("num3"));

}//close of init()
public void start(){
in=(p*r*t)/100;
}
public void paint(Graphics g)
{
	g.drawString("Simple interast="+String.valueOf(in),40,50);
	}//close of paint
}//close of class




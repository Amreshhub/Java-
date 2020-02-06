import java.awt.*;
import java.applet.*;
public class e extends Applet
{
	String name,corse;
	int roll;
	long enroll;
	float fee;
public void init()
{
	name=(getParameter("num1"));
	corse=(getParameter("num2"));
	roll=Integer.parseInt(getParameter("num3"));
	enroll=Long.parseLong(getParameter("num4"));
	fee=Float.valueOf(getParameter("num5"));
}
public void paint(Graphics g)
{
	g.drawString("name:-"+String.valueOf(name),40,40);
	g.drawString("Coruse:-"+String.valueOf(corse),40,60);
	g.drawString("Roll:-"+String.valueOf(roll),40,80);
	g.drawString("Enroll:-"+String.valueOf(enroll),40,100);
	g.drawString("Fee:-"+String.valueOf(fee),40,120);
}//close of paint()

}//close of class



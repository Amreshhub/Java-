//program based on student record
import java.awt.*;
import java.applet.*;
public class student1 extends Applet
{
String sname,course;
	long roll;
	float fee;
	
public void init()
{
sname=(getParameter("n"));
course=(getParameter("c"));
roll=Long.parseLong(getParameter("r"));
fee=Float.valueOf(getParameter("f"));
}//close of init()
//public void start()
//{

//}//close of start
public void paint(Graphics g)
{
	g.drawString("*******************Student record***************",40,50);
	g.drawString("Student name:-                              " +String.valueOf(sname),40,60);
	g.drawString("Student course:-                            " +String.valueOf(course),40,70);
	g.drawString("Student roll:-                                 " +String.valueOf(roll),40,80);
	g.drawString("Student fee:-                                    " +String.valueOf(fee),40,90);
	g.drawString("***********************************************",40,100);
}//close of paint()
	}//close of class

	

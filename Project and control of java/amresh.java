import java.awt.*;
import java.applet.*;
public class  amresh extends Applet
{
	String  sname,course;
	Float fee,roll;
	TextField t1,t2,t3,t4;
public void init()
{
	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);
	t4=new TextField(10);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
}//close of init()
public void paint(Graphics g)
{
	g.drawString("Enter value of each box",40,50);
	sname=(t1.getText());
	course=(t2.getText());
	fee=Float.valueOf(t3.getText());
	roll=Float.valueOf(t4.getText());
g.drawString("*******************Student record*******************",40,60);
g.drawString("Student name:-                                  "+sname,40,70);
g.drawString("Student course:-                                  "+course,40,80);
g.drawString("Student fee:-                                  "+fee,40,90);
g.drawString("Student roll:-                                  "+roll,40,100);
g.drawString("***************************************************",40,110);

}//close of paint()
public boolean action(Event e,Object obj)
{
	repaint();
	return(true);
}
}//close of class

	
	
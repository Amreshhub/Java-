import java.awt.*;
import java.applet.*;
public class name extends Applet
{
String name;
TextField o1;
public void init()
{
	o1=new TextField(20);
	add(o1);
}
public void paint(Graphics g)
{	
g.drawString("NAME",40,50);
name=(o1.getText());
g.drawString("Student Name:-"+String.valueOf(name),40,60);
}
public boolean action (Event f,Object obj)
{
	repaint();
	return(true);
}
}

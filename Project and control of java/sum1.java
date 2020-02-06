import java.awt.*;
import java.applet.*;
public class  add extends Applet
{
	int a,b,c;
	TextField t1,t2;
    public void init()
{
	t1=new TextField(10);
	t2=new TextField(10);
	add(t1);
	add(t2);
}
     public void paint(Graphics g)
{
	g.drawString("Input value in each box",40,50);
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	c=a+b;
g.drawString("Sum"+String.valueOf(c),30,50);
}
public boolean action(Event e, Object obj)
{
	repaint();
	return(true);
}
}
	

import java.awt.*;
import java.applet.*;
public class  g extends Applet
{
	int  a,b,c;
	TextField  t1,t2,t3;
public void init()
{
	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);
	add(t1);
	add(t2);
	add(t3);
}

public void paint(Graphics g)
{
	g.drawString("Enter the sepret value for each box",40,40);
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	c=Integer.parseInt(t3.getText());
	if(a>b)
	{
		if(a>c)
		{
			g.drawString("Highest number="+String.valueOf(a),40,50); 
		}
		else{
			g.drawString("Highest number="+String.valueOf(c),40,50);
			}
	}else if(b>c)
		{
			g.drawString("Highest number="+String.valueOf(b),40,50);
		}
	          else{
			g.drawString("Highest number="+String.valueOf(c),40,50);
		}
}//close of paint()
public boolean action(Event d,Object f)
{
	repaint();
	return(true);
}
}//close of class			
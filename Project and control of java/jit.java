import java.awt.*;
import java.applet.*;
public class jit extends Applet
{
	Font f1;
public void init()
{
	f1=new Font("Arial",Font.BOLD,30);
}
	public void paint(Graphics g)
{
	g.setFont(f1);
	g.drawString("AMRESH",30,10);
}
}
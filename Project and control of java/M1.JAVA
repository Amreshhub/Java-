import java.awt.*;
import java.applet.*;
public class m1 extends Applet
{
	Font f1;
public void init()
{
	f1=new Font("Arial",30,Font.BOLD | Font.ITALIC );
}
public void paint(Graphics g)
{
	g.setFont(f1);
	g.drawString("welcome to ada",50,50);
	}
}
import java.awt.*;
import java.applet.*;
public  class cname extends Applet
{
	String name;
	Color c1;
	Font f1;
	TextField  t1;
public void init()
{
	t1=new TextField(20);
	add(t1);
}
public void paint(Graphics g)
{
	c1=new Color(56,76,89);
	g.setColor(c1);
	f1=new Font("Arial Black",Font.BOLD,20);
	g.drawString("ENTER MEMBER NAME!",40,40);
	name=(t1.getText());
	Switch(name){
		case    AMRESH:
		{
			g.drawString("Name:-Amresh kumar singh",40,60);
			g.drawString("Fathers Name:-Awadhesh kumar singh",40,80);
					break;
			}
		case    SHOAN:
		{
			g.drawString("Name:-Shoan kumar singh",40,60);
			g.drawString("Fathers Name:-Sanjay kumar singh",40,80);
					break;
			}
		//default:      g.drawString("Invalied name found this not member in  ngo",40,80);
		//{
			//}
		}
	try
	{
		for(int i=1;1<=20;i++)
		{
			g.drawString("ABHILASHA PARIWAR SWIM SAVI  SANTHA",40,100);
				Thread.sleep(2000);
			g.drawString("",40,100);
				Thread.sleep(2000);
			}
	}
catch(Exception e){}
}
public boolean action(Event s,Object obj)
{
	repaint();
	return(true);
}
}

	
		
			 
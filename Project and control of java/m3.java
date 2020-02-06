import java.awt.*;
import java.applet.*;
public class m3 extends Applet
{
	Color ci;
	Font f1;
	int b;
public void paint(Graphics g)
{
	
	f1=new Font("Arial",Font.BOLD,16);
	g.setFont(f1);
	ci=new Color(50,67,70);
	setBackground(ci);
	g.setColor(Color.RED);
g.drawString("            WELCOME        ",40,40);
f1=new Font("Regular",Font.BOLD|Font.ITALIC,15);
g.setFont(f1);
g.setColor(Color.GREEN);
g.drawString("       	        TO        ",40,60);
f1=new Font("Biondi",Font.ITALIC,15);
g.setFont(f1);
g.setColor(Color.BLUE);
g.drawString("                 ADA  IT        ",40,80);
try
{
	g.setColor(Color.RED);
	for(b=1;b<=30;b++)
	{
		g.drawString("      AMRESH    ",40,20);
			Thread.sleep(1000);
			g.drawString("",40,20);
			Thread.sleep(1000);
}
}//close of try
catch(Exception e)
{
}

   		




}//close paint()
}//close of class




	

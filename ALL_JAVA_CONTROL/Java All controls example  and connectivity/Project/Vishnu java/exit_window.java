package splash_screen;
import java.awt.*;
import java.awt.event.*;

public class exit_window extends Frame
{

	public exit_window( )
	{
		repaint( );
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		
		Font f = new Font("Bookman Old Style",Font.PLAIN,32);
		g.setFont(f);
		g.drawString("Thank You",450,350);
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{ }
		System.exit(0);
		
	}
}
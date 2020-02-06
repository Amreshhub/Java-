package pro;
import java.awt.*;
import java.awt.event.*;

public class thanks extends Frame 
{
	
	public void paint(Graphics g)
	{
		Font f = new Font("Bookman Old Style",Font.PLAIN,36);
		g.setFont(f);
	
		g.drawString("THANKS FOR COMING  MY SHOE CENTRE",75,390);	
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{ }
		System.exit(0);
	}
}
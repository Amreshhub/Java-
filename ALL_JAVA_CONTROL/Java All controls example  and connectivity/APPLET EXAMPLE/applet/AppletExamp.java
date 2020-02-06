import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class AppletExamp extends Applet
{
  public void init()
  {
     setForeground(Color.blue);
     JOptionPane.showMessageDialog(null,"Constructor has been called...");
  }
  public void paint(Graphics g)
  {
    g.drawString("Hello Megasoft",50,50);
    g.drawString("Hello Praveen",50,90);
    
  }
  public void start()
  {
    setBackground(Color.cyan);
    JOptionPane.showMessageDialog(null,"Start has been called...");
  }
  public void stop()
  {
    JOptionPane.showMessageDialog(null,"Stop has been called...");
  }

}

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class radiobutton extends JFrame implements ItemListener
{
   JRadioButton r1,r2;
   Container c;
   ButtonGroup group;
   public radiobutton()
   { 
     c=this.getContentPane();
     c.setLayout(null);
     group=new ButtonGroup();
     r1=new JRadioButton("Blue");
     r2=new JRadioButton("Cyan");
     group.add(r1);
     group.add(r2);
     r1.addItemListener(this);
     r2.addItemListener(this);
     r1.setBounds(50,50,70,20);
     r2.setBounds(50,70,70,20);
     c.add(r1);
     c.add(r2);
   }
  public void itemStateChanged(ItemEvent ie)
  {
     if(r1.isSelected())
     {
         c.setBackground(Color.blue);
         r1.setBackground(Color.blue);
     }
     if(r2.isSelected())
     {
        c.setBackground(Color.cyan); 
        r2.setBackground(Color.cyan);
        
     } 
      
  }
  public static void main(String args[])
  {
     radiobutton rdb1=new radiobutton();
     rdb1.setTitle("Button Operation....");
     int w = Toolkit.getDefaultToolkit().getScreenSize().width;
     int h = Toolkit.getDefaultToolkit().getScreenSize().height;
     rdb1.setSize(w,h);
     rdb1.setVisible(true);
      rdb1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}  

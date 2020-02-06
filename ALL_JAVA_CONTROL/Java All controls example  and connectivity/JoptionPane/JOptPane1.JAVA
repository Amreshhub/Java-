import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class joptpane1 extends JFrame implements ActionListener
{
   JButton b1;
   public joptpane1()
   { 
     Container c=this.getContentPane();
     c.setLayout(null);
     b1=new JButton("Display Dialog");
     b1.setBounds(50,50,120,100);
     b1.addActionListener(this);
     c.add(b1);
  }
  public void actionPerformed(ActionEvent ae)
  {
      
     int result=JOptionPane.showConfirmDialog(null,"Choose yes or no","Choose yes or no",JOptionPane.YES_NO_OPTION);
     if(result==JOptionPane.YES_OPTION)
     {
       JOptionPane.showMessageDialog(null,"You Clicked YES","MESSAGE....",JOptionPane.PLAIN_MESSAGE); 
     }
     if(result==JOptionPane.NO_OPTION)
     {
      JOptionPane.showMessageDialog(null,"You Clicked NO ","MESSAGE....",JOptionPane.ERROR_MESSAGE); 
     }
  }
  public static void main(String args[])
  {
    joptpane1 opt1=new joptpane1();
    opt1.setTitle("Button Operation....");
    opt1.setBounds(100,100,350,200);
    opt1.setVisible(true);
    opt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}  
















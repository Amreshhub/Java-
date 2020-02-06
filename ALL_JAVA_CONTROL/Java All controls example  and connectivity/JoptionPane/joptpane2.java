import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class joptpane2 extends JFrame implements ActionListener
{
   JButton b1;
    public joptpane2()
    { 
     Container c=this.getContentPane();
     c.setLayout(null)  ;
     b1=new JButton("Display Dialog");
     b1.setBounds(30,30,140,20);
     b1.addActionListener(this);
     c.add(b1);
    }
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==b1)
    { 
     String result1=JOptionPane.showInputDialog("Enter the first number");
     String result2=JOptionPane.showInputDialog("Enter the second number");
     String result3;
     int r1=Integer.parseInt(result1);
     int r2=Integer.parseInt(result2);
     int sum=r1+r2;
     result3=String.valueOf(sum);
     JOptionPane.showMessageDialog(null,result3,"MESSAGE....",JOptionPane.PLAIN_MESSAGE); 
    }
   }
  public static void main(String args[])
  {
    joptpane2 opt2=new joptpane2();
    opt2.setTitle("Button Operation....");
    opt2.setBounds(50,50,200,200);
    opt2.setVisible(true);
    opt2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } 
}  

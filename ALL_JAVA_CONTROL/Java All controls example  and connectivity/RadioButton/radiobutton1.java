import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class radiobutton1 extends JFrame implements ItemListener
{
   JRadioButton r1,r2,r3,r4;
   JTextField text;
   ButtonGroup group;
   public radiobutton1()
   { 
     Container c=this.getContentPane();
     c.setLayout(new FlowLayout())  ;
     c.setBackground(Color.cyan);
     
     group=new ButtonGroup();
     text=new JTextField(20);  
     r1=new JRadioButton("Radio 1");
     r2=new JRadioButton("Radio 2");
     r3=new JRadioButton("Radio 3");
     r4=new JRadioButton("Radio 4");
   
     group.add(r1);
     group.add(r2);
     group.add(r3);
     group.add(r4);
    
     r1.addItemListener(this);
     r2.addItemListener(this);
     r3.addItemListener(this);
     r4.addItemListener(this);
     
     c.add(r1);
     c.add(r2);
     c.add(r3);
     c.add(r4);         
     c.add(text);
  }
  public void itemStateChanged(ItemEvent ie)
  {
     if(ie.getItemSelectable()==r1)
         text.setText("You clicked radio 1.");  
     if(ie.getItemSelectable()==r2)
         text.setText("You clicked radio 2.");  
     if(ie.getItemSelectable()==r3)
         text.setText("You clicked radio 3.");  
     if(ie.getItemSelectable()==r4)
         text.setText("You clicked radio 4.");  
  }
  public static void main(String args[])
  {
    radiobutton1 rdb1=new radiobutton1();
    rdb1.setTitle("Button Operation....");
    rdb1.setSize(200,200);
    rdb1.setVisible(true);
    rdb1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}  

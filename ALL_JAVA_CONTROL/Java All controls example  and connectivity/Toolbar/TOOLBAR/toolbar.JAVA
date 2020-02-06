import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class toolbar extends JFrame implements ItemListener
{
  String str;
  Container c;
  JToolBar tb;
  JCheckBox jcb1;
  ButtonGroup group;  
  JRadioButton radio1, radio2, radio3;  
  toolbar()
 {
  c=getContentPane();
  c.setLayout(new BorderLayout());
  c.setBackground(Color.cyan);
  tb=new JToolBar();
  group = new ButtonGroup();
  jcb1=new JCheckBox("Employee");
  radio1 = new JRadioButton("Red");
  radio2 = new JRadioButton("Blue");
  radio3 = new JRadioButton("Green");
  group.add(radio1);
  group.add(radio2);
  group.add(radio3);
  jcb1.addItemListener(this);
  radio1.addItemListener(this);
  radio2.addItemListener(this);
  radio3.addItemListener(this);
  tb.setBackground(Color.red);
  tb.add(jcb1);
  tb.add(radio1);
  tb.add(radio2);
  tb.add(radio3);

  c.add("South",tb);
  
  }

public void itemStateChanged(ItemEvent e) 
{
     if(jcb1.isSelected()==true)
     {
       employee_details lblobj=new employee_details();
       lblobj.setTitle("this is my frist swing programs");
       lblobj.setSize(1000,1000);
       lblobj.setVisible(true);
       lblobj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       jcb1.setSelected(false);  
     }
if (radio1.isSelected()==true) 
     {
       c.setBackground(Color.red);
       }      
else if (radio2.isSelected() == true) 
     {
     c.setBackground(Color.blue);
       }      
else
{
    c.setBackground(Color.green);
 }
           
}


}  
 

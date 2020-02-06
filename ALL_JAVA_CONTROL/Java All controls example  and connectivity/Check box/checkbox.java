import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class checkbox extends JFrame implements ItemListener
{
   JCheckBox check1,check2;
   JTextField text;
   public checkbox()
   { 
     Container c=this.getContentPane();
     c.setLayout(null)  ;
     c.setBackground(Color.cyan);
     
     text=new JTextField();  
     check1=new JCheckBox("Check 1");
     check2=new JCheckBox("Check 2");
         
     check1.addItemListener(this);
     check2.addItemListener(this);
      
          
     check1.setBounds(50,50,80,20);
     check2.setBounds(50,70,80,20);
     text.setBounds(50,110,120,20);
     c.add(check1);
     c.add(check2);
     c.add(text);
  }
  public void itemStateChanged(ItemEvent ie)
  {
     if(check1.isSelected())
     {
         text.setBackground(Color.pink);
         text.setText("You clicked check box 1.");  
         check1.setBackground(Color.cyan);
     } 
	
	if(check2.isSelected())
     {
         text.setBackground(Color.blue);
         text.setText("You clicked check box 2.");  
         check2.setBackground(Color.pink);
     }
     
     
     
      
  }
  public static void main(String args[])
  {
    checkbox chk=new checkbox();
    chk.setTitle("CheckBox Operation....");
    chk.setBounds(300,300,200,250);
    chk.setVisible(true);
    chk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}  

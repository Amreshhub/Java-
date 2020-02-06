import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class checkbox1 extends JFrame implements ItemListener
{
   JCheckBox check1,check2,check3,check4;
   JTextField text;
   public checkbox1()
   { 
     Container c=this.getContentPane();
     c.setLayout(new FlowLayout())  ;
     c.setBackground(Color.cyan);
     
     text=new JTextField(20);  
     check1=new JCheckBox("Check 1");
     check2=new JCheckBox("Check 2");
     check3=new JCheckBox("Check 3");
     check4=new JCheckBox("Check 4");

    
     check1.addItemListener(this);
     check2.addItemListener(this);
     check3.addItemListener(this);
     check4.addItemListener(this);
     
          
     check1.setBackground(Color.green);
     c.add(check1);
     c.add(check2);
     c.add(check3);
     c.add(check4) ;        
     c.add(text);
  }
  public void itemStateChanged(ItemEvent ie)
  {
     if(ie.getItemSelectable()==check1)
     {
         text.setText("You clicked check box 1.");  
         text.setBackground(Color.blue);
     }
     if(ie.getItemSelectable()==check2)
     {
         text.setText("You clicked check box 2.");  
         text.setBackground(Color.cyan);
     }
     if(ie.getItemSelectable()==check3)
     {
         text.setBackground(Color.pink);
         text.setText("You clicked check box 3.");  
     } 
     if(ie.getItemSelectable()==check4)
     {
         text.setBackground(Color.blue);
         text.setText("You clicked check box 4."); 
          check1.setSelected(false); 
          check2.setSelected(false);
          check3.setSelected(false); 
     }
      
  }
  public static void main(String args[])
  {
    checkbox1 chk1=new checkbox1();
    chk1.setTitle("Button Operation....");
    chk1.setSize(200,200);
    chk1.setVisible(true);
    chk1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}  

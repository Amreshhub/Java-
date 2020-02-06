import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class checkbox2 extends JFrame implements ActionListener
{
   JCheckBox check1,check2,check3,check4;
   JTextField text;
   public checkbox2()
   { 
     Container c=this.getContentPane();
     c.setLayout(new FlowLayout())  ;
     c.setBackground(Color.cyan);
     
     text=new JTextField(20);  
     check1=new JCheckBox("Check 1");
     check2=new JCheckBox("Check 2");
     check3=new JCheckBox("Check 3");
     check4=new JCheckBox("Check 4");
    
     check1.addActionListener(this);
     check2.addActionListener(this);
     check3.addActionListener(this);
     check4.addActionListener(this);
     
          
     
     c.add(check1);
     c.add(check2);
     c.add(check3);
     c.add(check4) ;        
     c.add(text);
  }
  public void actionPerformed(ActionEvent ae)
  {
     if(check1.getModel().isSelected()==false)
     {
         text.setText("You clicked check box 1.");  
         text.setBackground(Color.red);
         check1.setBackground(Color.green);
     }
     if(check2.getModel().isSelected())
     {
         text.setText("You clicked check box 2.");  
         text.setBackground(Color.cyan);
         check2.setBackground(Color.red);
     }
     if(check3.isSelected())
     {
         text.setBackground(Color.pink);
         text.setText("You clicked check box 3.");  
         check3.setBackground(Color.cyan);
     } 
     if(check4.getModel().isSelected())
     {
         text.setBackground(Color.blue);
         text.setText("You clicked check box 4.");  
         check4.setBackground(Color.pink);
     }
      
  }
  public static void main(String args[])
  {
    checkbox2 chk2=new checkbox2();
    chk2.setTitle("CheckBox Operation....");
    chk2.setSize(200,200);
    chk2.setVisible(true);
    chk2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}  

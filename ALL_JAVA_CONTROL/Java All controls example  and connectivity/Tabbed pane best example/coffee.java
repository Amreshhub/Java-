package p1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class coffee extends  JPanel implements ActionListener, ItemListener
{
     JLabel  l1,l2,l3,l4,l5,l6,l7;
     JTextField t1,t2,t3,t4,t5;
     JButton b1,b2,b3;
     JRadioButton r1,r2,r3,r4,r5;
     JCheckBox check1;
     ButtonGroup group;
    double qut, rp,iam,st=0;
    double tdu,tax;
    String tdu1;  
     
   public coffee()
   {
      setLayout( null );
      group=new ButtonGroup();
      l1=new JLabel(" PRIYADARSHI COFFEE SHOP");
      l1.setFont(new Font("Helvetica",Font.BOLD,20));
      l1.setForeground(Color.red);
      l1.setVisible(true);
      l1.setBounds(300,50,300,20); 
      
      l2=new JLabel("QUANTITY");
      l2.setFont(new Font("Helvetica",Font.BOLD,15));
      l2.setForeground(Color.black);
      l2.setVisible(true);
      l2.setBounds(310,100,150,20); 
      t1=new JTextField();
      t1.setVisible(true);
      t1.setBounds(440,100,150,25);
      t1.setFont(new Font("Helvetica",Font.BOLD,15));

      
      l3=new JLabel("ITEM AMOUNT");
      l3.setFont(new Font("Helvetica",Font.BOLD,15));
      l3.setForeground(Color.black);
      l3.setVisible(true);
      l3.setBounds(310,130,150,20);
      t2=new JTextField();
      t2.setVisible(true);
      t2.setBounds(440,130,150,25);
      t2.setFont(new Font("Helvetica",Font.BOLD,15));

      l4=new JLabel("SUB TOTAL");
      l4.setFont(new Font("Helvetica",Font.BOLD,15));
      l4.setForeground(Color.black);
      l4.setVisible(true);
      l4.setBounds(310,160,150,20);
      t3=new JTextField();
      t3.setVisible(true);
      t3.setBounds(440,160,150,25);
      t3.setFont(new Font("Helvetica",Font.BOLD,15));
      l5=new  JLabel("TAX");
      l5.setFont(new Font("Helvetica",Font.BOLD,15));
      l5.setForeground(Color.black);
      l5.setVisible(true);
      l5.setBounds(310,190,150,20); 
      t4=new JTextField();
      t4.setVisible(true);
      t4.setBounds(440,190,150,25);
      t4.setFont(new Font("Helvetica",Font.BOLD,15));
      l6=new  JLabel("TOTAL DUES");
      l6.setFont(new Font("Helvetica",Font.BOLD,15));
      l6.setForeground(Color.black);
      l6.setVisible(true);
      l6.setBounds(310,220,150,20); 
      t5=new JTextField();
      t5.setVisible(true);
      t5.setBounds(440,220,150,25);
      t5.setFont(new Font("Helvetica",Font.BOLD,15));  
      l7=new  JLabel("COFFEE TYPE");
      l7.setFont(new Font("Helvetica",Font.BOLD,20));
      l7.setForeground(Color.red);
      l7.setVisible(true);
      l7.setBounds(310,270,150,20);  
      r1=new JRadioButton("cappucino(2/)");
      r1.setBounds(310,300,150,25); 
      r2=new JRadioButton("espress(3/)");
      r2.setBounds(310,330,150,25); 
      r3=new JRadioButton("latte(4/)");
      r3.setBounds(310,360,150,25); 
      r4=new JRadioButton("iced latte(5/)");
      r4.setBounds(310,390,150,25); 
      r5=new JRadioButton("iced cappucino(6/)");
      r5.setBounds(310,420,150,25); 
      b1=new JButton("Cal");
      b1.setBounds(320,460,70,20);
      b1.setForeground(Color.red);
      b1.setMnemonic('c');
      b1.addActionListener(this); 
      b2=new JButton("Clear");
      b2.setBounds(400,460,70,20);
      b2.setForeground(Color.red);
      b2.setMnemonic('l');
      b2.addActionListener(this);
      b3=new JButton("Exit");
      b3.setBounds(480,460,70,20);
      b3.setForeground(Color.red);
      b3.setMnemonic('e');
      b3.addActionListener(this); 
      t1.setText("0");
      t2.setText("0");
      t3.setText("0");
      
      t4.setText("8%");
      t4.setEnabled(false);
      t5.setText("0");
     group.add(r1);
     group.add(r2);
     group.add(r3);
     group.add(r4);
     group.add(r5);
     r1.addItemListener(this);
     r2.addItemListener(this); 
     r3.addItemListener(this); 
     r4.addItemListener(this); 
     r5.addItemListener(this); 
     check1=new JCheckBox("TAX DEDUCTION");
     check1.addItemListener(this);
     check1.setBounds(310,245,150,20);
     //check1.setEnabled(false); 
     check1.setVisible(false); 
  
      add(l1);
      add(l2);
     add(t1);
      add(l3);
      add(t2);
      add(l4);
      add(t3);
      add(l5);
      add(t4);
      add(l6);
      add(t5);
      add(l7);
      add(r1);
      add(r2);
      add(r3);
      add(r4);
      add(r5);
      add(b1);
      add(b2);
      add(b3);
      add(check1);


}
     
  public void itemStateChanged(ItemEvent ie)
{
  if(ie.getItemSelectable()==r1)
          rp=2;
  if(ie.getItemSelectable()==r2)
    rp=3;
  if(ie.getItemSelectable()==r3)
    rp=4;
  if(ie.getItemSelectable()==r4)
     rp=5;
  if(ie.getItemSelectable()==r5)
     rp=6;
  if(check1.isSelected())
    {  
       tax= st*8/100;
       tdu=st-tax;
       tdu1=String.valueOf(tdu);
       t5.setText(tdu1); 
              
    }
  else
     {
        tax=0;
        tdu=st-tax;
        tdu1=String.valueOf(tdu);
        t5.setText(tdu1);
     }

}

      public void actionPerformed(ActionEvent ae)
          {
             
             if(ae.getSource()==b1)
             {
              String iam1,st1;
              qut=Double.parseDouble(t1.getText());
              iam=qut*rp;
              iam1=String.valueOf(iam);
              t2.setText(iam1);
              st=st+iam;
              st1=String.valueOf(st);
              t3.setText(st1);
              t5.setText(st1);
              check1.setVisible(true); 
              
             }
             if(ae.getSource()==b2)
             {
              t1.setText("0");
              t2.setText("0");
              t3.setText("0");
              //t4.setText("0");
              t5.setText("0");
              check1.setVisible(false); 

             }
              if(ae.getSource()==b3)
             {
               
               //dispose();
                            
         
             }
             
            
         }



   

}
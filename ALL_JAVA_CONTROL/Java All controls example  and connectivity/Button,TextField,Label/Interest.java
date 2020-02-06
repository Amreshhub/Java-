package classfile;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Interest extends  JFrame implements ActionListener,Runnable
{
     JLabel  l1,l2,l3,l4,lblhead;
     JTextField t1,t2,t3,t4;
     JProgressBar pbar;
     JButton b1,b2,b3;
     int num1,num2,num3,num4;
     static final int MY_MINIMUM=0;
     static final int MY_MAXIMUM=100;
     public Interest()
     {
      Container c=this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.white);
      pbar = new JProgressBar( );
     pbar.setMinimum(MY_MINIMUM);
     pbar.setMaximum(MY_MAXIMUM);
      l1=new JLabel("PRINCIPAL");
      l1.setFont(new Font("Verdana",Font.BOLD,20));
      l1.setForeground(Color.red);
      l1.setVisible(true);
      l1.setBounds(100,125,200,70); 
      l1.setToolTipText("Principal Amount");
      
         
      l2=new JLabel("RATE");
      l2.setFont(new Font("Helvetica",Font.BOLD,20));
      l2.setForeground(Color.red);
      l2.setVisible(true);
      l2.setBounds(100,160,200,100);
      l2.setToolTipText("Rate");
      
      l3=new JLabel("TIME");
      l3.setFont(new Font("Helvetica",Font.BOLD,20));
      l3.setForeground(Color.red);
      l3.setVisible(true);
      l3.setBounds(100,200,200,100);
      l3.setToolTipText("Time");
      
      l4=new JLabel("INTEREST");
      l4.setFont(new Font("Helvetica",Font.BOLD,20));
      l4.setForeground(Color.red);
      l4.setVisible(true);
      l4.setBounds(100,240,200,100);
      l4.setToolTipText("Interest");
      
      lblhead=new JLabel("PROJECT OF SIMPLE INTEREST");
      lblhead.setFont(new Font("Helvetica",Font.BOLD,30));
      lblhead.setForeground(Color.red);
      lblhead.setVisible(true);
      lblhead.setBounds(70,50,500,100); 
      
      t1=new JTextField();
      t1.setVisible(true);
      t1.setBackground(Color.pink);
      t1.setBounds(350,158,150,25);
      
      t2=new JTextField();
      t2.setVisible(true);
      t2.setBounds(350,200,150,25);
      t2.setBackground(Color.pink);
      
      t3=new JTextField();
      t3.setVisible(true);
      t3.setBounds(350,240,150,25);
      t3.setBackground(Color.pink);
      
      t4=new JTextField();
      t4.setVisible(true);
      t4.setBounds(350,280,150,25);
      t4.setBackground(Color.pink);
      //t4.setEnabled(false);
      t4.setEditable(false); 
      
      b1=new JButton("Cal");
      b1.setBounds(180,350,70,30);
      b2=new JButton("Clear");
      b2.setBounds(275,350,70,30);
      b3=new JButton("Exit");
      b3.setBounds(370,350,70,30);
      b1.addActionListener(this);
      b2.addActionListener(this); 
      b3.addActionListener(this); 
      
      pbar.setBounds(180,400,100,30);

      c.add(l1);
      c.add(t1);
      c.add(l2);
      c.add(t2);
      c.add(l3);
      c.add(t3);
      c.add(l4);
      c.add(t4);
      c.add(b1);
      c.add(b2);
      c.add(b3);
      c.add(lblhead);
      c.add(pbar);
 
   }
	public void run(){}
   public void run1()
  {
       for (int i = MY_MINIMUM; i <= MY_MAXIMUM; i++) 
            try
            {
                pbar.setValue(i);
                //Thread.sleep(100);
            }
            catch(Exception e){}
            
  }
   public void actionPerformed(ActionEvent ae)
          {
             if(ae.getSource()==b1)
             {             
              String result;
              num1=Integer.parseInt(t1.getText());
              num2=Integer.parseInt(t2.getText());
              num3=Integer.parseInt(t3.getText());
              num4=num1*num2*num3/100;
              result=String.valueOf(num4);
              t4.setText(result);
	run1();
             }
             if(ae.getSource()==b2)
             {
              t1.setText("0");
              t2.setText("0");
              t3.setText("0");
              t4.setText("");

             }
              if(ae.getSource()==b3)
             {
               
               System.exit(0);
                        
             }
            
         }

       }



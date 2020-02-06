package classfile;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Square extends  JFrame implements ActionListener
{
     JLabel  l1,l2;
     JTextField t1,t2;
     JButton b1,b2,b3;
     int num1;
     public Square()
     {
      Container c=this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.white);
      
      l1=new JLabel("Enter a number");
      l1.setFont(new Font("Verdana",Font.BOLD,20));
      l1.setForeground(Color.red);
      l1.setVisible(true);
      l1.setBounds(100,125,200,70); 
      l1.setToolTipText("Please enter a number");
      
         
      l2=new JLabel("Square");
      l2.setFont(new Font("Helvetica",Font.BOLD,20));
      l2.setForeground(Color.red);
      l2.setVisible(true);
      l2.setBounds(100,160,200,100);
      l2.setToolTipText("Output is going to display");
      
           
      t1=new JTextField();
      t1.setVisible(true);
      t1.setBackground(Color.pink);
      t1.setBounds(350,158,150,25);
      
      t2=new JTextField();
      t2.setVisible(true);
      t2.setBounds(350,200,150,25);
      t2.setBackground(Color.pink);
      
            
      b1=new JButton("Cal");
      b1.setBounds(180,350,70,30);
      b2=new JButton("Clear");
      b2.setBounds(275,350,70,30);
      b3=new JButton("Exit");
      b3.setBounds(370,350,70,30);
      b1.addActionListener(this);
      b2.addActionListener(this); 
      b3.addActionListener(this); 
      

      c.add(l1);
      c.add(t1);
      c.add(l2);
      c.add(t2);
      c.add(b1);
      c.add(b2);
      c.add(b3);
      
   }
	
   public void actionPerformed(ActionEvent ae)
          {
             if(ae.getSource()==b1)
             {             
              String result;
              num1=Integer.parseInt(t1.getText());
	      num1=num1*num1;
              result=String.valueOf(num1);
              t2.setText(result);
	
             }
             if(ae.getSource()==b2)
             {
              t1.setText("0");
              t2.setText("0");
             }
              if(ae.getSource()==b3)
             {
               
               System.exit(0);
                        
             }
            
         }

       }



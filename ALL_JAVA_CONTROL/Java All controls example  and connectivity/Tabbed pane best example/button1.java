package p1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
   public class button1 extends JPanel implements ActionListener
   {
     JTextField t1,t2,t3;
     JButton b1;
     JButton b2;
     int num1,num2,num3;

     public button1()
     {
       t1=new JTextField(20);
       t1.setVisible(true);

       t2=new JTextField(20);
       t2.setVisible(true);

       t3=new JTextField(20);
       t3.setVisible(true);

       b1=new JButton("Addition");
       b2=new JButton("Subtraction");
       b1.addActionListener(this);
       b2.addActionListener(this);
	add(t1);
	add(t2);
	add(t3);
	add(b1);
	add(b2);       
       }
          public void actionPerformed(ActionEvent ae)
          {
             String msg=new String("Hello from JAVA...");
             if(ae.getSource()==b1)
             {
              String result3;
              num1=Integer.parseInt(t1.getText());
              num2=Integer.parseInt(t2.getText());
              num3=num1+num2;
              result3=String.valueOf(num3);
              t3.setText(result3);
             }
             String msg1=new String("Tata consultancy service..");
             if(ae.getSource()==b2)
             {
              String result3;
              num1=Integer.parseInt(t1.getText());
              num2=Integer.parseInt(t2.getText());
              num3=num1-num2;
              result3=String.valueOf(num3);
              t3.setText(result3);

              }
           }                    
}


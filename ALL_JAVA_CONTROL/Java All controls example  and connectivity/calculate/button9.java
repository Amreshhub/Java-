package p1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
   public class button9 extends JFrame implements ActionListener
   {
     JTextField t1,t2,t3;
     JButton b1;
     JButton b2;
     int num1,num2,num3;

     public button9()
     {
       	Container c=this.getContentPane();
	c.setLayout(null);
	t1=new JTextField();
       	t1.setVisible(true);

       	t2=new JTextField();
       	t2.setVisible(true);

       	t3=new JTextField();
       	t3.setVisible(true);

       	b1=new JButton("Addition");
       	b2=new JButton("Subtraction");
       	b1.addActionListener(this);
       	b2.addActionListener(this);
	t1.setBounds(300,100,100,20);
	t2.setBounds(300,140,100,20);
	t3.setBounds(300,180,100,20);
        b1.setBounds(250,220,80,20);
	b2.setBounds(350,220,100,20);
	c.add(t1);
	c.add(t2);
	c.add(t3);
	c.add(b1);
	c.add(b2);       
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


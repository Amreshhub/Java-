import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class employee_details extends  JFrame implements ActionListener
{
     JLabel  l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
     JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
     JButton b1,b2,b3;
     double bsal,ta,da,hra,totpay,netpay,temp;
     int tax,num1,num2,num3,num4;
     public employee_details()
   {
      Container c=this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.gray);
      l0=new JLabel("EMPLOYEE DETAILS");
      l0.setFont(new Font("Arial Black",Font.BOLD,25));
      l0.setForeground(Color.yellow);
      l0.setVisible(true);
      l0.setBounds(350,35,300,50); 
      l1=new JLabel("Employee Id");
      l1.setFont(new Font("Fixedsys",Font.BOLD,20));
      l1.setForeground(Color.green);
      l1.setVisible(true);
      l1.setBounds(100,125,200,50); 
      l2=new JLabel("Employee Name");
      l2.setFont(new Font("Fixedsys",Font.BOLD,20));
      l2.setForeground(Color.green);
      l2.setVisible(true);
      l2.setBounds(100,160,200,50);
      l3=new JLabel("Employee BasicSalary");
      l3.setFont(new Font("Fixedsys",Font.BOLD,20));
      l3.setForeground(Color.green);
      l3.setVisible(true);
      l3.setBounds(100,195,300,50);
      l4=new JLabel("TA");
      l4.setFont(new Font("Fixedsys",Font.BOLD,20));
      l4.setForeground(Color.green);
      l4.setVisible(true);
      l4.setBounds(100,230,200,50);
      l5=new JLabel("DA");
      l5.setFont(new Font("Fixedsys",Font.BOLD,20));
      l5.setForeground(Color.green);
      l5.setVisible(true);
      l5.setBounds(100,265,200,50);
      l6=new JLabel("HRA");
      l6.setFont(new Font("Fixedsys",Font.BOLD,20));
      l6.setForeground(Color.green);
      l6.setVisible(true);
      l6.setBounds(100,300,200,50);
      l7=new JLabel("Total Payment");
      l7.setFont(new Font("Fixedsys",Font.BOLD,20));
      l7.setForeground(Color.green);
      l7.setVisible(true);
      l7.setBounds(100,335,215,50);
      l8=new JLabel("TAX");
      l8.setFont(new Font("Fixedsys",Font.BOLD,20));
      l8.setForeground(Color.green);
      l8.setVisible(true);
      l8.setBounds(100,370,200,50);
      l9=new JLabel("Net Payment");
      l9.setFont(new Font("Fixedsys",Font.BOLD,20));
      l9.setForeground(Color.green);
      l9.setVisible(true);
      l9.setBounds(100,405,200,50);
      t1=new JTextField();
      t1.setVisible(true);
      t1.setBounds(400,130,150,25);
      t2=new JTextField();
      t2.setVisible(true);
      t2.setBounds(400,165,150,25);
      t3=new JTextField();
      t3.setVisible(true);
      t3.setBounds(400,200,150,25);
      t4=new JTextField();
      t4.setVisible(true);
      t4.setBounds(400,235,150,25);
      t4.setEnabled(false);      
      t5=new JTextField();
      t5.setVisible(true);
      t5.setBounds(400,270,150,25);
      t5.setEnabled(false);      
      t6=new JTextField();
      t6.setVisible(true);
      t6.setBounds(400,305,150,25);
      t6.setEnabled(false);      
      t7=new JTextField();
      t7.setVisible(true);
      t7.setBounds(400,340,150,25);
      t7.setEnabled(false);      
      t8=new JTextField();
      t8.setVisible(true);
      t8.setBounds(400,375,150,25);
      t8.setEnabled(false);      
      t9=new JTextField();
      t9.setVisible(true);
      t9.setBounds(400,410,150,25);
      t9.setEnabled(false);      
      t10=new JTextField();
      t10.setVisible(true);
      t10.setBounds(575,235,50,25);
      t11=new JTextField();
      t11.setVisible(true);
      t11.setBounds(575,270,50,25);
      t12=new JTextField();
      t12.setVisible(true);
      t12.setBounds(575,305,50,25);
      t13=new JTextField();
      t13.setVisible(true);
      t13.setBounds(575,375,50,25);
      b1=new JButton("CALCULATE");
      b1.setBounds(200,480,120,20);
      b1.setForeground(Color.red);
      b1.addActionListener(this); 
      b1.setBackground(Color.cyan);
      b1.setMnemonic('C');      
      b2=new JButton("CLEAR");
      b2.setBounds(370,480,120,20);
      b2.setForeground(Color.red);      
      b2.addActionListener(this);
      b2.setBackground(Color.cyan);      
      b2.setEnabled(false);      
      b2.setMnemonic('C');       
      b3=new JButton("EXIT");
      b3.setBounds(540,480,120,20);
      b3.setForeground(Color.red);      
      b3.addActionListener(this); 
      b3.setBackground(Color.cyan);      
      b3.setMnemonic('E');       
      l10=new JLabel("%");
      l10.setFont(new Font("Fixedsys",Font.BOLD,20));
      l10.setForeground(Color.green);
      l10.setVisible(true);
      l10.setBounds(628,235,25,25); 
      l11=new JLabel("%");
      l11.setFont(new Font("Fixedsys",Font.BOLD,20));
      l11.setForeground(Color.green);
      l11.setVisible(true);
      l11.setBounds(628,270,25,25); 
      l12=new JLabel("%");
      l12.setFont(new Font("Fixedsys",Font.BOLD,20));
      l12.setForeground(Color.green);
      l12.setVisible(true);
      l12.setBounds(628,305,25,25); 
      l13=new JLabel("%");
      l13.setFont(new Font("Fixedsys",Font.BOLD,20));
      l13.setForeground(Color.green);
      l13.setVisible(true);
      l13.setBounds(628,375,25,25); 
      c.add(l0);
      c.add(l1);
      c.add(l2);
      c.add(l3);
      c.add(l4);
      c.add(l5);
      c.add(l5);
      c.add(l6);
      c.add(l7);
      c.add(l8);
      c.add(l9);
      c.add(l10);
      c.add(l11);
      c.add(l12);
      c.add(l13);
      c.add(t1);
      c.add(t2);
      c.add(t3);
      c.add(t4);
      c.add(t5);
      c.add(t6);
      c.add(t7);
      c.add(t8);
      c.add(t9);
      c.add(t10);
      c.add(t11);
      c.add(t12);
      c.add(t13);
      c.add(b1);
      c.add(b2);
      c.add(b3);
    }         

         public void actionPerformed(ActionEvent ae)
          {
             
             if(ae.getSource()==b1)
             {
              String result;
              //t4.setEnabled(true);
              //t5.setEnabled(true);
              //t6.setEnabled(true);
              //t7.setEnabled(true);
              //t8.setEnabled(true);
              //t9.setEnabled(true);
              //b2.setEnabled(true);
              bsal=Integer.parseInt(t3.getText());
              num1=Integer.parseInt(t10.getText());
              num2=Integer.parseInt(t11.getText());
              num3=Integer.parseInt(t12.getText());
              num4=Integer.parseInt(t13.getText());
              //if(num1>=0)
              //b1.setEnabled(true);
              //else
              //b1.setEnabled(false);
              temp=bsal*num1/100;
              result=String.valueOf(temp);
              t4.setText(result);
              ta=temp;
              temp=bsal*num2/100;
              result=String.valueOf(temp);
              t5.setText(result);
              da=temp;
              temp=bsal*num3/100;
              result=String.valueOf(temp);
              t6.setText(result);
              hra=temp;
              totpay=bsal+ta+da+hra;
              result=String.valueOf(totpay);
              t7.setText(result);
              tax=(int)(totpay*num4/100);
              result=String.valueOf(tax);
              t8.setText(result);
              netpay=totpay-tax;
              result=String.valueOf(netpay);
              t9.setText(result);
              b1.setEnabled(false);
              b2.setEnabled(true);
}

            
            
            if(ae.getSource()==b2)
             {
              t1.setText("0");
              t2.setText("0");
              t3.setText("0");
              t4.setText("0");
              t5.setText("0");
              t6.setText("0");
              t7.setText("0");
              t8.setText("0");
              t9.setText("0");
              t10.setText("0");
              t11.setText("0");
              t12.setText("0");
              t13.setText("0");
              b1.setEnabled(true);
              b2.setEnabled(false);
}

              if(ae.getSource()==b3)
             {
               
               dispose();
                        
             }
            
         }
}


import java.awt.event.*;
import java.awt.*;
   public class button1 extends Frame implements ActionListener
   {
     TextField t1,t2,t3;
     Button b1;
     Button b2;
     int num1,num2,num3;
     public button1()
     {
       setLayout(null);
       setBackground(Color.cyan);
       t1=new TextField(20);
       t2=new TextField(20);
       t2.setVisible(true);
       t3=new TextField(20);
  
       b1=new Button("Addition");
       b2=new Button("Subtraction");
       b1.addActionListener(this);
       b2.addActionListener(this);
       
       add(t1);
       add(t2);
       add(t3);
       add(b1);
       add(b2);
       t1.setBounds(150,50,100,30);
       t2.setBounds(150,90,100,30);
       t3.setBounds(150,130,100,30); 
       b1.setBounds(150,170,70,30);
       b2.setBounds(230,170,70,30);		
       
      }
          public void actionPerformed(ActionEvent ae)
          {
             if(ae.getSource()==b1)
             {
              String result3;
              num1=Integer.parseInt(t1.getText());
              num2=Integer.parseInt(t2.getText());
              num3=num1+num2;
              result3=String.valueOf(num3);
              t3.setText(result3);
             }
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
          
               public static void main(String args[])
               {
                 button1 but1=new button1();
                 but1.setTitle("Button Operation...");
                 but1.setSize(400,400);
                 but1.setVisible(true);
                                         
                 }
              
              }


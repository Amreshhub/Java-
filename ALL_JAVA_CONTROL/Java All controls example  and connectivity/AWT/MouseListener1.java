import java.awt.event.*;
import java.awt.*;
//import javax.swing.*;
   public class MouseListener1 extends Frame implements ActionListener,MouseListener
   {
     TextField t1,t2,t3;
     Button b1;
     Button b2;
     int num1,num2,num3;

     public MouseListener1()
     {
       setLayout(new FlowLayout());
       setBackground(Color.cyan);
       t1=new TextField(20);
       t1.setVisible(true);

       t2=new TextField(20);
       t2.setVisible(true);

       t3=new TextField(20);
       t3.setVisible(true);



       b1=new Button("Addition");
       b2=new Button("Subtraction");
       b1.addActionListener(this);
       b2.addActionListener(this);
       b1.addMouseListener(this);

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
           public void mouseEntered(MouseEvent me)
           {
               if(me.getSource()==b1)
                   b1.setForeground(Color.red);
             
           } 
           public void mouseClicked(MouseEvent me)
           {
               //if(me.getSource()==b1)
                  // b1.setBackground(Color.green);
           }
           public void mouseExited(MouseEvent me)
           {
            if(me.getSource()== b1)
                    b1.setForeground(Color.blue);
           }
           public void mouseReleased(MouseEvent me)
           {
            if(me.getSource()==b1)
                    b1.setBackground(Color.blue);
           }
           public void mousePressed(MouseEvent me)
           {
            if(me.getSource()==b1)
                   b1.setBackground(Color.cyan);
            }
               public static void main(String args[])
               {
                 MouseListener1 but1=new MouseListener1();
                 but1.setTitle("Button Operation...");
                 but1.setSize(400,400);
                 but1.setVisible(true);
                   
                        
                 }
              }


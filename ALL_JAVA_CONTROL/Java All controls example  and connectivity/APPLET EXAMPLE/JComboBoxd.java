import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
  public  class JComboBoxd extends JApplet implements ActionListener
   {
      JComboBox box;
      JLabel l1,l2,l3,l4,l5,l6;
      JButton b1,b2;
      JTextField t1,t2,t3,t4,t5;
      String str=null;
      public void init()
      {
         Container c=getContentPane();
         c.setLayout(new FlowLayout());
         b1=new JButton("Calculate");
         b2=new JButton("Clear");
        
                  
         l1=new JLabel("Enter the product id");
         l2=new JLabel("Select the name of product");
         l3=new JLabel("Product Price");
         l4=new JLabel("Discount Percentage");         
         l5=new JLabel("Discount Amount");         
         l6=new JLabel("Selling Price");
         
         t1=new JTextField(20);
         t1.setText("0");
         t2=new JTextField(20);
         t2.setText("0");
         t3=new JTextField(20);
         t3.setText("0");
         t3.setEnabled(false);
         t4=new JTextField(20);
         t4.setEnabled(false);
         t4.setText("0");
         t5=new JTextField(20);        
         t5.setEnabled(false);
         t5.setText("0");
         
         box=new JComboBox();
         box.addItem("Action");
         box.addItem("Bata");
         box.addItem("Liberty");
         box.addItem("Others");
        
         b1.addActionListener(this);
         b2.addActionListener(this);
       
         
         c.add(l1);
         c.add(t1);
         c.add(l2);
         c.add(box);
         c.add(l3);
         c.add(t2);         
         c.add(l4);
         c.add(t3);
         c.add(l5);
         c.add(t4);
         c.add(l6);
         c.add(t5);         
         c.add(b1);
         c.add(b2);
           
        
        }
       
       public void actionPerformed(ActionEvent ae)
      {
          double prod_price=0.0,dist_amt,s_price;
          String dist_per=null;
          int flag=0;
          if(ae.getSource()==b2)
          {
              t1.setText(" ");
              t2.setText(" ");
              t3.setText(" ");
              t4.setText(" ");
              t5.setText(" ");              
          }
            
          
          if(ae.getSource()==b1)
          {
              prod_price=Double.parseDouble(t2.getText());
             
              if(String.valueOf(box.getSelectedItem()).equalsIgnoreCase("BATA"))
              {
                  dist_per="12%";
                  dist_amt=prod_price*.12;
                 
             }                      
             else if(String.valueOf(box.getSelectedItem()).equalsIgnoreCase("LIBERTY"))
             {
                  dist_per="10%";
                  dist_amt=prod_price*.10;
                 
             }                      
             else if(String.valueOf(box.getSelectedItem()).equalsIgnoreCase("ACTION"))
              {
                  dist_per="5%";
                  dist_amt=prod_price*.05;
                  
              }    
             else
             {
                  dist_per="0%";
                  dist_amt=0;
                  
             }                      
          
                 t3.setText(dist_per);
                 t4.setText(String.valueOf(dist_amt));
                 t5.setText(String.valueOf(prod_price-dist_amt));
                  
             
         }  
              
       }
     
     }

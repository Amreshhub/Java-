      import java.awt.*;
      import javax.swing.*;
      import java.awt.event.*;
      public class cofeeShop extends JFrame  implements ActionListener,ItemListener
      {
        JLabel l1,l2,l3,l4,l5;
        JTextField t1,t2,t3,t4,t5;
        JRadioButton r1,r2,r3,r4,r5;
        JCheckBox chk;
        ButtonGroup gr;
        JButton b1,b2,b3;
        double price,qty,s_total=0.0,i_amt,tax;
        public cofeeShop()
        {
          Container c=this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.pink);

          l1=new JLabel("Quantity");
          l1.setFont(new Font("Comic Sans MS",Font.BOLD,18));
          l2=new JLabel("Item Amount");
          l2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
          l3=new JLabel("Subtotal");
          l3.setFont(new Font("Comic Sans MS",Font.BOLD,18));
          l4=new JLabel("Tax");
          l4.setVisible(false);
          l4.setFont(new Font("Comic Sans MS",Font.BOLD,18));
          l5=new JLabel("Total Due");
          l5.setVisible(true);
          l5.setFont(new Font("Comic Sans MS",Font.BOLD,18));

          t1=new JTextField(10);
          t2=new JTextField(10);
          t3=new JTextField(10);
          t4=new JTextField(10);
          t4.setVisible(false);
          t5=new JTextField(10);
          t5.setVisible(true);

          b1=new JButton("Calculate");
          b2=new JButton("Clear");
          b3=new JButton("Exit");

          ButtonGroup gr=new ButtonGroup();
          r1=new JRadioButton("cappuccino");
          r2=new JRadioButton("Espresso");
          r3=new JRadioButton("Latte");
          r4=new JRadioButton("Iced Latte");
          r5=new JRadioButton("Iced cappuccino");

          gr.add(r1);
          gr.add(r2);
          gr.add(r3);
          gr.add(r4);
          gr.add(r5);

          chk=new JCheckBox("Take Out");
          l1.setBounds(100,100,150,30);
          c.add(l1);
          t1.setBounds(200,100,150,30);
          c.add(t1);
          l2.setBounds(100,150,150,30);
          c.add(l2);
          t2.setBounds(200,150,150,30);
          c.add(t2);
          l3.setBounds(100,200,150,30);
          c.add(l3);
          t3.setBounds(200,200,150,30);
          c.add(t3);
          l4.setBounds(100,250,150,30);
          c.add(l4);
          t4.setBounds(200,250,150,30);
          c.add(t4);
          l5.setBounds(100,300,150,30);
          c.add(l5);
          t5.setBounds(200,300,150,30);
          c.add(t5);
          b1.setBounds(200,350,150,30);
          c.add(b1);
          b2.setBounds(350,350,150,30);
          c.add(b2);
          b3.setBounds(500,350,150,30);
          c.add(b3);
          r1.setBounds(100,400,150,30);
          c.add(r1);
          r2.setBounds(100,450,150,30);
          c.add(r2);
          r3.setBounds(100,500,150,30);
          c.add(r3);
          r4.setBounds(100,550,150,30);
          c.add(r4);
          r5.setBounds(100,600,150,30);
          c.add(r5);
          chk.setBounds(100,650,150,30);
          c.add(chk);
          r1.addItemListener(this);
          r2.addItemListener(this);
          r3.addItemListener(this);
          r4.addItemListener(this);
          r5.addItemListener(this);
          chk.addItemListener(this);
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          }
          public void itemStateChanged(ItemEvent i)
          {
              if(r1.getModel().isSelected())

              price=2;
              
              if(r2.getModel().isSelected())
              price=3;
              

              if(r3.getModel().isSelected())
              price=4;
              

              if(r4.getModel().isSelected())
              price=5;
              

              if(r5.getModel().isSelected())
              price=6;
           if(chk.getModel().isSelected())
           {    
                t4.setVisible(true);
                //t5.setVisible(true);
                l4.setVisible(true);
                //l5.setVisible(true);
                t4.setText("0.08");
                tax=0.08;
                double due=s_total+s_total*tax;
                t5.setText(String.valueOf(due));


            }
            else
             {
                t4.setVisible(false);
               // t5.setVisible(false);
                l4.setVisible(false);
               // l5.setVisible(false);
                tax=0.0;
                double due=s_total+s_total*tax;
                t5.setText(String.valueOf(due));

              }
              }
            public void actionPerformed(ActionEvent a)
            {
            
              if(a.getSource()==b1)
              {
                qty=Double.parseDouble(t1.getText());
                i_amt=qty*price;
                t2.setText(String.valueOf(i_amt));
                s_total=s_total+i_amt;
                double due=s_total+s_total*tax;
                t5.setText(String.valueOf(due));
                t3.setText(String.valueOf(s_total));
              }
              if(a.getSource()==b2)
              {
                 t1.setText(" ");
                 t2.setText(" ");
                 t3.setText(" ");
                 t4.setText(" ");
                 t5.setText(" ");
               }
               if(a.getSource()==b3)
               {
                 System.exit(0);
               }
             }

              public static void main(String a[])
              {
                 cofeeShop m=new cofeeShop();

                  m.setVisible(true);
                  m.setSize(700,600);
                  m.setLocation(100,100);
                  m.setDefaultCloseOperation(m.EXIT_ON_CLOSE);
              }
              }
          
        
          


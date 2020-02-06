import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
 class Interest extends  JFrame implements ActionListener
{
     JLabel  l1,l2,l3,l4,lblhead;
     JTextField t1,t2,t3,t4;
     JButton b1,b2,b3;
     double num1,num2,num3,num4;
	public Object row[][]=new Object[50][5];
	public Object x;
	private int i;
     public Interest()
     {
      	Container c=this.getContentPane();
      	c.setLayout(null);
      	c.setBackground(Color.orange);
	i=0;
      	l1=new JLabel("Product Id");
      	l1.setFont(new Font("Helvetica",Font.BOLD,20));
	l1.setForeground(Color.red);
      	l1.setVisible(true);
      	l1.setBounds(100,125,200,70); 
      	l1.setToolTipText("Principal Amount");
      
      	t1=new JTextField();
      	t1.setVisible(true);
      	t1.setBackground(Color.pink);
      	t1.setBounds(350,158,150,25);
       
      	l2=new JLabel("Product Name");
      	l2.setFont(new Font("Helvetica",Font.BOLD,20));
      	l2.setForeground(Color.red);
      	l2.setVisible(true);
      	l2.setBounds(100,160,200,100);
      	l2.setToolTipText("Rate");
      
      	t2=new JTextField();
      t2.setVisible(true);
      t2.setBounds(350,200,150,25);
      t2.setBackground(Color.pink);
      l3=new JLabel("Cost Price");
      l3.setFont(new Font("Helvetica",Font.BOLD,20));
      l3.setForeground(Color.red);
      l3.setVisible(true);
      l3.setBounds(100,200,200,100);
       l3.setToolTipText("Time");
      t3=new JTextField();
      t3.setVisible(true);
      t3.setBounds(350,240,150,25);
      t3.setBackground(Color.pink);
      l4=new JLabel("Selling Price");
      l4.setFont(new Font("Helvetica",Font.BOLD,20));
      l4.setForeground(Color.red);
      l4.setVisible(true);
      l4.setBounds(100,240,200,100);
      l4.setToolTipText("Interest");
      t4=new JTextField();
      t4.setVisible(true);
      t4.setBounds(350,280,150,25);
      t4.setBackground(Color.pink);
      //t4.setEnabled(false);
      t4.setEditable(false); 
      b1=new JButton("Cal");
      b1.setBounds(180,350,70,30);
      b1.addActionListener(this); 
      b2=new JButton("Submit");
      b2.setBounds(275,350,70,30);
      b2.addActionListener(this);
      b3=new JButton("Exit");
      b3.setBounds(370,350,70,30);
      b3.addActionListener(this); 
      
      lblhead=new JLabel("Table Display");
      lblhead.setFont(new Font("Helvetica",Font.BOLD,30));
      lblhead.setForeground(Color.red);
      lblhead.setVisible(true);
      lblhead.setBounds(70,50,500,100); 
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
    }
   public void actionPerformed(ActionEvent ae)
          {
             if(ae.getSource()==b1)
             {
              		String result;
              		num3=Integer.parseInt(t3.getText());
              		num4=num3-0.04*num3;
              		result=String.valueOf(num4);
              		t4.setText(result);
		row[i][0]=t1.getText();
         		row[i][1]=t2.getText();
         		row[i][2]=t3.getText();
		row[i][3]="4%";
		row[i][4]=t4.getText();
		i++;
             }
             if(ae.getSource()==b2)
             {
	    	Demo O1=new Demo(row);
		int w = Toolkit.getDefaultToolkit().getScreenSize().width;
     	      	int h = Toolkit.getDefaultToolkit().getScreenSize().height;
	      	O1.setSize(w,h);
              		O1.setVisible(true);
              		O1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     }
              if(ae.getSource()==b3)
             	{
                     System.exit(0);          
             	}  
         }
  
     }

class call_interest
{
      public static void main(String args[])
      {
          Interest demo=new Interest();
          demo.setTitle("My File");
          demo.setBounds(200,200,600,500);
          demo.setVisible(true);
          demo.setDefaultCloseOperation(demo.EXIT_ON_CLOSE);
          demo.setResizable(false);
        }
}
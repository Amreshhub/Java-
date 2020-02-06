import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
 public  class checkbox extends  JFrame implements ActionListener, ItemListener 
 {
 	JLabel l1,l2,l3,l4,l5,l6;
 	JTextField  t1,t2,t3,t4;
 	JCheckBox ch1,ch2,ch3;
 	JButton b1,b2;
 	public void de()
 	{ 
 		Font f=new Font("Arial",20,Font.BOLD);
 		setFont(f);
 		l1=new JLabel("Hotal detail");
 		l2=new JLabel("Customer id");
 		l3=new JLabel("Customar Name");
 		l4=new JLabel("Room Charged");
 		l5=new JLabel("Extera Facility");
 		l6=new JLabel("Total charged");
 		
 		t1=new JTextField();
 		t2=new JTextField();
 		t3=new JTextField();
 		t4=new JTextField();
 		
 		ch1=new JCheckBox("TElevison(100/-)");
 		ch2=new JCheckBox("Internet(50/-)");
 		ch3=new JCheckBox("Air Condition(100/-)");
 		
 		b1=new JButton("New");
 		b2=new JButton("Exit");
 		
 		setLayout(null);
 		setBounds(20,20,600,600);
 		//setBackground(Color.PINK);
 		show();
 		l1.setBounds(250,50,100,100);
 		l2.setBounds(100,130,100,100);
 		t1.setBounds(220,160,100,30);
 		l3.setBounds(100,200,100,30);
 		t2.setBounds(220,200,100,30);
 		l4.setBounds(100,230,100,30);
 		t3.setBounds(220,240,100,30);
 		l5.setBounds(100,280,100,30);
 		ch1.setBounds(210,280,140,30);
 		ch2.setBounds(210,310,140,30);
 		ch3.setBounds(210,340,140,30);
 		l6.setBounds(100,380,100,30);
 		t4.setBounds(210,380,100,30);
 		b1.setBounds(20,500,60,30);
 		b2.setBounds(480,500,60,30);
 				
 		b1.addActionListener(this);
 		b2.addActionListener(this);
 		
 		ch1.addItemListener(this);
 		ch2.addItemListener(this);
 		
 		add(l1);
 		add(l2);
 		add(l3);
 		add(l4);
 		add(l5);
 		add(l6);
 		add(t1);
 		add(t2);
 		add(t3);
 		add(t4);
 		add(ch1);
 		add(ch2);
 		add(ch3);
 		add(b1);
 		add(b2);
 		
 		
 		
 	}
 
 public void actionPerformed(ActionEvent a)
 {
 	if(a.getSource()==b1)
 	{
 		
 	}
 	if(a.getSource()==b2)
 	{
 		System.exit(0);
 	}
 }
 public void itemStateChanged(ItemEvent e)
 {
 }
 
 
 
 //class checkbox()
 //{
 
 public static  void main(String args[])
 	
 {
 	checkbox c=new checkbox();
 	c.de();
 	c.setBackground(Color.PINK);
 	
 }
 }
 
// }
 
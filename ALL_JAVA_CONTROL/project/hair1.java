import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class hair extends JFrame implements ItemListener,ActionListener
{
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	JLabel  l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4,t5,t6;
	Checkbox  rb1,rb2;
public  void d()
{
	
	cb1=new JCheckBox("Make Over(150/-)");
	cb2=new JCheckBox("Hair Style(100/-)");
	cb3=new JCheckBox("Mane cure(90/-)");
	cb4=new JCheckBox("Permanerd Makup(50/-)");
	cb5=new JCheckBox("Reguler Servies");
	
	rb1=new Checkbox("10 persent 10%");
	rb1=new Checkbox("20 persent 20%");
	
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	
	l1=new JLabel("Hair Desging");
	l2=new JLabel("Total price");
	l3=new JLabel("Paid Amount");
	l4=new JLabel("Total customer");
	l5=new JLabel("Total Amount had to make");
	l6=new JLabel("Total Amount has been paid");
	l7=new JLabel("Rest Amount");
	
	b1=new JButton("Report");
	b2=new JButton("Clear");
	b3=new JButton("Exit");
	b4=new JButton("New");
	
	setLayout(null);
	setBounds(10,10,700,700);
	show();
	
	l1.setBounds(40,100,100,30);
	cb1.setBounds(40,20,200,30);
	cb2.setBounds(40,50,200,30);
	cb3.setBounds(40,80,200,30);
	cb4.setBounds(40,110,200,30);
	cb5.setBounds(20,150,200,30);
	
	rb1.setBounds(30,190,200,30);
	rb2.setBounds(30,230,200,30);
	
	l1.setBounds(30,260,200,30);
	t1.setBounds(240,260,100,30);
	
	l2.setBounds(30,290,200,30);
	t2.setBounds(240,290,100,30);
	
	b1.setBounds(20,330,100,20);
	b2.setBounds(130,330,100,20);
	b3.setBounds(240,330,100,20);
	b4.setBounds(350,330,100,20);
	
	l4.setBounds(15,360,200,30);
	t3.setBounds(225,360,100,20);
	
	l5.setBounds(15,390,200,30);
	t4.setBounds(225,390,100,20);
	l6.setBounds(15,420,200,30);
	t5.setBounds(225,420,100,20);
	l7.setBounds(15,450,200,30);
	t6.setBounds(225,450,100,20);
		
	
	cb1.addItemListener(this);
	cb2.addItemListener(this);
	cb3.addItemListener(this);
	cb4.addItemListener(this);
	cb5.addItemListener(this);
	
	rb1.addItemListener(this);
	rb2.addItemListener(this);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	add(cb1);
	add(cb2);
	add(cb3);
	add(cb4);
	add(cb5);
	
	add(rb1);
	add(rb2);
	
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	add(t6);
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(l7);
	
	
	
}
public void itemStateChanged(ItemEvent ie)
{
}
public  void actionPerformed(ActionEvent ae)
{
}		
}
class hair1
{
	public static void main(String args[])
	{
		hair h1=new hair();
		h1.d();
		
	}
}
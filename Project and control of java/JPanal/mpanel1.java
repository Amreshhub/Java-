import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class show1 extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel  l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;

	String name;
	String course;
	double fee;
	int roll;

public void d()
{
	p1=new JPanel();
//	Border br1=BorderFactroy.CreateTitleldBorder("Entery");
//	p1.setBorder(br1);
	p2=new JPanel();
//	Border br2=BorderFactroy.CreateTitleldBorder("Display");
//	p2.setBorder(br2);
	l1=new JLabel("NAME");
	l2=new JLabel("ROLL");
	l3=new JLabel("FEE");
	l4=new JLabel("Course");
	l5=new JLabel("Name");
	l6=new JLabel();
	l7=new JLabel("ROLL");
	l8=new JLabel();
	l9=new JLabel("FEE");
	l10=new JLabel();
	l11=new JLabel("Course");
	l12=new JLabel();
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	b1=new JButton("Accept");
	b2=new JButton("Display");
	
	setLayout(null);
	p1.setLayout(null);
	
	p1.setBounds(20,20,700,300);
	l1.setBounds(40,40,100,30);
	t1.setBounds(150,40,100,30);
	l2.setBounds(270,40,100,30);
	t2.setBounds(390,40,100,30);
	l3.setBounds(40,90,100,30);
	t3.setBounds(150,90,100,30);
	l4.setBounds(270,90,100,30);
	
	
	//t4.setBounds(390,90,100,30);
	
	
	b1.setBounds(40,550,100,40);
	b2.setBounds(200,550,100,40);
	p2.setBounds(20,600,500,200);
	l5.setBounds(40,620,100,30);
	l6.setBounds(150,620,100,30);
	l7.setBounds(270,620,100,30);
	l8.setBounds(290,620,100,30);
	l9.setBounds(40,650,100,30);
	l10.setBounds(150,650,100,30);
	l11.setBounds(270,650,100,30);
	l12.setBounds(390,650,100,30);
	
	add(p1);
	p1.add(l1);
	p1.add(l2);
	p1.add(l3);
	p1.add(l4);
	p1.add(t1);
	p1.add(t2);
	p1.add(t3);
	p1.add(t4);
	add(b1);
	add(b2);
	add(p2);
	p2.add(l5);
	p2.add(l6);
	p2.add(l7);
	p2.add(l8);
	p2.add(l9);
	p2.add(l10);
	p2.add(l11);
	p2.add(l12);


setTitle("Form1");
setBackground(Color.PINK);
setBounds(10,10,1000,1000);
show();
b1.addActionListener(this);
b2.addActionListener(this);
p2.setVisible(false);
}//close of de()
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		name=(t1.getText());
		roll=Integer.parseInt(t2.getText());
		fee=Double.parseDouble(t3.getText());
		course=(t4.getText());
		
	}
	if(ae.getSource()==b2)
	{
		p2.setVisible(true);
		l6.setText(String.valueOf(name));
		l8.setText(String.valueOf(roll));
		l10.setText(String.valueOf(fee));
		l12.setText(String.valueOf(course));
	}
}
}
class mpanel1
{
	public static void main(String args[])
	{
		show1 s=new show1();
		       s.d();
	}
}

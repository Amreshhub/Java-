import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class demo_input extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2,b3;
	String sname=new String();
	int roll;
	float fee;
public void setDesign(){
	p1=new JPanel();;
	p2=new JPanel();
	p1.setLayout(null);
	p2.setLayout(null);
	p1.setBorder(BorderFactory.createTitledBorder("STUDENT RECORD"));
	p2.setBorder(BorderFactory.createTitledBorder("SHOW BUTTON"));
	l1=new JLabel("NAME");
	l2=new JLabel("ROLL");
	l3=new JLabel("FEE");
	l4=new JLabel();
	l5=new JLabel();
	l6=new JLabel();
	b1=new JButton("INPUT");
	b2=new JButton("PRINT");
	b3=new JButton("EXIT");
	p1.setBackground(Color.CYAN);
	p2.setBackground(Color.GREEN);
	setBackground(Color.BLUE);
	setLayout(null);
	setBounds(20,20,700,700);
	show();
	p1.setBounds(30,30,600,200);
	l1.setBounds(10,10,100,30);
	l4.setBounds(130,10,100,30);
	l2.setBounds(10,60,100,30);
	l5.setBounds(130,60,100,30);
	l3.setBounds(10,110,100,30);
	l6.setBounds(130,110,100,30);
	p2.setBounds(30,250,600,200);
	b1.setBounds(80,80,100,20);
	b2.setBounds(220,80,100,20);
	b3.setBounds(370,80,100,20);
	
	add(p1);
	p1.add(l1);
	p1.add(l2);
	p1.add(l3);
	p1.add(l4);
	p1.add(l5);
	p1.add(l6);
	add(p2);
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	//add(b1);
	//add(b2);
	//add(b3);
setTitle("DEMO INPUT BOX");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}//close of de
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		sname=JOptionPane.showInputDialog(null,"Enter Student name");
		roll=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter student Roll"));
		fee=Float.valueOf(JOptionPane.showInputDialog(null,"Enter Fee of student")).floatValue();
		}
	if(ae.getSource()==b2)
	{
		l4.setText(sname);
		l5.setText(String.valueOf(roll));
		l6.setText(String.valueOf(fee));
		}
	if(ae.getSource()==b3)
	{
		System.exit(0);
	}
}//close of action
}//close of class
class demo_input1
{
	public static void main(String args[])
	{
		demo_input d=new demo_input();
		d.setDesign();
	}
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class from3 extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3;
	JButton b1,b2;
	JTextField t1,t2,t3;
	
	String code;
	String name;
	double sal;
public void de()
{
	p1=new JPanel();
p1.setBorder(BorderFactory.createTitledBorder("Entery"));
	l1=new JLabel("Code");
	l2=new JLabel("Name");
	l3=new JLabel("Sallary");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	b1=new JButton("Entery");
	b2=new JButton("Close");
	
	p1.setLayout(null);
	add(p1);
	p1.add(l1);
	p1.add(l2);
	p1.add(l3);
	p1.add(t1);
	p1.add(t2);
	p1.add(t3);
	p1.add(b1);
	p1.add(b2);
	
	
p1.setBounds(20,50,300,300);
l1.setBounds(100,100,100,20);
t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);
t2.setBounds(220,140,100,20);
l3.setBounds(100,180,100,20);
t3.setBounds(220,180,100,20);
b1.setBounds(120,220,80,20);
b2.setBounds(280,220,80,20);
p1.setBackground(Color.PINK);
setTitle("EMPLOYEE ENTERY");
setBounds(10,10,600,600);
show();
b1.addActionListener(this);
b2.addActionListener(this);
}//close of de()
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		code=(t1.getText());
		name=(t2.getText());
		sal=Double.parseDouble(t3.getText());
	
	}
	if(ae.getSource()==b2)
	{
		setVisible(false);
	}
	
}//close of action


}//close of class 
//class from3
//{
//	public static void main(String args[])
//	{
//		from f=new from();
//		f.de();
//	}
//}
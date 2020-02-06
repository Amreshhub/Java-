import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class from4 extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1,t2;
	
	String ecode;
	String dep;
	
public void de()
{
	p1=new JPanel();
	p1.setBorder(BorderFactory.createTitledBorder("Entry"));
	  
	l1=new JLabel("Emp_Code");
	l2=new JLabel("Dept");
	t1=new JTextField();
	t2=new JTextField();
	b1=new JButton("Accept");
	b2=new JButton("Close");
	p1.setLayout(null);
	add(p1);
	p1.add(l1);
	p1.add(l2);
	p1.add(t1);
	p1.add(t2);
	p1.add(b1);
	p1.add(b2);
		setLayout(null);



	p1.setBounds(30,30,400,400);
	l1.setBounds(100,100,100,20);
	t1.setBounds(220,100,100,20);
	l2.setBounds(100,140,100,20);
	t2.setBounds(220,140,100,20);
	b1.setBounds(100,340,80,20);
	b2.setBounds(220,340,80,20);
	setTitle("DEPT Entry");
	setBounds(10,10,500,500);
	show();
	p1.setBackground(Color.RED);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	
}//close of de()
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		ecode=(t1.getText());
		dep=(t2.getText());
		
	}
	if(ae.getSource()==b2)
	{
		from2 f2=new from2();
		f2.de();
		f2.setVisible(true);
		setVisible(false);
		
	}
}
}
//class from4
//{
//	public static void main(String args[])
//	{
//		from g=new from();
//		g.de();
		
//	}
//}
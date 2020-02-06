import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class form4 extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	
	String dep;
	double ecode;
	
public void de()
{
	l1=new JLabel("Emp-code");
	l2=new JLabel("Department");
	t1=new JTextField();
	t2=new JTextField();
	b1=new JButton("Accept");
	b2=new JButton("Close");
	
	setLayout(null);
	setBounds(10,10,300,300);
	show();
	setTitle("Department Entry");
	
	l1.setBounds(20,20,100,30);
	t1.setBounds(140,20,100,30);
	l2.setBounds(20,70,100,30);
	t2.setBounds(140,70,100,30);
	b1.setBounds(20,140,80,20);
	b2.setBounds(120,140,80,20);
	
	add(l1);
	add(l2);
	add(t1);
	add(t2);
	add(b1);
	add(b2);
b1.addActionListener(this);
b2.addActionListener(this);

}//close of de
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		dep=(t1.getText());
		ecode=Double.parseDouble(t2.getText());
	}
	if(ae.getSource()==b2)
	{
		form2 f2=new form2();
		f2.setVisible(true);
		f2.de();
		
		setVisible(false);
		
	}
}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class from3 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	
	String code,name;
	double sal;
	
public void de()
{
	l1=new JLabel("Code");
	l2=new JLabel("Name");
	l3=new JLabel("Sallery");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	b1=new JButton("Entery");
	b2=new JButton("Close");
	
	
	setLayout(null);
	setBounds(10,10,500,500);
	show();
	setTitle("Employee Entery");
	
	
	l1.setBounds(30,30,90,30);
	t1.setBounds(140,30,90,30);
	l2.setBounds(30,80,90,30);
	t2.setBounds(140,80,90,30);
	l3.setBounds(30,130,90,30);
	t3.setBounds(140,130,90,30);
	b1.setBounds(40,180,80,30);
	b2.setBounds(140,180,80,30);
	
	add(l1);
	add(l2);
	add(l3);
	add(t1);
	add(t2);
	add(t3);
	add(b1);
	add(b2);
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
		
		form2 f2=new form2();
		f2.setVisible(true);
		f2.de();
		setVisible(false);
		
		
		
		
	}
}

}

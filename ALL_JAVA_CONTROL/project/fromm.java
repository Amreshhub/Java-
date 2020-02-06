import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


 class from1 extends JFrame implements ActionListener
{	
	JPanel p1;
	JLabel l1,l2;
	JPasswordField t2;
	JTextField t1;
	JButton b1,b2;
	String uname=new String();
	String upass=new String();
public void de()
{
	p1=new JPanel();
	l1=new JLabel("USER NAME");
	l2=new JLabel("PASSWORD");
	t1=new JTextField();
	t2=new JPasswordField();
	b1=new JButton("OK");
	b2=new JButton("CENCLE");
	setBackground(Color.GREEN);
	setLayout(null);
	p1.setBackground(Color.getHSBColor(234.0f,128.7f,76.8f));
	p1.setBounds(10,10,280,180);
	l1.setBounds(15,20,100,30);
	t1.setBounds(120,10,120,30);
	l2.setBounds(15,50,100,30);
	t2.setBounds(120,50,120,30);
	b1.setBounds(15,120,80,20);
	b2.setBounds(170,120,80,20);
	
	
	p1.setLayout(null);
	add(p1);
	p1.add(l1);
	p1.add(l2);
	p1.add(t1);
	p1.add(t2);
	p1.add(b1);
	p1.add(b2);
	
b1.addActionListener(this);
b2.addActionListener(this);
setBounds(10,10,320,240);
show();
setTitle("Login Form");
}//close of de()
public void actionPerformed(ActionEvent ae)
{
	uname=(t1.getText());
	upass=(t2.getText());
	if(ae.getSource()==b1)
	{
		if(uname.equals("AMRESH")&&upass.equals("9570918106"))
		{
		
		   tol f2=new tol();
			f2.setVisible(true);
			f2.tool();
			setVisible(false);
		
		
		}
		
			
		
	}
	if(ae.getSource()==b2)
	{
		System.exit(0);
	
	}
}
	
}
//class fromm
//{
//	 public static void main (String args[]) {
//		from1 f=new from1();
//		f.de();
//}
//}
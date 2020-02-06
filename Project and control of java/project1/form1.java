import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class  form1 extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JPasswordField t2;
	JTextField t1;
	JButton b1,b2;
	String uname,upass;
public void de()
{
	l1=new JLabel("User name");
	l2=new JLabel("Password");
	t1=new JTextField();
	t2=new JPasswordField();
	b1=new JButton("Ok");
	b2=new JButton("CENCEL");
	
	
	setLayout(null);
	setBounds(10,10,400,400);
	show();
	l1.setBounds(30,30,100,30);
	t1.setBounds(150,30,100,30);
	l2.setBounds(30,80,100,30);
	t2.setBounds(150,80,100,30);
	b1.setBounds(50,130,60,30);
	b2.setBounds(150,130,100,30);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		
		setTitle("Login window");
	b1.addActionListener(this);
	b2.addActionListener(this);
	
}	
public void actionPerformed(ActionEvent ae)
{
		uname=(t1.getText());
		upass=(t2.getText());
		
	
	if(ae.getSource()==b1)
	{
		
// 		if(uname.equlas("amresh") && upass.equals("anu"))
 		
 				//{
			form2 f2=new form2();
			f2.setVisible(true);
				f2.de();
			setVisible(false);
							
	//}
	//else{
			
	//	}
		
	}	
		
	if(ae.getSource()==b2)
	{
		setVisible(false);
		
	}
}
}


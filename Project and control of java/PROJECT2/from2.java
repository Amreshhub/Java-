import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class from2 extends JFrame implements ActionListener
{
	JMenuBar mb1;
	JMenu m1,m2;
	JMenuItem mi1,mi2,mi3,mi4,mi5;
	
public void de()
{
	mb1=new JMenuBar();
	m1=new JMenu("Entery");
	m2=new JMenu("Show");
	mi1=new JMenuItem("New From");
	mi2=new JMenuItem("Department");
	mi3=new JMenuItem("EXIT");
	mi4=new JMenuItem("DEPARTMENT DETL'S");
	mi5=new JMenuItem("Emp detl");
setJMenuBar(mb1);
mb1.add(m1);
mb1.add(m2);
m1.addSeparator();

m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m2.addSeparator();
m2.add(mi4);
m2.add(mi5);

	m1.setMnemonic('E');
	m2.setMnemonic('S');
	
//	mi1.addSeparator();
//	mi2.addSeparator();
	//creating shortcut key
	KeyStroke kobj=KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK);
	mi1.setAccelerator(kobj);
	KeyStroke kobj1=KeyStroke.getKeyStroke(KeyEvent.VK_D,Event.CTRL_MASK);
	mi2.setAccelerator(kobj1);
	KeyStroke kobj2=KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.CTRL_MASK);
	mi3.setAccelerator(kobj2);
setLayout(null);
	
setBounds(10,10,500,500);
show();
setTitle("MANAGMENT");
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
mi4.addActionListener(this);
mi5.addActionListener(this);		
}//close of de()
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==mi1)
	{
		from3 f3=new from3();
		f3.setVisible(true);
		f3.de();
		//setVisible(false);
		
	}
	if(ae.getSource()==mi2)
	{
		from4 f4=new from4();
		f4.setVisible(true);
		f4.de();
		setVisible(false);
		
		
	}
	if(ae.getSource()==mi3)
	{
		from1 f1=new from1();
		f1.setVisible(true);
		f1.de();
		setVisible(false);
	}
}
} 
//class from2
//{
//	 public static void main (String args[]) {
//	 	from f2=new from();
//	 	f2.de();
	 	
//}
//}
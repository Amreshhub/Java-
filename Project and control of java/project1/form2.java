import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class form2 extends JFrame implements ActionListener
{
	JMenuBar mb1;
	JMenu m1,m2;
	JMenuItem mi1,mi2,mi3,mi4,mi5;
	
public void de()
{
	mb1=new JMenuBar();
	m1=new JMenu("Entry");
	m2=new JMenu("show");
	mi1=new JMenuItem("New Emp");
	mi2=new JMenuItem("Department");
	mi3=new JMenuItem("Exit");
	mi4=new JMenuItem("Emp Detl");
	mi5=new JMenuItem("Dep Detls");
	setLayout(null);
	setJMenuBar(mb1);
	
	m1.setMnemonic('E');
	
	mb1.add(m1);
	mb1.add(m2);
	m1.add(mi1);
	m1.add(mi2);
	
	
	m1.addSeparator();
	
	m1.add(mi3);
	m2.add(mi4);
	m2.add(mi5);
setBounds(10,10,500,500);
show();
setTitle("Employee Manegemant");
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
}//close of de()
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==mi1)
	{
		from3 f3=new from3();
		f3.setVisible(true);
		f3.de();
		setVisible(false);
		
	}
	if(ae.getSource()==mi2)
	{	
	    form4 f4=new form4();
		f4.setVisible(true);
		f4.de();
		setVisible(false);
		
	}
	if(ae.getSource()==mi3)
	{
		
		setVisible(false);
		
	}
	
	
	
}


}
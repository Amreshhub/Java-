//PROJECT 1
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class screen extends JWindow implements ActionListener

{
	Font f1;
	JLabel l1,l2,l3;
public void de()
{	f1=new Font("Aril",Font.BOLD,22);
	l1=new JLabel();
	l2=new JLabel();
	l3=new JLabel();
	setLayout(null);
	l1.setBounds(30,30,200,40);
	l2.setBounds(60,80,50,40);
	l3.setBounds(30,130,200,40);
	        add(l1);
	        add(l2);
	        add(l3);
	setBackground(Color.PINK);
	setBounds(10,10,500,500);
	     show();
}//close of de
public void actionPerformed(ActionEvent ae)
{	
	setFont(f1);
	screen s1=new screen();
	if(ae.getSource()==s1)
	{
		l1.setText("WELCOME"); 
		l2.setText("   TO     ");
		l3.setText("  J.I.T   ");
	}
	try
	{
		Thread.sleep(1000);
		   
 	form1 f=new form1();
	f.setVisible(true);
	f.de();
//	setVisible(false);
	}
catch(Exception c){}
}
}

	
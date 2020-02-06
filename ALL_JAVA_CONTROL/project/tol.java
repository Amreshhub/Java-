import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
  public class tol extends JFrame implements ActionListener
{
		JToolBar tb;
		JButton b1,b2,b3;
		JLabel l1;
public void tool()
{
	Container c=this.getContentPane();
	c.setLayout(new BorderLayout());
	b1=new JButton("Employee Form");
	b1.addActionListener(this);
	b2=new JButton("Hotal Form");
	b2.addActionListener(this);
	
	b3=new JButton("Exit");
	b3.addActionListener(this);
	
	c.setBackground(Color.PINK);
	
	l1=new JLabel();
	l1.setBounds(50,50,40,30);
	
	tb=new JToolBar();
	tb.add(b1);
	tb.add(b2);
	
	c.add("North",tb);
	c.add("Center",l1);
	c.add(b3);
	show();
	setBounds(20,20,500,500);
	setTitle("TOOLBAR OF APPLECTION");
	
}//end of tool
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		empp r=new empp();
		r.design();
		r.setVisible(true);
		setVisible(false);
		
	}
		if(ae.getSource()==b2)
	{
		ho d=new ho();
		d.hot();
		d.setVisible(true);
		setVisible(false);
		
	}
		if(ae.getSource()==b3)
	{
		System.exit(0);
		
	}
}
}
class toolbar
{
	public static void main(String args[])
	{
		tol f=new tol();
		f.tool();
	}
}
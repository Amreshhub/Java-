import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class toolbar extends JFrame implements ActionListener
{
  String str;
  Container c;
  JToolBar tb;
  JButton b1,b2;
  JLabel lbl;
 	public toolbar()
	{
  		c=getContentPane();
  		c.setLayout(new BorderLayout());
  		c.setBackground(Color.cyan);
  		tb=new JToolBar();
  		b1=new JButton("Search");

  		b2=new JButton("Home");
  		tb.setBackground(Color.blue);
  		tb.add(b1);
  		tb.add(b2);
  		lbl=new JLabel();
  		lbl.setFont(new Font("SansSerif",Font.PLAIN,30));
  		c.add("Center",lbl);
		c.add("South",tb);
		b1.addActionListener(this);
  		b2.addActionListener(this);
  	}
 	public void actionPerformed(ActionEvent ae)
	{
   		if(ae.getSource()==b1)
		{
			c.setBackground(Color.blue);
     			str="Search clicked";
		}
    		if(ae.getSource()==b2)
    			str="Home clicked";
      			
		lbl.setText(str);
	}
	public static void main(String args[])
	{
  		toolbar tbd=new toolbar();
  		tbd.setBounds(100,100,400,400);
  		tbd.setVisible(true);
  		tbd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}  
 













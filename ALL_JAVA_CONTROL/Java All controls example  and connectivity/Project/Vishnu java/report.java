package p1;
import splash_screen.exit_window;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class report extends JFrame implements ActionListener
{
	public Container c1 ;
	
	JLabel l3,l4,l5;		
	JTextField tf3,tf4,tf5;
	JButton b4;	
	String str;


	public report(int total_cust,Double total_amount,Double total_dues)
	{
		c1 = this.getContentPane();
		c1.setLayout(null);
		

		

	
		l3 = new JLabel("Total Customer");
		l4 = new JLabel("Total Amount");
		l5 = new JLabel("Total Dues");
		
		l3.setBounds(485,300,112,40);
		l4.setBounds(485,380,112,40);
		l5.setBounds(485,460,112,40);
	
		c1.add(l3);
		c1.add(l4);
		c1.add(l5);

		tf3 = new JTextField( );
		tf4 = new JTextField( );
		tf5 = new JTextField( );

		tf3.setBounds(627,300,150,40);
		tf4.setBounds(627,380,150,40);
		tf5.setBounds(627,460,150,40);

		c1.add(tf3);
		c1.add(tf4);
		c1.add(tf5);

		str = String.valueOf(total_cust);
		tf3.setText(str);
			
			
		str = String.valueOf(total_amount);
		tf4.setText(str);
		
		str = String.valueOf(total_dues);
		tf5.setText(str);

		b4 = new JButton("Exit");
	
		b4.setBounds(571,560,120,40);
		
		c1.add(b4);

		b4.addActionListener(this);

		tf3.setEnabled(false);
		tf4.setEnabled(false);
		tf5.setEnabled(false);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		this.dispose( );	
		exit_window e = new exit_window( );
		e.setVisible(true);
		e.setBounds(0,0,1445,860);
		e.setBackground(Color.blue);
	
	}
}
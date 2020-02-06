import p1.report;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class hair_dressing extends JFrame implements ActionListener
{
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	JRadioButton rb1,rb2;
	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton b1,b2,b3;
	ButtonGroup bg;
	Container c;

	int i,j,n,l,m,cust=0;
	Double amt=0.0,dis=0.0,t_amt=0.0,t_dues=0.0,paid=0.0,tot_amt=0.0;
	String str;
	
	hair_dressing( )
	{
			
		c = this.getContentPane( );
		c.setLayout(null);
		bg = new ButtonGroup( );
	
			
		cb1 = new JCheckBox("MakeOver(125/-)");
		cb2 = new JCheckBox("Hair Styling(60/-)");
		cb3 = new JCheckBox("Maincure(35/-)");
		cb4 = new JCheckBox("Permanent Makeup(200)");
		cb5 = new JCheckBox("Regular Sevice");		
		
		cb1.setBounds(485,60,150,30);
		cb2.setBounds(485,120,180,30);
		cb3.setBounds(485,180,140,30);
		cb4.setBounds(485,240,210,30);
		cb5.setBounds(485,300,150,30);
	
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(cb4);
		c.add(cb5);
	
		rb1 = new JRadioButton("10 percent");
		rb2 = new JRadioButton("20 percent");
	
		rb1.setBounds(515,330,110,30);
		rb2.setBounds(625,330,110,30);

		rb1.setSelected(true);
	
		c.add(rb1);
		c.add(rb2);
		
		bg.add(rb1);
		bg.add(rb2);

		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		l1 = new JLabel("Total Price");
		l2 = new JLabel("Paid Amount");
		
		l1.setBounds(485,390,66,30);
		l2.setBounds(485,450,77,30);
	
		c.add(l1);
		c.add(l2);
	
		tf1 = new JTextField("0.0");
		tf2 = new JTextField("0.0");
		
		
		tf1.setBounds(592,390,150,30);
		tf2.setBounds(592,450,150,30);
	
		c.add(tf1);
		c.add(tf2);
	
		b1 = new JButton("Ok");
		b2 = new JButton("Exit");
		//b3 = new JButton("Exit");
	
		b1.setBounds(485,550,120,30);
		b2.setBounds(635,550,120,30);
		//b3.setBounds(775,550,120,30);
		
		c.add(b1);
		c.add(b2);
		//c.add(b3);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		//b3.addActionListener(this);
	
		cb1.addActionListener(this);		
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		cb4.addActionListener(this);
		cb5.addActionListener(this);
	 
		rb1.setVisible(false);
		rb2.setVisible(false);

		tf1.setEnabled(false);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		str = new String( );

		
		if(j==0)
			if(cb1.isSelected( )==true)
			{
					amt = amt+125.0;
					t_amt = amt;
					j = 1;
			}
		if(cb1.isSelected( )== false)
			if(j==1)
			{
				amt = amt - 125;
				t_amt = amt;
				j=0;
			}
			
		if(l == 0)	
			if(cb2.isSelected( )==true)
			{	
				amt = amt + 60;
				t_amt = amt;
				l = 1;
			}
		
		if(cb2.isSelected( )==false)
			if(l==1)
			{
				amt = amt - 60.0;
				t_amt = amt;
				l = 0;
			}
		
		if(cb3.isSelected( )==true)
			if(m == 0)
			{	
				amt = amt+35.0;
				t_amt = amt;
				m = 1;
			}
		
		if(cb3.isSelected( )== false)
			if(m==1)
			{
				amt = amt -35;
				t_amt = amt;
				m = 0;
			}
		
		if(cb4.isSelected( )==true)
			if(n==0)
			{
				amt = amt+200.0;
				t_amt = amt;
				n =1;
			}

		if(cb4.isSelected( )==false)
		 	if(n == 1)
			{
				amt = amt - 200.0;
				t_amt = amt;
				n = 0;
			}
		if(cb5.isSelected( )==true)
			{
				rb1.setVisible(true);
				rb2.setVisible(true);
				if(rb1.isSelected( )==true)
					dis = amt * 0.1;
				if(rb2.isSelected( )==true)
					dis = amt * 0.2;
				i=1;
				t_amt = amt - dis;

			}

		if(i==1)
		if(cb5.isSelected( )==false)
		{
			rb1.setVisible(false);
			rb2.setVisible(false);
			rb1.setSelected(true);
			if(i == 1)
				t_amt = t_amt + dis;

			i =0;	
		}
			
			str = String.valueOf(t_amt);
			tf1.setText(str);				
		if(ae.getSource( )==b1)
		{	
			tot_amt = tot_amt + t_amt;
			i = 0;
			j = 0;
			l = 0;
			m = 0;
			n = 0;
			str = tf2.getText( );
			paid = Double.valueOf(str);
			t_dues = t_dues + t_amt - paid;
			cb1.setSelected(false);
			cb2.setSelected(false);
			cb3.setSelected(false);
			cb4.setSelected(false);
			cb5.setSelected(false);
			rb1.setVisible(false);
			rb2.setVisible(false);
			rb1.setSelected(true);
			tf1.setText("0.0");
			tf2.setText("0.0");
			amt = 0.0;
			cust = cust+1;
			
		}
		if(ae.getSource( )==b2)
			Exit( );
					
	}
		
	public void Exit( )
	{
			this.dispose( );
			tf1.setText("0.0");

			report r = new report(cust,tot_amt,t_dues);
			r.setVisible(true);
			r.setBounds(0,0,1445,860);
			r.setTitle("Hair Dressing");
		
	}
	
	public static void main(String args[ ])
	{
		hair_dressing h = new hair_dressing( );
		h.setVisible(true);
		h.setBounds(0,0,1445,865);
		h.setTitle("Hair Dressing");
		h.setBackground(Color.cyan);	
	}
}	
					
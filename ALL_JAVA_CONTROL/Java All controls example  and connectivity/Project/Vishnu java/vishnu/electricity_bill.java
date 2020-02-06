import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class electricity_bill extends JFrame implements ActionListener
{
		
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JButton b1,b2,b3;
	JCheckBox cb;
	Container c;
	BorderLayout b = new BorderLayout( );
	String str;
	int m_num,u_cons;
	Double  rpu,b_charge,dis,t_charge;
	
	electricity_bill( )
	{
		c = this.getContentPane( );
			
		
		c.setLayout(null);
		
		l1 = new JLabel("Meter Number");
		l2 = new JLabel("Unit Consumed");
		l3 = new JLabel("Unit Range");
		l4 = new JLabel("Rate Per Unit");
		l5 = new JLabel("Relaxation");
		l6 = new JLabel("Bill Charge");
		l7 = new JLabel("Bill Charge After Relaxation");
		l8 = new JLabel( " Meter_Number Greater Than Zero ");
		l9 = new JLabel("Unit Consumed Must be Greater Than Zero");
		

		l1.setBounds(485,60,120,35);
		l2.setBounds(485,120,130,35);
		l3.setBounds(485,180,100,35);
		l4.setBounds(485,240,130,35);
		l5.setBounds(505,300,100,35);
		l6.setBounds(485,360,110,35);			
		l7.setBounds(485,460,270,35);
		l8.setBounds(815,60,250,35);
		l9.setBounds(815,120,250,35);


		c.add(l1 );
		c.add(l2 );
		c.add(l3 );
		c.add(l4 );
		c.add(l5 );
		c.add(l6 );
		c.add(l7 );
		c.add(l8);
		c.add(l9);

		cb = new JCheckBox( );
		
		cb.setBounds(480,300,20,30);
		c.add(cb );

		tf1 = new JTextField("0");
		tf2 = new JTextField("0");
		tf3 = new JTextField( );
		tf4 = new JTextField( );
		tf5 = new JTextField( );
		tf6 = new JTextField( );
		tf7 = new JTextField( );
		
		tf1.setBounds(645,60,150,35);
		tf2.setBounds(645,120,150,35);
		tf3.setBounds(645,180,150,35);
		tf4.setBounds(645,240,150,35);
		tf5.setBounds(645,300,150,35);
		tf6.setBounds(645,360,150,35);
		tf7.setBounds(645,460,150,35);
		
		c.add(tf1 );
		c.add(tf2 );
		c.add(tf3 );
		c.add(tf4 );
		c.add(tf5 );
		c.add(tf6 );
		c.add(tf7 );

		b1 = new JButton("Calculate");
		b2 = new JButton("Clear");
		b3 = new JButton("Exit");
	
		b1.setBounds(485,550,110,30);
		b2.setBounds(625,550,110,30);
		b3.setBounds(765,550,110,30);

		c.add(b1 );
		c.add(b2 );
		c.add(b3 );
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		cb.addActionListener(this);

		tf3.setEnabled(false);
		tf4.setEnabled(false);
		tf5.setEnabled(false);
		tf5.setVisible(false);
		tf6.setEnabled(false);
		tf7.setVisible(false);
		tf7.setEnabled(false);
		l7.setVisible(false);
		l8.setVisible(false);
		l9.setVisible(false);
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		if(cb.isSelected( )==true)
		{	
			tf5.setText("8%");
			tf5.setVisible(true);
			l7.setVisible(true);
			tf7.setVisible(true);
		}
		else
		{
			tf5.setVisible(false);
			l7.setVisible(false);
			tf7.setVisible(false);
		}
		
		if(ae.getSource( )==b1)
			calculate( );
		
		if(ae.getSource( )==b2)
		{
			tf1.setText("0");
			tf2.setText("0");
			tf3.setText(" ");
			tf4.setText(" ");
			tf5.setVisible(false);
			l7.setVisible(false);
			tf7.setVisible(false);
			tf6.setText(" ");
			tf7.setText(" ");
			cb.setSelected(false);
			l8.setVisible(false);
			l9.setVisible(false);
		}

		if(ae.getSource( )==b3)
			System.exit(0);
		
	}	
			
	public void calculate( )
	{
		
		
		str = String.valueOf(tf1.getText( ));
		m_num =Integer.parseInt(str);
		
		str = String.valueOf(tf2.getText( ));
		u_cons = Integer.parseInt(str);

		if(m_num>0)
			l8.setVisible(false);
		if(u_cons>0)
			l9.setVisible(false);
		if(m_num<=0 || u_cons<=0)
		{
			if(m_num<=0)
			{
				l8.setVisible(true);
				tf3.setText(" ");
				tf4.setText(" ");
				tf5.setVisible(false);
				l7.setVisible(false);
				tf7.setVisible(false);
				tf6.setText(" ");
				tf7.setText(" ");
				cb.setSelected(false);
			}
			 if(u_cons<=0)
			{
		 		l9.setVisible(true);
				tf3.setText(" ");
				tf4.setText(" ");
				tf5.setVisible(false);
				l7.setVisible(false);
				tf7.setVisible(false);
				tf6.setText(" ");
				tf7.setText(" ");
				cb.setSelected(false);
			}
		}
		else
		{
			 if(u_cons>0 && u_cons<=50)
			{
				tf3.setText("1 to 50");
				tf4.setText("5.0");
			}
			else if(u_cons>50 && u_cons<=100)
			{
				tf3.setText("51 to 100");
				tf4.setText("6.0");
			}
			else if(u_cons>100 && u_cons<=150)
			{
				tf3.setText("100 to 150");
				tf4.setText("7.0");
			}
			else if(u_cons>=150 && u_cons<=200)
			{
				tf3.setText("150 to 200");
				tf4.setText("8.0");
			}
			else if(u_cons>200)
			{
				tf3.setText("Above 200");
				tf4.setText("9.0");
			}
			str =tf4.getText( );
			rpu = Double.valueOf(str);
			b_charge = u_cons * rpu;
			str = String.valueOf(b_charge);
			tf6.setText(str);
			dis = b_charge*0.08;	
			t_charge = b_charge - dis;
			str = String.valueOf(t_charge);
			tf7.setText(str);
		}
		
		
			
	}
	
	public static void main(String args[ ])
	{
		electricity_bill e = new electricity_bill( );
		e.setVisible(true);
		
		e.setBounds(0,0,1445,865);
		e.setTitle("Electricity_Bill");
	}
}		
			
		
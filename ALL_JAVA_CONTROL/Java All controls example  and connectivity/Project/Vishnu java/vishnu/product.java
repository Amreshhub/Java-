import pro.thanks;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class product extends JFrame implements ActionListener
{

	JLabel l1,l2,l3,l4,l5;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JComboBox com1;
	JButton b1,b2,b3;

	Container c;
	Font f;

	String str;
	Double p_price=0.0,dis=0.0,s_price=0.0;
	
	public product( )
	{
		c = this.getContentPane( );
		c.setLayout(null);
		f = new Font("Bookman Old Style",Font.PLAIN,16);

		l1 = new  JLabel("Enter the product id");
		l2 = new JLabel("Select the name of product");
		l3 = new JLabel("Product price");
		l4 = new JLabel("Discount Percentage");
		l5 = new JLabel("Selling Price");

		tf1 = new JTextField( );
		tf2 = new JTextField( );
		tf3 = new JTextField("0.0");
		tf4 = new JTextField( );
		tf5 = new JTextField( );

		l1.setBounds(320,60,165,30);
		tf1.setBounds(290,95,225,30);
		l2.setBounds(302,155,221,30);
		tf2.setBounds(272,190,281,30);
		l3.setBounds(358,250,110,30);
		tf3.setBounds(328,285,170,30);
		l4.setBounds(330,345,170,30);
		tf4.setBounds(300,380,230,30);
		l5.setBounds(358,440,110,30);
		tf5.setBounds(328,475,170,30);

		com1 = new JComboBox( );
		com1.setBounds(628,190,100,28);
		c.add(com1);
		com1.setFont(f);

		com1.addItem("Action");
		com1.addItem("Liberty");	
		com1.addItem("Bata");	
		com1.addItem("Others");
	

		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);

		c.add(tf1);
		c.add(tf2);
		c.add(tf3);
		c.add(tf4);
		c.add(tf5);

		b1 = new JButton("Calculate");
		b2 = new JButton("Clear");
		b3 = new JButton("Exit");
	
		b1.setBounds(202,575,120,30);
		b2.setBounds(352,575,120,30);
		b3.setBounds(502,575,120,30);
		
		c.add(b1);
		c.add(b2);
		c.add(b3);

		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		
		tf1.setFont(f);
		tf2.setFont(f);
		tf3.setFont(f);
		tf4.setFont(f);
		tf5.setFont(f);

		l1.setForeground(Color.gray);
		l2.setForeground(Color.gray);
		l3.setForeground(Color.gray);
		l4.setForeground(Color.gray);
		l5.setForeground(Color.gray);
		
		tf4.setEditable(false);
		tf5.setEditable(false);

		com1.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
					
	}


	public void actionPerformed(ActionEvent ae)
	{
	
		str = String.valueOf(com1.getSelectedItem( ));
		tf2.setText(str);

		if(com1.getSelectedItem( )=="Action")
		{
			tf4.setText("10%");
			tf5.setText(" ");
			dis = 0.1;
		}
		if(com1.getSelectedItem( )=="Liberty")
		{
			tf4.setText("8%");
			tf5.setText(" ");
			dis = 0.08;
		}
		if(com1.getSelectedItem( )=="Bata")
		{
			tf4.setText("12%");
			tf5.setText(" ");
			dis = 0.12;
		}
		
		if(com1.getSelectedItem( )=="Others")
		{
			tf4.setText("No Discount");
			tf5.setText(" ");
			dis=0.0;
		}
		
		if(ae.getSource( )==b1)
			calculate( );
		
		if(ae.getSource( )==b2)
		{
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText("0.0");
			tf4.setText(" ");
			tf5.setText(" ");
		}
		
		
		if(ae.getSource( )==b3)
		{
			thanks t = new thanks( );
			t.setBounds(350,100,800,700);
			t.setVisible(true);
			t.setBackground(Color.pink);
			t.setForeground(Color.cyan);
			t.setTitle("MY_SHOE_CENTRE");		
			repaint( );
		}
	
	}

	public void calculate( )
	{
		
		
		str = tf3.getText( );
		p_price = Double.valueOf(str);

		dis = p_price*dis;
		s_price = p_price - dis;
		
		str = String.valueOf(s_price);
		tf5.setText(str);

	}
	public static void main(String args[ ])
	{
		product r = new product( );
		r.setBackground(Color.green);
		r.setVisible(true);
		r.setBounds(350,100,800,700);
		r.setTitle("My Combo Box");
		
	}
}
                                                             				 
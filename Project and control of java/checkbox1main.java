import java.awt.*;
import java.awt.event.*;
class c extends Frame implements ItemListener,ActionListener
{
	TextField t1;
	Checkbox  rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9 ,cb1,cb2,cb3;
	CheckboxGroup cbg1,cbg2;
	Button b1;
public void de()
{
	t1=new TextField();
	cbg1=new CheckboxGroup();
	cbg2=new CheckboxGroup();
	rb1=new Checkbox("BackColor",cbg1,false);
	rb2=new Checkbox("ForeColor",cbg1,false);
	rb3=new Checkbox("Red",cbg2,false);
	rb4=new Checkbox("Green",cbg2,false);
	rb5=new Checkbox("Black",cbg2,false);
	rb6=new Checkbox("Yellow",cbg2,false);
	rb7=new Checkbox("Brown",cbg2,false);
	rb8=new Checkbox("Pink",cbg2,false);
	cb1=new Checkbox("Bold");
	cb2=new Checkbox("Italic");
	cb3=new Checkbox("Underline");
	b1=new Button("Exit");
	
	setLayout(null);
	t1.setBounds(50,30,300,90);
	cb1.setBounds(50,350,60,20);
	rb1.setBounds(110,350,80,20);
	rb2.setBounds(200,350,80,20);
	cb2.setBounds(50,400,60,20);
	rb3.setBounds(110,400,60,20);
	rb4.setBounds(200,400,60,20);
	rb5.setBounds(260,400,60,20);
	cb3.setBounds(50,450,60,20);
	rb6.setBounds(110,450,60,20);
	rb7.setBounds(200,450,60,20);
	rb8.setBounds(260,450,60,20);
	b1.setBounds(400,450,70,30);
	setBounds(20,20,500,500);
	show();
setBackground(Color.GREEN);
wclose w1=new wclose();
addWindowListener(w1);	
	add(t1);
	add(cb1);
	add(cb2);
	add(cb3);
	add(rb1);
	add(rb2);
	add(rb3);
	add(rb4);
	add(rb5);
	add(rb6);
	add(rb7);
	add(rb8);
	add(b1);
b1.addActionListener(this);
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
rb1.addItemListener(this);
rb2.addItemListener(this);
rb3.addItemListener(this);
rb4.addItemListener(this);
rb5.addItemListener(this);
rb6.addItemListener(this);
rb7.addItemListener(this);
rb8.addItemListener(this);

}//close of d()

public void itemStateChanged(ItemEvent ic)
{
	if(cb1.getState())
	{
		t1.setFont(new Font("Arial Black",Font .BOLD,22));
	
	}else{
		t1.setFont(new Font("Arial Black",Font. PLAIN,22));
	}
	
	if(cb2.getState())
	{
		t1.setFont(new Font("Arial Black",Font. ITALIC,22));
	
	}else{
		t1.setFont(new Font("Arial Black",Font. PLAIN,22));
	}
	
	if(cb3.getState())
	{
		t1.setFont(new Font("Arial Black",Font. BOLD,22));
	
	}else{
		t1.setFont(new Font("Arial Black",Font. PLAIN,22));
	}
	
	if(rb3.getState())
	{
		if(rb1.getState())
		{
			t1.setBackground(Color.RED);
		}
	
	
		if(rb2.getState())
		{
			t1.setBackground(Color.RED);
		}
	}

	if(rb4.getState())
	{
		if(rb1.getState())
		{
			t1.setBackground(Color.GREEN);
		}
	
	
		if(rb2.getState())
		{
			t1.setBackground(Color.GREEN);
		}
	}

	if(rb5.getState())
	{
		if(rb1.getState())
		{
			t1.setBackground(Color.BLACK);
		}
	
	
		if(rb2.getState())
		{
			t1.setBackground(Color.BLACK);
		}
	}

	if(rb6.getState())
	{
		if(rb1.getState())
		{
			t1.setBackground(Color.YELLOW);
		}
	
	
		if(rb2.getState())
		{
			t1.setBackground(Color.YELLOW);
		}
	}
	
	//if(rb7.getState())
	//{
	//	if(rb1.getState())
	//	{
	//		t1.setBackground(Color.BROWN);
	//	}
	
	
	//	if(rb2.getState())
	//	{
	//		t1.setBackground(Color.BROWN);
	//	}
	//}

	if(rb8.getState())
	{
		if(rb1.getState())
		{
			t1.setBackground(Color.PINK);
		}
	
	
		if(rb2.getState())
		{
			t1.setBackground(Color.PINK);
		}
	}
	
}
public void actionPerformed(ActionEvent ac)
{
	if(ac.getSource()==b1)
	{
		System.exit(0);
	}
}
}
class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent wc)
	{
		System.exit(0);
	}
}

class checkbox1main
{
	public static void main(String args[])
	{
		c c1=new c();
		c1.de();
	}
}		